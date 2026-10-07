package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties   {

    private ConfigNodePropertyBoolean enabled;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.
     *
     * @param enabled enabled
     */
    public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties(
        ConfigNodePropertyBoolean enabled
    ) {
        this.enabled = enabled;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

