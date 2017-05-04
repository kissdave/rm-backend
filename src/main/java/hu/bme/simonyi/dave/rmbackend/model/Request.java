package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Objects;
/**
 * Request
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "requestID")
@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("requestID")
    private Long requestID = null;

    @JsonProperty("eventName")
    private String eventName = null;

    @JsonProperty("eventDescription")
    private String eventDescription = null;

    @JsonProperty("dateFrom")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime dateFrom = null;

    @JsonProperty("dateTo")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime dateTo = null;

    @JsonProperty("handleBefore")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime handleBefore = null;

    @JsonProperty("handleAfter")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime handleAfter = null;

    @JsonProperty("comment")
    private String comment = null;

    @JsonProperty("resource")
    @ManyToOne
    private Resource resource = null;

    @JsonProperty("requestStatus")
    @ManyToOne
    private RequestStatus requestStatus = null;

    @JsonProperty("user")
    @ManyToOne
    private User user = null;

    public Request() {
    }

    public Request requestID(Long requestID) {
        this.requestID = requestID;
        return this;
    }

    /**
     * The identifier of the request, generated automatically by database
     *
     * @return requestID
     **/
    @ApiModelProperty(value = "The identifier of the request, generated automatically by database")
    public Long getRequestID() {
        return requestID;
    }

    public void setRequestID(Long requestID) {
        this.requestID = requestID;
    }

    public Request eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Get eventName
     *
     * @return eventName
     **/
    @ApiModelProperty(value = "")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Request eventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * Get eventDescription
     *
     * @return eventDescription
     **/
    @ApiModelProperty(value = "")
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Request dateFrom(DateTime dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * Get dateFrom
     *
     * @return dateFrom
     **/
    @ApiModelProperty(value = "")
    public DateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(DateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Request dateTo(DateTime dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Get dateTo
     *
     * @return dateTo
     **/
    @ApiModelProperty(value = "")
    public DateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(DateTime dateTo) {
        this.dateTo = dateTo;
    }

    public Request handleBefore(DateTime handleBefore) {
        this.handleBefore = handleBefore;
        return this;
    }

    /**
     * Get handleBefore
     *
     * @return handleBefore
     **/
    @ApiModelProperty(value = "")
    public DateTime getHandleBefore() {
        return handleBefore;
    }

    public void setHandleBefore(DateTime handleBefore) {
        this.handleBefore = handleBefore;
    }

    public Request handleAfter(DateTime handleAfter) {
        this.handleAfter = handleAfter;
        return this;
    }

    /**
     * Get handleAfter
     *
     * @return handleAfter
     **/
    @ApiModelProperty(value = "")
    public DateTime getHandleAfter() {
        return handleAfter;
    }

    public void setHandleAfter(DateTime handleAfter) {
        this.handleAfter = handleAfter;
    }

    public Request comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     **/
    @ApiModelProperty(value = "")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Request resource(Resource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get resource
     *
     * @return resource
     **/
    @ApiModelProperty(value = "")
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Request requestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    /**
     * Get requestStatus
     *
     * @return requestStatus
     **/
    @ApiModelProperty(value = "")
    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Request user(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @ApiModelProperty(value = "")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Request request = (Request) o;
        return Objects.equals(this.requestID, request.requestID) &&
                Objects.equals(this.eventName, request.eventName) &&
                Objects.equals(this.eventDescription, request.eventDescription) &&
                Objects.equals(this.dateFrom, request.dateFrom) &&
                Objects.equals(this.dateTo, request.dateTo) &&
                Objects.equals(this.handleBefore, request.handleBefore) &&
                Objects.equals(this.handleAfter, request.handleAfter) &&
                Objects.equals(this.comment, request.comment) &&
                Objects.equals(this.resource, request.resource) &&
                Objects.equals(this.requestStatus, request.requestStatus) &&
                Objects.equals(this.user, request.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestID, eventName, eventDescription, dateFrom, dateTo, handleBefore, handleAfter, comment, resource, requestStatus, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Request {\n");

        sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    handleBefore: ").append(toIndentedString(handleBefore)).append("\n");
        sb.append("    handleAfter: ").append(toIndentedString(handleAfter)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    requestStatus: ").append(toIndentedString(requestStatus)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

