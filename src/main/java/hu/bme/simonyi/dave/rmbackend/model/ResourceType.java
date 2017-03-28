package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by dkiss on 2017. 03. 28..
 */
public class ResourceType   {
    @JsonProperty("resourceTypeID")
    private Long resourceTypeID = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("resources")
    private List<Resource> resources = new ArrayList<Resource>();

    public ResourceType resourceTypeID(Long resourceTypeID) {
        this.resourceTypeID = resourceTypeID;
        return this;
    }

    /**
     * Get resourceTypeID
     * @return resourceTypeID
     **/
    @ApiModelProperty(value = "")
    public Long getResourceTypeID() {
        return resourceTypeID;
    }

    public void setResourceTypeID(Long resourceTypeID) {
        this.resourceTypeID = resourceTypeID;
    }

    public ResourceType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResourceType resources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public ResourceType addResourcesItem(Resource resourcesItem) {
        this.resources.add(resourcesItem);
        return this;
    }

    /**
     * Get resources
     * @return resources
     **/
    @ApiModelProperty(value = "")
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceType resourceType = (ResourceType) o;
        return Objects.equals(this.resourceTypeID, resourceType.resourceTypeID) &&
                Objects.equals(this.name, resourceType.name) &&
                Objects.equals(this.description, resourceType.description) &&
                Objects.equals(this.resources, resourceType.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceTypeID, name, description, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceType {\n");

        sb.append("    resourceTypeID: ").append(toIndentedString(resourceTypeID)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
