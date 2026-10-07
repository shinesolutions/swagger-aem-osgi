package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmNotificationEmailImplEmailChannelProperties   {

    private ConfigNodePropertyString emailFrom;

    /**
     * Default constructor.
     */
    public ComDayCqWcmNotificationEmailImplEmailChannelProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmNotificationEmailImplEmailChannelProperties.
     *
     * @param emailFrom emailFrom
     */
    public ComDayCqWcmNotificationEmailImplEmailChannelProperties(
        ConfigNodePropertyString emailFrom
    ) {
        this.emailFrom = emailFrom;
    }



    /**
     * Get emailFrom
     * @return emailFrom
     */
    public ConfigNodePropertyString getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(ConfigNodePropertyString emailFrom) {
        this.emailFrom = emailFrom;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmNotificationEmailImplEmailChannelProperties {\n");
        
        sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
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

