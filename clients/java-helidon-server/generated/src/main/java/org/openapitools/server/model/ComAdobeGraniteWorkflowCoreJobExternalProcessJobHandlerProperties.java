package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties   {

    private ConfigNodePropertyInteger defaultTimeout;
    private ConfigNodePropertyInteger maxTimeout;
    private ConfigNodePropertyInteger defaultPeriod;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
     *
     * @param defaultTimeout defaultTimeout
     * @param maxTimeout maxTimeout
     * @param defaultPeriod defaultPeriod
     */
    public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(
        ConfigNodePropertyInteger defaultTimeout, 
        ConfigNodePropertyInteger maxTimeout, 
        ConfigNodePropertyInteger defaultPeriod
    ) {
        this.defaultTimeout = defaultTimeout;
        this.maxTimeout = maxTimeout;
        this.defaultPeriod = defaultPeriod;
    }



    /**
     * Get defaultTimeout
     * @return defaultTimeout
     */
    public ConfigNodePropertyInteger getDefaultTimeout() {
        return defaultTimeout;
    }

    public void setDefaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
    }

    /**
     * Get maxTimeout
     * @return maxTimeout
     */
    public ConfigNodePropertyInteger getMaxTimeout() {
        return maxTimeout;
    }

    public void setMaxTimeout(ConfigNodePropertyInteger maxTimeout) {
        this.maxTimeout = maxTimeout;
    }

    /**
     * Get defaultPeriod
     * @return defaultPeriod
     */
    public ConfigNodePropertyInteger getDefaultPeriod() {
        return defaultPeriod;
    }

    public void setDefaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
        this.defaultPeriod = defaultPeriod;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {\n");
        
        sb.append("    defaultTimeout: ").append(toIndentedString(defaultTimeout)).append("\n");
        sb.append("    maxTimeout: ").append(toIndentedString(maxTimeout)).append("\n");
        sb.append("    defaultPeriod: ").append(toIndentedString(defaultPeriod)).append("\n");
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

