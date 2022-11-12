package donate.demo.streamer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import donate.demo.payment.PaymentInfo;
import okhttp3.*;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("api")
public class StreamerController {

    @Value("${secretKey}")
    private String secretKey;

    @Value("${groupId}")
    private String groupId;

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    @PostMapping("register")
    public String register(@RequestBody PaymentInfo streamerInfo) {
        String registerUrl = "https://admin.netmonet.co/api/external/v1/waiter/registration/data";

        String json = "{" +
                "\"codeId\": null, " +
                "\"sector\": \"tip\", " +
                "\"isDuplicateCodesAllowed\": null, " +
                "\"groupId\": \"" + groupId + "\"," +
                "\"firstName\": \"" + streamerInfo.getFirstName() + "\"," +
                "\"lastName\": \"" + streamerInfo.getLastName() + "\"," +
                "\"phoneNumber\": \"" + streamerInfo.getPhoneNumber() + "\"" +
                "}";

        Request request = new Request.Builder()
                .url(registerUrl)
                .post(okhttp3.RequestBody.create(json, JSON))
                .addHeader("Authorization", "Token " + secretKey)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();

        try (Response response = client.newCall(request).execute()) {
                return response.body().string();
        } catch (IOException e) {
                return "{\"error\": \"error\"}";
        }

    }

    @GetMapping("user/{id}")
    public StreamerInfo getInfo(@PathVariable("id") String id) {
        String infoUrl = "https://admin.netmonet.co/api/external/v1/waiter/" + id;

        Request request = new Request.Builder()
                .url(infoUrl)
                .get()
                .addHeader("Authorization", "Token " + secretKey)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        try (Response response = client.newCall(request).execute()) {
            return mapper.readValue(response.body().string(), StreamerInfo.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("user/{id}/donations")
    public List<DonationInfo> getDonationInfo(@PathVariable("id") String id) {
        String infoUrl = "https://admin.netmonet.co/api/external/v1/waiter/" + id + "/incoming";

        Request request = new Request.Builder()
                .url(infoUrl)
                .get()
                .addHeader("Authorization", "Token " + secretKey)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        try (Response response = client.newCall(request).execute()) {
            String result = Objects.requireNonNull(response.body()).string();
            Map<String, List<Map<String, Object>>> map = mapper.readValue(result, Map.class);
            List<Map<String, Object>> donations = map.get("data");
            return mapper.readValue(mapper.writeValueAsString(donations), new TypeReference<List<DonationInfo>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("user/{id}/status")
    public String getStatus(@PathVariable("id") String id) {
        StreamerInfo streamer = this.getInfo(id);
        if (Objects.equals(streamer.getStatus().toString(), "ACTIVE")) {
            return "{\"status\": true}";
        }
        return "{\"status\": false}";
    }

}
