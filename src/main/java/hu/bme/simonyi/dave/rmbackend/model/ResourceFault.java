package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by dkiss on 2017. 03. 28..
 */
@Entity
public class ResourceFault implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("resourceFaultID")
    private Long resourceFaultID = null;

    @JsonProperty("shortDescription")
    private String shortDescription = null;

    @JsonProperty("longDescription")
    private String longDescription = null;

    @JsonProperty("active")
    private Boolean active = null;

    @ManyToOne
    @JsonBackReference
    @JsonProperty("resource")
    private Resource resource = null;

    public ResourceFault() {
        // Empty constructor for JPA
    }

    public ResourceFault resourceFaultID(Long resourceFaultID) {
        this.resourceFaultID = resourceFaultID;
        return this;
    }

    /**
     * Get resourceFaultID
     * @return resourceFaultID
     **/
    @ApiModelProperty(value = "")
    public Long getResourceFaultID() {
        return resourceFaultID;
    }

    public void setResourceFaultID(Long resourceFaultID) {
        this.resourceFaultID = resourceFaultID;
    }

    public ResourceFault shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Get shortDescription
     * @return shortDescription
     **/
    @ApiModelProperty(value = "")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ResourceFault longDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    /**
     * Get longDescription
     * @return longDescription
     **/
    @ApiModelProperty(value = "")
    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public ResourceFault active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     * @return active
     **/
    @ApiModelProperty(value = "")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ResourceFault resource(Resource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get resource
     * @return resource
     **/
    @ApiModelProperty(value = "")
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceFault resourceFault = (ResourceFault) o;
        return Objects.equals(this.resourceFaultID, resourceFault.resourceFaultID) &&
                Objects.equals(this.shortDescription, resourceFault.shortDescription) &&
                Objects.equals(this.longDescription, resourceFault.longDescription) &&
                Objects.equals(this.active, resourceFault.active) &&
                Objects.equals(this.resource, resourceFault.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceFaultID, shortDescription, longDescription, active, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFault {\n");

        sb.append("    resourceFaultID: ").append(toIndentedString(resourceFaultID)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
}

