package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties   {

    private ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
    private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
    private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
    private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
    private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
    private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
    private ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
    private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
    private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.
     *
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
     * @param comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
     */
    public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(
        ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, 
        ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, 
        ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, 
        ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, 
        ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, 
        ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, 
        ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, 
        ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, 
        ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
    ) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
    }



    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
     */
    public ConfigNodePropertyArray getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
     */
    public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
     */
    public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
     */
    public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
     */
    public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
     */
    public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
     */
    public ConfigNodePropertyBoolean getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
     */
    public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
    }

    /**
     * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
     * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
     */
    public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword() {
        return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
    }

    public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
        this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {\n");
        
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername)).append("\n");
        sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword)).append("\n");
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

