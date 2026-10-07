package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyArray configPropertyInheritancePropertyNames;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.
     *
     * @param enabled enabled
     * @param configPropertyInheritancePropertyNames configPropertyInheritancePropertyNames
     */
    public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyArray configPropertyInheritancePropertyNames
    ) {
        this.enabled = enabled;
        this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
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
     * Get configPropertyInheritancePropertyNames
     * @return configPropertyInheritancePropertyNames
     */
    public ConfigNodePropertyArray getConfigPropertyInheritancePropertyNames() {
        return configPropertyInheritancePropertyNames;
    }

    public void setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
        this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    configPropertyInheritancePropertyNames: ").append(toIndentedString(configPropertyInheritancePropertyNames)).append("\n");
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

