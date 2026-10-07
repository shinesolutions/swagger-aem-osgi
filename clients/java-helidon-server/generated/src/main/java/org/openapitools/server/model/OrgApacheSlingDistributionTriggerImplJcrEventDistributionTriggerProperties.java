package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString path;
    private ConfigNodePropertyArray ignoredPathsPatterns;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyBoolean deep;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
     *
     * @param name name
     * @param path path
     * @param ignoredPathsPatterns ignoredPathsPatterns
     * @param serviceName serviceName
     * @param deep deep
     */
    public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString path, 
        ConfigNodePropertyArray ignoredPathsPatterns, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyBoolean deep
    ) {
        this.name = name;
        this.path = path;
        this.ignoredPathsPatterns = ignoredPathsPatterns;
        this.serviceName = serviceName;
        this.deep = deep;
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
     * Get ignoredPathsPatterns
     * @return ignoredPathsPatterns
     */
    public ConfigNodePropertyArray getIgnoredPathsPatterns() {
        return ignoredPathsPatterns;
    }

    public void setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
        this.ignoredPathsPatterns = ignoredPathsPatterns;
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
     * Get deep
     * @return deep
     */
    public ConfigNodePropertyBoolean getDeep() {
        return deep;
    }

    public void setDeep(ConfigNodePropertyBoolean deep) {
        this.deep = deep;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    ignoredPathsPatterns: ").append(toIndentedString(ignoredPathsPatterns)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    deep: ").append(toIndentedString(deep)).append("\n");
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

