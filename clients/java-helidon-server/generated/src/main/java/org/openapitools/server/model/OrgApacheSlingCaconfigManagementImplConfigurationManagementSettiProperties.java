package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties   {

    private ConfigNodePropertyArray ignorePropertyNameRegex;
    private ConfigNodePropertyArray configCollectionPropertiesResourceNames;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
     *
     * @param ignorePropertyNameRegex ignorePropertyNameRegex
     * @param configCollectionPropertiesResourceNames configCollectionPropertiesResourceNames
     */
    public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(
        ConfigNodePropertyArray ignorePropertyNameRegex, 
        ConfigNodePropertyArray configCollectionPropertiesResourceNames
    ) {
        this.ignorePropertyNameRegex = ignorePropertyNameRegex;
        this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
    }



    /**
     * Get ignorePropertyNameRegex
     * @return ignorePropertyNameRegex
     */
    public ConfigNodePropertyArray getIgnorePropertyNameRegex() {
        return ignorePropertyNameRegex;
    }

    public void setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
        this.ignorePropertyNameRegex = ignorePropertyNameRegex;
    }

    /**
     * Get configCollectionPropertiesResourceNames
     * @return configCollectionPropertiesResourceNames
     */
    public ConfigNodePropertyArray getConfigCollectionPropertiesResourceNames() {
        return configCollectionPropertiesResourceNames;
    }

    public void setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
        this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {\n");
        
        sb.append("    ignorePropertyNameRegex: ").append(toIndentedString(ignorePropertyNameRegex)).append("\n");
        sb.append("    configCollectionPropertiesResourceNames: ").append(toIndentedString(configCollectionPropertiesResourceNames)).append("\n");
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

