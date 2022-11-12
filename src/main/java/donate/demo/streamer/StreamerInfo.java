package donate.demo.streamer;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "userId",
        "id",
        "codeId",
        "firstName",
        "lastName",
        "phoneNumber",
        "image",
        "workPlace",
        "workPlaceId",
        "status",
        "reservedFirstName",
        "reservedLastName",
        "reservedPhoneNumber",
        "averageCommission",
        "averagePaidStars",
        "averageUnpaidStars",
        "reviewsCounts",
        "groupDto",
        "hadTransactions"
})
@Generated("jsonschema2pojo")
public class StreamerInfo {

    @JsonProperty("userId")
    private Object userId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("codeId")
    private String codeId;
    @JsonProperty("firstName")
    private Object firstName;
    @JsonProperty("lastName")
    private Object lastName;
    @JsonProperty("phoneNumber")
    private Object phoneNumber;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("workPlace")
    private String workPlace;
    @JsonProperty("workPlaceId")
    private Integer workPlaceId;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("reservedFirstName")
    private Object reservedFirstName;
    @JsonProperty("reservedLastName")
    private Object reservedLastName;
    @JsonProperty("reservedPhoneNumber")
    private Object reservedPhoneNumber;
    @JsonProperty("averageCommission")
    private Object averageCommission;
    @JsonProperty("averagePaidStars")
    private Double averagePaidStars;
    @JsonProperty("averageUnpaidStars")
    private Double averageUnpaidStars;
    @JsonProperty("reviewsCounts")
    private Integer reviewsCounts;
    @JsonProperty("groupDto")
    private Object groupDto;
    @JsonProperty("hadTransactions")
    private Object hadTransactions;

    /**
     * No args constructor for use in serialization
     *
     */
    public StreamerInfo() {
    }

    /**
     *
     * @param lastName
     * @param image
     * @param averageCommission
     * @param averagePaidStars
     * @param reservedLastName
     * @param reviewsCounts
     * @param userId
     * @param groupDto
     * @param workPlaceId
     * @param firstName
     * @param codeId
     * @param reservedPhoneNumber
     * @param phoneNumber
     * @param reservedFirstName
     * @param averageUnpaidStars
     * @param id
     * @param workPlace
     * @param status
     * @param hadTransactions
     */
    public StreamerInfo(Object userId, String id, String codeId, Object firstName, Object lastName, Object phoneNumber, Object image, String workPlace, Integer workPlaceId, Object status, Object reservedFirstName, Object reservedLastName, Object reservedPhoneNumber, Object averageCommission, Double averagePaidStars, Double averageUnpaidStars, Integer reviewsCounts, Object groupDto, Object hadTransactions) {
        super();
        this.userId = userId;
        this.id = id;
        this.codeId = codeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.workPlace = workPlace;
        this.workPlaceId = workPlaceId;
        this.status = status;
        this.reservedFirstName = reservedFirstName;
        this.reservedLastName = reservedLastName;
        this.reservedPhoneNumber = reservedPhoneNumber;
        this.averageCommission = averageCommission;
        this.averagePaidStars = averagePaidStars;
        this.averageUnpaidStars = averageUnpaidStars;
        this.reviewsCounts = reviewsCounts;
        this.groupDto = groupDto;
        this.hadTransactions = hadTransactions;
    }

    @JsonProperty("userId")
    public Object getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("codeId")
    public String getCodeId() {
        return codeId;
    }

    @JsonProperty("codeId")
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    @JsonProperty("firstName")
    public Object getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public Object getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("phoneNumber")
    public Object getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(Object phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("workPlace")
    public String getWorkPlace() {
        return workPlace;
    }

    @JsonProperty("workPlace")
    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @JsonProperty("workPlaceId")
    public Integer getWorkPlaceId() {
        return workPlaceId;
    }

    @JsonProperty("workPlaceId")
    public void setWorkPlaceId(Integer workPlaceId) {
        this.workPlaceId = workPlaceId;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("reservedFirstName")
    public Object getReservedFirstName() {
        return reservedFirstName;
    }

    @JsonProperty("reservedFirstName")
    public void setReservedFirstName(Object reservedFirstName) {
        this.reservedFirstName = reservedFirstName;
    }

    @JsonProperty("reservedLastName")
    public Object getReservedLastName() {
        return reservedLastName;
    }

    @JsonProperty("reservedLastName")
    public void setReservedLastName(Object reservedLastName) {
        this.reservedLastName = reservedLastName;
    }

    @JsonProperty("reservedPhoneNumber")
    public Object getReservedPhoneNumber() {
        return reservedPhoneNumber;
    }

    @JsonProperty("reservedPhoneNumber")
    public void setReservedPhoneNumber(Object reservedPhoneNumber) {
        this.reservedPhoneNumber = reservedPhoneNumber;
    }

    @JsonProperty("averageCommission")
    public Object getAverageCommission() {
        return averageCommission;
    }

    @JsonProperty("averageCommission")
    public void setAverageCommission(Object averageCommission) {
        this.averageCommission = averageCommission;
    }

    @JsonProperty("averagePaidStars")
    public Double getAveragePaidStars() {
        return averagePaidStars;
    }

    @JsonProperty("averagePaidStars")
    public void setAveragePaidStars(Double averagePaidStars) {
        this.averagePaidStars = averagePaidStars;
    }

    @JsonProperty("averageUnpaidStars")
    public Double getAverageUnpaidStars() {
        return averageUnpaidStars;
    }

    @JsonProperty("averageUnpaidStars")
    public void setAverageUnpaidStars(Double averageUnpaidStars) {
        this.averageUnpaidStars = averageUnpaidStars;
    }

    @JsonProperty("reviewsCounts")
    public Integer getReviewsCounts() {
        return reviewsCounts;
    }

    @JsonProperty("reviewsCounts")
    public void setReviewsCounts(Integer reviewsCounts) {
        this.reviewsCounts = reviewsCounts;
    }

    @JsonProperty("groupDto")
    public Object getGroupDto() {
        return groupDto;
    }

    @JsonProperty("groupDto")
    public void setGroupDto(Object groupDto) {
        this.groupDto = groupDto;
    }

    @JsonProperty("hadTransactions")
    public Object getHadTransactions() {
        return hadTransactions;
    }

    @JsonProperty("hadTransactions")
    public void setHadTransactions(Object hadTransactions) {
        this.hadTransactions = hadTransactions;
    }

}
