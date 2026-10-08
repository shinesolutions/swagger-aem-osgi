package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString path;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyString nuggetsPath;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
     *
     * @param name name
     * @param path path
     * @param serviceName serviceName
     * @param nuggetsPath nuggetsPath
     */
    public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString path, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyString nuggetsPath
    ) {
        this.name = name;
        this.path = path;
        this.serviceName = serviceName;
        this.nuggetsPath = nuggetsPath;
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
     * Get nuggetsPath
     * @return nuggetsPath
     */
    public ConfigNodePropertyString getNuggetsPath() {
        return nuggetsPath;
    }

    public void setNuggetsPath(ConfigNodePropertyString nuggetsPath) {
        this.nuggetsPath = nuggetsPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    nuggetsPath: ").append(toIndentedString(nuggetsPath)).append("\n");
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

