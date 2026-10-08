package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
     *
     * @param enabled enabled
     * @param serviceRanking serviceRanking
     */
    public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.enabled = enabled;
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
        sb.append("class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {\n");
        
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

