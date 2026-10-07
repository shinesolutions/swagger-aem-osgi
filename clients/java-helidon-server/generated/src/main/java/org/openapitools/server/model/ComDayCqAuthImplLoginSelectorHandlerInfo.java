package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ComDayCqAuthImplLoginSelectorHandlerProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAuthImplLoginSelectorHandlerInfo   {

    private String pid;
    private String title;
    private String description;
    private ComDayCqAuthImplLoginSelectorHandlerProperties properties;
    private String bundleLocation;
    private String serviceLocation;

    /**
     * Default constructor.
     */
    public ComDayCqAuthImplLoginSelectorHandlerInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAuthImplLoginSelectorHandlerInfo.
     *
     * @param pid pid
     * @param title title
     * @param description description
     * @param properties properties
     * @param bundleLocation bundleLocation
     * @param serviceLocation serviceLocation
     */
    public ComDayCqAuthImplLoginSelectorHandlerInfo(
        String pid, 
        String title, 
        String description, 
        ComDayCqAuthImplLoginSelectorHandlerProperties properties, 
        String bundleLocation, 
        String serviceLocation
    ) {
        this.pid = pid;
        this.title = title;
        this.description = description;
        this.properties = properties;
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
    public ComDayCqAuthImplLoginSelectorHandlerProperties getProperties() {
        return properties;
    }

    public void setProperties(ComDayCqAuthImplLoginSelectorHandlerProperties properties) {
        this.properties = properties;
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
        sb.append("class ComDayCqAuthImplLoginSelectorHandlerInfo {\n");
        
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

