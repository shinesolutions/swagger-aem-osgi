package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties   {

    private ConfigNodePropertyString fromAddress;
    private ConfigNodePropertyString hostPrefix;
    private ConfigNodePropertyBoolean notifyOnabort;
    private ConfigNodePropertyBoolean notifyOncomplete;
    private ConfigNodePropertyBoolean notifyOncontainercomplete;
    private ConfigNodePropertyBoolean notifyUseronly;

    /**
     * Default constructor.
     */
    public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.
     *
     * @param fromAddress fromAddress
     * @param hostPrefix hostPrefix
     * @param notifyOnabort notifyOnabort
     * @param notifyOncomplete notifyOncomplete
     * @param notifyOncontainercomplete notifyOncontainercomplete
     * @param notifyUseronly notifyUseronly
     */
    public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(
        ConfigNodePropertyString fromAddress, 
        ConfigNodePropertyString hostPrefix, 
        ConfigNodePropertyBoolean notifyOnabort, 
        ConfigNodePropertyBoolean notifyOncomplete, 
        ConfigNodePropertyBoolean notifyOncontainercomplete, 
        ConfigNodePropertyBoolean notifyUseronly
    ) {
        this.fromAddress = fromAddress;
        this.hostPrefix = hostPrefix;
        this.notifyOnabort = notifyOnabort;
        this.notifyOncomplete = notifyOncomplete;
        this.notifyOncontainercomplete = notifyOncontainercomplete;
        this.notifyUseronly = notifyUseronly;
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
     * Get hostPrefix
     * @return hostPrefix
     */
    public ConfigNodePropertyString getHostPrefix() {
        return hostPrefix;
    }

    public void setHostPrefix(ConfigNodePropertyString hostPrefix) {
        this.hostPrefix = hostPrefix;
    }

    /**
     * Get notifyOnabort
     * @return notifyOnabort
     */
    public ConfigNodePropertyBoolean getNotifyOnabort() {
        return notifyOnabort;
    }

    public void setNotifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
        this.notifyOnabort = notifyOnabort;
    }

    /**
     * Get notifyOncomplete
     * @return notifyOncomplete
     */
    public ConfigNodePropertyBoolean getNotifyOncomplete() {
        return notifyOncomplete;
    }

    public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
        this.notifyOncomplete = notifyOncomplete;
    }

    /**
     * Get notifyOncontainercomplete
     * @return notifyOncontainercomplete
     */
    public ConfigNodePropertyBoolean getNotifyOncontainercomplete() {
        return notifyOncontainercomplete;
    }

    public void setNotifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
        this.notifyOncontainercomplete = notifyOncontainercomplete;
    }

    /**
     * Get notifyUseronly
     * @return notifyUseronly
     */
    public ConfigNodePropertyBoolean getNotifyUseronly() {
        return notifyUseronly;
    }

    public void setNotifyUseronly(ConfigNodePropertyBoolean notifyUseronly) {
        this.notifyUseronly = notifyUseronly;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {\n");
        
        sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
        sb.append("    hostPrefix: ").append(toIndentedString(hostPrefix)).append("\n");
        sb.append("    notifyOnabort: ").append(toIndentedString(notifyOnabort)).append("\n");
        sb.append("    notifyOncomplete: ").append(toIndentedString(notifyOncomplete)).append("\n");
        sb.append("    notifyOncontainercomplete: ").append(toIndentedString(notifyOncontainercomplete)).append("\n");
        sb.append("    notifyUseronly: ").append(toIndentedString(notifyUseronly)).append("\n");
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

