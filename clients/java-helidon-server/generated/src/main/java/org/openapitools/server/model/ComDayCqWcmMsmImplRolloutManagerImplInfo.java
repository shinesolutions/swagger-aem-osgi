package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ComDayCqWcmMsmImplRolloutManagerImplProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMsmImplRolloutManagerImplInfo   {

    private String pid;
    private String title;
    private String description;
    private ComDayCqWcmMsmImplRolloutManagerImplProperties properties;
    private String additionalProperties;
    private String bundleLocation;
    private String serviceLocation;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMsmImplRolloutManagerImplInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMsmImplRolloutManagerImplInfo.
     *
     * @param pid pid
     * @param title title
     * @param description description
     * @param properties properties
     * @param additionalProperties additionalProperties
     * @param bundleLocation bundleLocation
     * @param serviceLocation serviceLocation
     */
    public ComDayCqWcmMsmImplRolloutManagerImplInfo(
        String pid, 
        String title, 
        String description, 
        ComDayCqWcmMsmImplRolloutManagerImplProperties properties, 
        String additionalProperties, 
        String bundleLocation, 
        String serviceLocation
    ) {
        this.pid = pid;
        this.title = title;
        this.description = description;
        this.properties = properties;
        this.additionalProperties = additionalProperties;
        this.bundleLocation = bundleLocation;
        this.serviceLocation = serviceLocation;
    }



    /**
     * Get pid
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get properties
     * @return properties
     */
    public ComDayCqWcmMsmImplRolloutManagerImplProperties getProperties() {
        return properties;
    }

    public void setProperties(ComDayCqWcmMsmImplRolloutManagerImplProperties properties) {
        this.properties = properties;
    }

    /**
     * Get additionalProperties
     * @return additionalProperties
     */
    public String getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    /**
     * Get bundleLocation
     * @return bundleLocation
     */
    public String getBundleLocation() {
        return bundleLocation;
    }

    public void setBundleLocation(String bundleLocation) {
        this.bundleLocation = bundleLocation;
    }

    /**
     * Get serviceLocation
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMsmImplRolloutManagerImplInfo {\n");
        
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
        sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
        sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

