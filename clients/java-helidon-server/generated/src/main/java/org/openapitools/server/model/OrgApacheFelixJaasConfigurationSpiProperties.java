package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixJaasConfigurationSpiProperties   {

    private ConfigNodePropertyString jaasDefaultRealmName;
    private ConfigNodePropertyString jaasConfigProviderName;
    private ConfigNodePropertyDropDown jaasGlobalConfigPolicy;

    /**
     * Default constructor.
     */
    public OrgApacheFelixJaasConfigurationSpiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixJaasConfigurationSpiProperties.
     *
     * @param jaasDefaultRealmName jaasDefaultRealmName
     * @param jaasConfigProviderName jaasConfigProviderName
     * @param jaasGlobalConfigPolicy jaasGlobalConfigPolicy
     */
    public OrgApacheFelixJaasConfigurationSpiProperties(
        ConfigNodePropertyString jaasDefaultRealmName, 
        ConfigNodePropertyString jaasConfigProviderName, 
        ConfigNodePropertyDropDown jaasGlobalConfigPolicy
    ) {
        this.jaasDefaultRealmName = jaasDefaultRealmName;
        this.jaasConfigProviderName = jaasConfigProviderName;
        this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
    }



    /**
     * Get jaasDefaultRealmName
     * @return jaasDefaultRealmName
     */
    public ConfigNodePropertyString getJaasDefaultRealmName() {
        return jaasDefaultRealmName;
    }

    public void setJaasDefaultRealmName(ConfigNodePropertyString jaasDefaultRealmName) {
        this.jaasDefaultRealmName = jaasDefaultRealmName;
    }

    /**
     * Get jaasConfigProviderName
     * @return jaasConfigProviderName
     */
    public ConfigNodePropertyString getJaasConfigProviderName() {
        return jaasConfigProviderName;
    }

    public void setJaasConfigProviderName(ConfigNodePropertyString jaasConfigProviderName) {
        this.jaasConfigProviderName = jaasConfigProviderName;
    }

    /**
     * Get jaasGlobalConfigPolicy
     * @return jaasGlobalConfigPolicy
     */
    public ConfigNodePropertyDropDown getJaasGlobalConfigPolicy() {
        return jaasGlobalConfigPolicy;
    }

    public void setJaasGlobalConfigPolicy(ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
        this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixJaasConfigurationSpiProperties {\n");
        
        sb.append("    jaasDefaultRealmName: ").append(toIndentedString(jaasDefaultRealmName)).append("\n");
        sb.append("    jaasConfigProviderName: ").append(toIndentedString(jaasConfigProviderName)).append("\n");
        sb.append("    jaasGlobalConfigPolicy: ").append(toIndentedString(jaasGlobalConfigPolicy)).append("\n");
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

