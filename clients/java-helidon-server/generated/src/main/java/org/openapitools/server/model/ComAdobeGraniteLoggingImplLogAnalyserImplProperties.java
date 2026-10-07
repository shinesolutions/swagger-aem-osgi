package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteLoggingImplLogAnalyserImplProperties   {

    private ConfigNodePropertyInteger messagesQueueSize;
    private ConfigNodePropertyArray loggerConfig;
    private ConfigNodePropertyInteger messagesSize;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteLoggingImplLogAnalyserImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteLoggingImplLogAnalyserImplProperties.
     *
     * @param messagesQueueSize messagesQueueSize
     * @param loggerConfig loggerConfig
     * @param messagesSize messagesSize
     */
    public ComAdobeGraniteLoggingImplLogAnalyserImplProperties(
        ConfigNodePropertyInteger messagesQueueSize, 
        ConfigNodePropertyArray loggerConfig, 
        ConfigNodePropertyInteger messagesSize
    ) {
        this.messagesQueueSize = messagesQueueSize;
        this.loggerConfig = loggerConfig;
        this.messagesSize = messagesSize;
    }



    /**
     * Get messagesQueueSize
     * @return messagesQueueSize
     */
    public ConfigNodePropertyInteger getMessagesQueueSize() {
        return messagesQueueSize;
    }

    public void setMessagesQueueSize(ConfigNodePropertyInteger messagesQueueSize) {
        this.messagesQueueSize = messagesQueueSize;
    }

    /**
     * Get loggerConfig
     * @return loggerConfig
     */
    public ConfigNodePropertyArray getLoggerConfig() {
        return loggerConfig;
    }

    public void setLoggerConfig(ConfigNodePropertyArray loggerConfig) {
        this.loggerConfig = loggerConfig;
    }

    /**
     * Get messagesSize
     * @return messagesSize
     */
    public ConfigNodePropertyInteger getMessagesSize() {
        return messagesSize;
    }

    public void setMessagesSize(ConfigNodePropertyInteger messagesSize) {
        this.messagesSize = messagesSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteLoggingImplLogAnalyserImplProperties {\n");
        
        sb.append("    messagesQueueSize: ").append(toIndentedString(messagesQueueSize)).append("\n");
        sb.append("    loggerConfig: ").append(toIndentedString(loggerConfig)).append("\n");
        sb.append("    messagesSize: ").append(toIndentedString(messagesSize)).append("\n");
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

