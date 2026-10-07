package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString path;
    private ConfigNodePropertyString seconds;
    private ConfigNodePropertyString serviceName;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
     *
     * @param name name
     * @param path path
     * @param seconds seconds
     * @param serviceName serviceName
     */
    public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString path, 
        ConfigNodePropertyString seconds, 
        ConfigNodePropertyString serviceName
    ) {
        this.name = name;
        this.path = path;
        this.seconds = seconds;
        this.serviceName = serviceName;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
     * Get seconds
     * @return seconds
     */
    public ConfigNodePropertyString getSeconds() {
        return seconds;
    }

    public void setSeconds(ConfigNodePropertyString seconds) {
        this.seconds = seconds;
    }

    /**
     * Get serviceName
     * @return serviceName
     */
    public ConfigNodePropertyString getServiceName() {
        return serviceName;
    }

    public void setServiceName(ConfigNodePropertyString serviceName) {
        this.serviceName = serviceName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

