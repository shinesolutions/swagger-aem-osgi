package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheHttpProxyconfiguratorProperties   {

    private ConfigNodePropertyBoolean proxyEnabled;
    private ConfigNodePropertyString proxyHost;
    private ConfigNodePropertyInteger proxyPort;
    private ConfigNodePropertyString proxyUser;
    private ConfigNodePropertyString proxyPassword;
    private ConfigNodePropertyArray proxyExceptions;

    /**
     * Default constructor.
     */
    public OrgApacheHttpProxyconfiguratorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheHttpProxyconfiguratorProperties.
     *
     * @param proxyEnabled proxyEnabled
     * @param proxyHost proxyHost
     * @param proxyPort proxyPort
     * @param proxyUser proxyUser
     * @param proxyPassword proxyPassword
     * @param proxyExceptions proxyExceptions
     */
    public OrgApacheHttpProxyconfiguratorProperties(
        ConfigNodePropertyBoolean proxyEnabled, 
        ConfigNodePropertyString proxyHost, 
        ConfigNodePropertyInteger proxyPort, 
        ConfigNodePropertyString proxyUser, 
        ConfigNodePropertyString proxyPassword, 
        ConfigNodePropertyArray proxyExceptions
    ) {
        this.proxyEnabled = proxyEnabled;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.proxyUser = proxyUser;
        this.proxyPassword = proxyPassword;
        this.proxyExceptions = proxyExceptions;
    }



    /**
     * Get proxyEnabled
     * @return proxyEnabled
     */
    public ConfigNodePropertyBoolean getProxyEnabled() {
        return proxyEnabled;
    }

    public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
        this.proxyEnabled = proxyEnabled;
    }

    /**
     * Get proxyHost
     * @return proxyHost
     */
    public ConfigNodePropertyString getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(ConfigNodePropertyString proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Get proxyPort
     * @return proxyPort
     */
    public ConfigNodePropertyInteger getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(ConfigNodePropertyInteger proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Get proxyUser
     * @return proxyUser
     */
    public ConfigNodePropertyString getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(ConfigNodePropertyString proxyUser) {
        this.proxyUser = proxyUser;
    }

    /**
     * Get proxyPassword
     * @return proxyPassword
     */
    public ConfigNodePropertyString getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    /**
     * Get proxyExceptions
     * @return proxyExceptions
     */
    public ConfigNodePropertyArray getProxyExceptions() {
        return proxyExceptions;
    }

    public void setProxyExceptions(ConfigNodePropertyArray proxyExceptions) {
        this.proxyExceptions = proxyExceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheHttpProxyconfiguratorProperties {\n");
        
        sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
        sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
        sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
        sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
        sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
        sb.append("    proxyExceptions: ").append(toIndentedString(proxyExceptions)).append("\n");
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

