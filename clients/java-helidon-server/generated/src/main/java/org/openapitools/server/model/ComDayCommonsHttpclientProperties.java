package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCommonsHttpclientProperties   {

    private ConfigNodePropertyBoolean proxyEnabled;
    private ConfigNodePropertyString proxyHost;
    private ConfigNodePropertyString proxyUser;
    private ConfigNodePropertyString proxyPassword;
    private ConfigNodePropertyString proxyNtlmHost;
    private ConfigNodePropertyString proxyNtlmDomain;
    private ConfigNodePropertyArray proxyExceptions;

    /**
     * Default constructor.
     */
    public ComDayCommonsHttpclientProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCommonsHttpclientProperties.
     *
     * @param proxyEnabled proxyEnabled
     * @param proxyHost proxyHost
     * @param proxyUser proxyUser
     * @param proxyPassword proxyPassword
     * @param proxyNtlmHost proxyNtlmHost
     * @param proxyNtlmDomain proxyNtlmDomain
     * @param proxyExceptions proxyExceptions
     */
    public ComDayCommonsHttpclientProperties(
        ConfigNodePropertyBoolean proxyEnabled, 
        ConfigNodePropertyString proxyHost, 
        ConfigNodePropertyString proxyUser, 
        ConfigNodePropertyString proxyPassword, 
        ConfigNodePropertyString proxyNtlmHost, 
        ConfigNodePropertyString proxyNtlmDomain, 
        ConfigNodePropertyArray proxyExceptions
    ) {
        this.proxyEnabled = proxyEnabled;
        this.proxyHost = proxyHost;
        this.proxyUser = proxyUser;
        this.proxyPassword = proxyPassword;
        this.proxyNtlmHost = proxyNtlmHost;
        this.proxyNtlmDomain = proxyNtlmDomain;
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
     * Get proxyNtlmHost
     * @return proxyNtlmHost
     */
    public ConfigNodePropertyString getProxyNtlmHost() {
        return proxyNtlmHost;
    }

    public void setProxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
        this.proxyNtlmHost = proxyNtlmHost;
    }

    /**
     * Get proxyNtlmDomain
     * @return proxyNtlmDomain
     */
    public ConfigNodePropertyString getProxyNtlmDomain() {
        return proxyNtlmDomain;
    }

    public void setProxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
        this.proxyNtlmDomain = proxyNtlmDomain;
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
        sb.append("class ComDayCommonsHttpclientProperties {\n");
        
        sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
        sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
        sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
        sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
        sb.append("    proxyNtlmHost: ").append(toIndentedString(proxyNtlmHost)).append("\n");
        sb.append("    proxyNtlmDomain: ").append(toIndentedString(proxyNtlmDomain)).append("\n");
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

