package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMailerDefaultMailServiceProperties   {

    private ConfigNodePropertyString smtpHost;
    private ConfigNodePropertyInteger smtpPort;
    private ConfigNodePropertyString smtpUser;
    private ConfigNodePropertyString smtpPassword;
    private ConfigNodePropertyString fromAddress;
    private ConfigNodePropertyBoolean smtpSsl;
    private ConfigNodePropertyBoolean smtpStarttls;
    private ConfigNodePropertyBoolean debugEmail;

    /**
     * Default constructor.
     */
    public ComDayCqMailerDefaultMailServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMailerDefaultMailServiceProperties.
     *
     * @param smtpHost smtpHost
     * @param smtpPort smtpPort
     * @param smtpUser smtpUser
     * @param smtpPassword smtpPassword
     * @param fromAddress fromAddress
     * @param smtpSsl smtpSsl
     * @param smtpStarttls smtpStarttls
     * @param debugEmail debugEmail
     */
    public ComDayCqMailerDefaultMailServiceProperties(
        ConfigNodePropertyString smtpHost, 
        ConfigNodePropertyInteger smtpPort, 
        ConfigNodePropertyString smtpUser, 
        ConfigNodePropertyString smtpPassword, 
        ConfigNodePropertyString fromAddress, 
        ConfigNodePropertyBoolean smtpSsl, 
        ConfigNodePropertyBoolean smtpStarttls, 
        ConfigNodePropertyBoolean debugEmail
    ) {
        this.smtpHost = smtpHost;
        this.smtpPort = smtpPort;
        this.smtpUser = smtpUser;
        this.smtpPassword = smtpPassword;
        this.fromAddress = fromAddress;
        this.smtpSsl = smtpSsl;
        this.smtpStarttls = smtpStarttls;
        this.debugEmail = debugEmail;
    }



    /**
     * Get smtpHost
     * @return smtpHost
     */
    public ConfigNodePropertyString getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(ConfigNodePropertyString smtpHost) {
        this.smtpHost = smtpHost;
    }

    /**
     * Get smtpPort
     * @return smtpPort
     */
    public ConfigNodePropertyInteger getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(ConfigNodePropertyInteger smtpPort) {
        this.smtpPort = smtpPort;
    }

    /**
     * Get smtpUser
     * @return smtpUser
     */
    public ConfigNodePropertyString getSmtpUser() {
        return smtpUser;
    }

    public void setSmtpUser(ConfigNodePropertyString smtpUser) {
        this.smtpUser = smtpUser;
    }

    /**
     * Get smtpPassword
     * @return smtpPassword
     */
    public ConfigNodePropertyString getSmtpPassword() {
        return smtpPassword;
    }

    public void setSmtpPassword(ConfigNodePropertyString smtpPassword) {
        this.smtpPassword = smtpPassword;
    }

    /**
     * Get fromAddress
     * @return fromAddress
     */
    public ConfigNodePropertyString getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(ConfigNodePropertyString fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * Get smtpSsl
     * @return smtpSsl
     */
    public ConfigNodePropertyBoolean getSmtpSsl() {
        return smtpSsl;
    }

    public void setSmtpSsl(ConfigNodePropertyBoolean smtpSsl) {
        this.smtpSsl = smtpSsl;
    }

    /**
     * Get smtpStarttls
     * @return smtpStarttls
     */
    public ConfigNodePropertyBoolean getSmtpStarttls() {
        return smtpStarttls;
    }

    public void setSmtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
        this.smtpStarttls = smtpStarttls;
    }

    /**
     * Get debugEmail
     * @return debugEmail
     */
    public ConfigNodePropertyBoolean getDebugEmail() {
        return debugEmail;
    }

    public void setDebugEmail(ConfigNodePropertyBoolean debugEmail) {
        this.debugEmail = debugEmail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMailerDefaultMailServiceProperties {\n");
        
        sb.append("    smtpHost: ").append(toIndentedString(smtpHost)).append("\n");
        sb.append("    smtpPort: ").append(toIndentedString(smtpPort)).append("\n");
        sb.append("    smtpUser: ").append(toIndentedString(smtpUser)).append("\n");
        sb.append("    smtpPassword: ").append(toIndentedString(smtpPassword)).append("\n");
        sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
        sb.append("    smtpSsl: ").append(toIndentedString(smtpSsl)).append("\n");
        sb.append("    smtpStarttls: ").append(toIndentedString(smtpStarttls)).append("\n");
        sb.append("    debugEmail: ").append(toIndentedString(debugEmail)).append("\n");
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

