package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RequestStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "requestStatusID")
@Entity
public class RequestStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("requestStatusID")
    private Long requestStatusID = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @OneToMany(mappedBy = "requestStatus", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Request> requests = null;

    public RequestStatus() {
    }

    public RequestStatus requestStatusID(Long requestStatusID) {
        this.requestStatusID = requestStatusID;
        return this;
    }

    /**
     * Get requestStatusID
     *
     * @return requestStatusID
     **/
    @ApiModelProperty(value = "")
    public Long getRequestStatusID() {
        return requestStatusID;
    }

    public void setRequestStatusID(Long requestStatusID) {
        this.requestStatusID = requestStatusID;
    }

    public RequestStatus name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RequestStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RequestStatus requests(List<Request> requests) {
        this.requests = requests;
        return this;
    }

    public RequestStatus addRequestsItem(Request requestsItem) {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }

        this.requests.add(requestsItem);
        return this;
    }

    public RequestStatus removeRequestsItem(Request requestItem) {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }

        this.requests.remove(requestItem);
        return this;
    }

    /**
     * Get requests
     *
     * @return requests
     **/
    @ApiModelProperty(value = "")
    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestStatus requestStatus = (RequestStatus) o;
        return Objects.equals(this.requestStatusID, requestStatus.requestStatusID) &&
                Objects.equals(this.name, requestStatus.name) &&
                Objects.equals(this.description, requestStatus.description) &&
                Objects.equals(this.requests, requestStatus.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestStatusID, name, description, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestStatus {\n");

        sb.append("    requestStatusID: ").append(toIndentedString(requestStatusID)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

