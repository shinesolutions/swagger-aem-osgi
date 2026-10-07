package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties   {

    private ConfigNodePropertyArray cugSupportedPaths;
    private ConfigNodePropertyBoolean cugEnabled;
    private ConfigNodePropertyInteger configurationRanking;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.
     *
     * @param cugSupportedPaths cugSupportedPaths
     * @param cugEnabled cugEnabled
     * @param configurationRanking configurationRanking
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(
        ConfigNodePropertyArray cugSupportedPaths, 
        ConfigNodePropertyBoolean cugEnabled, 
        ConfigNodePropertyInteger configurationRanking
    ) {
        this.cugSupportedPaths = cugSupportedPaths;
        this.cugEnabled = cugEnabled;
        this.configurationRanking = configurationRanking;
    }



    /**
     * Get cugSupportedPaths
     * @return cugSupportedPaths
     */
    public ConfigNodePropertyArray getCugSupportedPaths() {
        return cugSupportedPaths;
    }

    public void setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
        this.cugSupportedPaths = cugSupportedPaths;
    }

    /**
     * Get cugEnabled
     * @return cugEnabled
     */
    public ConfigNodePropertyBoolean getCugEnabled() {
        return cugEnabled;
    }

    public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
        this.cugEnabled = cugEnabled;
    }

    /**
     * Get configurationRanking
     * @return configurationRanking
     */
    public ConfigNodePropertyInteger getConfigurationRanking() {
        return configurationRanking;
    }

    public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
        this.configurationRanking = configurationRanking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {\n");
        
        sb.append("    cugSupportedPaths: ").append(toIndentedString(cugSupportedPaths)).append("\n");
        sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
        sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
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

