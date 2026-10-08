package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties   {

    private ConfigNodePropertyString description;
    private ConfigNodePropertyArray overrides;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
     *
     * @param description description
     * @param overrides overrides
     * @param enabled enabled
     * @param serviceRanking serviceRanking
     */
    public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(
        ConfigNodePropertyString description, 
        ConfigNodePropertyArray overrides, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.description = description;
        this.overrides = overrides;
        this.enabled = enabled;
        this.serviceRanking = serviceRanking;
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
     * Get overrides
     * @return overrides
     */
    public ConfigNodePropertyArray getOverrides() {
        return overrides;
    }

    public void setOverrides(ConfigNodePropertyArray overrides) {
        this.overrides = overrides;
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
        sb.append("class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

