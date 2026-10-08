package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties   {

    private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName;
    private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
     *
     * @param orgApacheJackrabbitOakAuthenticationAppName orgApacheJackrabbitOakAuthenticationAppName
     * @param orgApacheJackrabbitOakAuthenticationConfigSpiName orgApacheJackrabbitOakAuthenticationConfigSpiName
     */
    public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(
        ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName, 
        ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName
    ) {
        this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
        this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
    }



    /**
     * Get orgApacheJackrabbitOakAuthenticationAppName
     * @return orgApacheJackrabbitOakAuthenticationAppName
     */
    public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationAppName() {
        return orgApacheJackrabbitOakAuthenticationAppName;
    }

    public void setOrgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
        this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
    }

    /**
     * Get orgApacheJackrabbitOakAuthenticationConfigSpiName
     * @return orgApacheJackrabbitOakAuthenticationConfigSpiName
     */
    public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationConfigSpiName() {
        return orgApacheJackrabbitOakAuthenticationConfigSpiName;
    }

    public void setOrgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
        this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {\n");
        
        sb.append("    orgApacheJackrabbitOakAuthenticationAppName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationAppName)).append("\n");
        sb.append("    orgApacheJackrabbitOakAuthenticationConfigSpiName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationConfigSpiName)).append("\n");
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

