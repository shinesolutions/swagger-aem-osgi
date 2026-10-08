package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString configPath;
    private ConfigNodePropertyArray fallbackPaths;
    private ConfigNodePropertyArray configCollectionInheritancePropertyNames;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
     *
     * @param enabled enabled
     * @param configPath configPath
     * @param fallbackPaths fallbackPaths
     * @param configCollectionInheritancePropertyNames configCollectionInheritancePropertyNames
     */
    public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString configPath, 
        ConfigNodePropertyArray fallbackPaths, 
        ConfigNodePropertyArray configCollectionInheritancePropertyNames
    ) {
        this.enabled = enabled;
        this.configPath = configPath;
        this.fallbackPaths = fallbackPaths;
        this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
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
     * Get configPath
     * @return configPath
     */
    public ConfigNodePropertyString getConfigPath() {
        return configPath;
    }

    public void setConfigPath(ConfigNodePropertyString configPath) {
        this.configPath = configPath;
    }

    /**
     * Get fallbackPaths
     * @return fallbackPaths
     */
    public ConfigNodePropertyArray getFallbackPaths() {
        return fallbackPaths;
    }

    public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
        this.fallbackPaths = fallbackPaths;
    }

    /**
     * Get configCollectionInheritancePropertyNames
     * @return configCollectionInheritancePropertyNames
     */
    public ConfigNodePropertyArray getConfigCollectionInheritancePropertyNames() {
        return configCollectionInheritancePropertyNames;
    }

    public void setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
        this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    configPath: ").append(toIndentedString(configPath)).append("\n");
        sb.append("    fallbackPaths: ").append(toIndentedString(fallbackPaths)).append("\n");
        sb.append("    configCollectionInheritancePropertyNames: ").append(toIndentedString(configCollectionInheritancePropertyNames)).append("\n");
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

