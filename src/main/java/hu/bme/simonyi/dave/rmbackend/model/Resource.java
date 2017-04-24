package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by dkiss on 2017. 03. 28..
 */

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "resourceID")
public class Resource implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("resourceID")
    private Long resourceID = null;

    @JsonProperty("resourceName")
    private String resourceName = null;

    @JsonProperty("resourceDescription")
    private String resourceDescription = null;

    @JsonProperty("active")
    private Boolean active = null;

    @JsonProperty("archived")
    private Boolean archived = null;

    @JsonIgnore
    @ManyToOne
    @JsonProperty("resourceType")
    private ResourceType resourceType = null;

    @OneToMany(mappedBy = "resource", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JsonManagedReference
    @JsonProperty("resourceFaults")
    private List<ResourceFault> resourceFaults = null;

    @OneToMany(mappedBy = "resource", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JsonProperty("requests")
    private List<Request> requests = null;

    public Resource() {
        // Empty constructor for JPA
    }

    public Resource resourceID(Long resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * Get resourceID
     *
     * @return resourceID
     **/
    @ApiModelProperty(value = "")
    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }

    public Resource resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get resourceName
     *
     * @return resourceName
     **/
    @ApiModelProperty(value = "")
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Resource resourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
        return this;
    }

    /**
     * Get resourceDescription
     *
     * @return resourceDescription
     **/
    @ApiModelProperty(value = "")
    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    public Resource active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     *
     * @return active
     **/
    @ApiModelProperty(value = "")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Resource archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get archived
     *
     * @return archived
     **/
    @ApiModelProperty(value = "")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Resource resourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     **/
    @ApiModelProperty(value = "")
    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public Resource resourceFaults(List<ResourceFault> resourceFaults) {
        this.resourceFaults = resourceFaults;
        return this;
    }

    public Resource addResourceFaultsItem(ResourceFault resourceFaultsItem) {
        this.resourceFaults.add(resourceFaultsItem);
        return this;
    }

    /**
     * Get resourceFaults
     *
     * @return resourceFaults
     **/
    @ApiModelProperty(value = "")
    public List<ResourceFault> getResourceFaults() {
        return resourceFaults;
    }

    public void setResourceFaults(List<ResourceFault> resourceFaults) {
        this.resourceFaults = resourceFaults;
    }

    public Resource requests(List<Request> requests) {
        this.requests = requests;
        return this;
    }

    public Resource addRequestsItem(Request requestsItem) {
        if(requests == null) {
            this.requests = new ArrayList<>();
        }

        this.requests.add(requestsItem);
        requestsItem.setResource(this);
        return this;
    }

    public Resource deleteRequestItem(Request requestsItem) {
        if(requests == null) {
            this.requests = new ArrayList<>();
            return null;
        }
        this.requests.remove(requestsItem);
        requestsItem.setResource(null);
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(this.resourceID, resource.resourceID) &&
                Objects.equals(this.resourceName, resource.resourceName) &&
                Objects.equals(this.resourceDescription, resource.resourceDescription) &&
                Objects.equals(this.active, resource.active) &&
                Objects.equals(this.resourceType, resource.resourceType) &&
                Objects.equals(this.resourceFaults, resource.resourceFaults) &&
                Objects.equals(this.requests, resource.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceID, resourceName, resourceDescription, active, resourceType, resourceFaults, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");

        sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceDescription: ").append(toIndentedString(resourceDescription)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceFaults: ").append(toIndentedString(resourceFaults)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public void addResourceFault(ResourceFault resourceFault) {
        if(resourceFaults == null) {
            resourceFaults = new ArrayList<>();
        }

        resourceFaults.add(resourceFault);
        resourceFault.setResource(this);
    }
}


