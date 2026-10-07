package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingFeatureflagsFeatureProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString description;
    private ConfigNodePropertyBoolean enabled;

    /**
     * Default constructor.
     */
    public OrgApacheSlingFeatureflagsFeatureProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingFeatureflagsFeatureProperties.
     *
     * @param name name
     * @param description description
     * @param enabled enabled
     */
    public OrgApacheSlingFeatureflagsFeatureProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString description, 
        ConfigNodePropertyBoolean enabled
    ) {
        this.name = name;
        this.description = description;
        this.enabled = enabled;
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
     * Get description
     * @return description
     */
    public ConfigNodePropertyString getDescription() {
        return description;
    }

    public void setDescription(ConfigNodePropertyString description) {
        this.description = description;
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
        sb.append("class OrgApacheSlingFeatureflagsFeatureProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

