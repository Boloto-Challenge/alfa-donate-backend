package donate.demo.streamer;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "code",
        "lastName",
        "time",
        "message",
        "stars",
        "amount",
        "workPlaceId",
        "workPlaceAliasId",
        "workPlaceName",
        "checkId",
        "commissionFree",
        "highlights",
        "checkSum"
})
@Generated("jsonschema2pojo")
public class DonationInfo {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("stars")
    private Integer stars;
    @JsonProperty("amount")
    private Object amount;
    @JsonProperty("workPlaceId")
    private Integer workPlaceId;
    @JsonProperty("workPlaceAliasId")
    private Object workPlaceAliasId;
    @JsonProperty("workPlaceName")
    private String workPlaceName;
    @JsonProperty("checkId")
    private Object checkId;
    @JsonProperty("commissionFree")
    private Boolean commissionFree;
    @JsonProperty("highlights")
    private Object highlights;
    @JsonProperty("checkSum")
    private Object checkSum;

    /**
     * No args constructor for use in serialization
     *
     */
    public DonationInfo() {
    }

    /**
     *
     * @param lastName
     * @param amount
     * @param code
     * @param stars
     * @param message
     * @param workPlaceId
     * @param commissionFree
     * @param highlights
     * @param name
     * @param checkSum
     * @param workPlaceAliasId
     * @param id
     * @param time
     * @param workPlaceName
     * @param checkId
     */
    public DonationInfo(String id, String name, String code, String lastName, Integer time, Object message, Integer stars, Object amount, Integer workPlaceId, Object workPlaceAliasId, String workPlaceName, Object checkId, Boolean commissionFree, Object highlights, Object checkSum) {
        super();
        this.id = id;
        this.name = name;
        this.code = code;
        this.lastName = lastName;
        this.time = time;
        this.message = message;
        this.stars = stars;
        this.amount = amount;
        this.workPlaceId = workPlaceId;
        this.workPlaceAliasId = workPlaceAliasId;
        this.workPlaceName = workPlaceName;
        this.checkId = checkId;
        this.commissionFree = commissionFree;
        this.highlights = highlights;
        this.checkSum = checkSum;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("stars")
    public Integer getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    @JsonProperty("workPlaceId")
    public Integer getWorkPlaceId() {
        return workPlaceId;
    }

    @JsonProperty("workPlaceId")
    public void setWorkPlaceId(Integer workPlaceId) {
        this.workPlaceId = workPlaceId;
    }

    @JsonProperty("workPlaceAliasId")
    public Object getWorkPlaceAliasId() {
        return workPlaceAliasId;
    }

    @JsonProperty("workPlaceAliasId")
    public void setWorkPlaceAliasId(Object workPlaceAliasId) {
        this.workPlaceAliasId = workPlaceAliasId;
    }

    @JsonProperty("workPlaceName")
    public String getWorkPlaceName() {
        return workPlaceName;
    }

    @JsonProperty("workPlaceName")
    public void setWorkPlaceName(String workPlaceName) {
        this.workPlaceName = workPlaceName;
    }

    @JsonProperty("checkId")
    public Object getCheckId() {
        return checkId;
    }

    @JsonProperty("checkId")
    public void setCheckId(Object checkId) {
        this.checkId = checkId;
    }

    @JsonProperty("commissionFree")
    public Boolean getCommissionFree() {
        return commissionFree;
    }

    @JsonProperty("commissionFree")
    public void setCommissionFree(Boolean commissionFree) {
        this.commissionFree = commissionFree;
    }

    @JsonProperty("highlights")
    public Object getHighlights() {
        return highlights;
    }

    @JsonProperty("highlights")
    public void setHighlights(Object highlights) {
        this.highlights = highlights;
    }

    @JsonProperty("checkSum")
    public Object getCheckSum() {
        return checkSum;
    }

    @JsonProperty("checkSum")
    public void setCheckSum(Object checkSum) {
        this.checkSum = checkSum;
    }

}
