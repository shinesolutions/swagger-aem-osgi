package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyArray configRefResourceNames;
    private ConfigNodePropertyArray configRefPropertyNames;
    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
     *
     * @param enabled enabled
     * @param configRefResourceNames configRefResourceNames
     * @param configRefPropertyNames configRefPropertyNames
     * @param serviceRanking serviceRanking
     */
    public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyArray configRefResourceNames, 
        ConfigNodePropertyArray configRefPropertyNames, 
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.enabled = enabled;
        this.configRefResourceNames = configRefResourceNames;
        this.configRefPropertyNames = configRefPropertyNames;
        this.serviceRanking = serviceRanking;
    }



    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get configRefResourceNames
     * @return configRefResourceNames
     */
    public ConfigNodePropertyArray getConfigRefResourceNames() {
        return configRefResourceNames;
    }

    public void setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
        this.configRefResourceNames = configRefResourceNames;
    }

    /**
     * Get configRefPropertyNames
     * @return configRefPropertyNames
     */
    public ConfigNodePropertyArray getConfigRefPropertyNames() {
        return configRefPropertyNames;
    }

    public void setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
        this.configRefPropertyNames = configRefPropertyNames;
    }

    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    configRefResourceNames: ").append(toIndentedString(configRefResourceNames)).append("\n");
        sb.append("    configRefPropertyNames: ").append(toIndentedString(configRefPropertyNames)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

