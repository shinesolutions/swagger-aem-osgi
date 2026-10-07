package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties   {

    private ConfigNodePropertyString maxConnections;
    private ConfigNodePropertyString maxRequests;
    private ConfigNodePropertyString requestTimeout;
    private ConfigNodePropertyString logDir;

    /**
     * Default constructor.
     */
    public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
     *
     * @param maxConnections maxConnections
     * @param maxRequests maxRequests
     * @param requestTimeout requestTimeout
     * @param logDir logDir
     */
    public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(
        ConfigNodePropertyString maxConnections, 
        ConfigNodePropertyString maxRequests, 
        ConfigNodePropertyString requestTimeout, 
        ConfigNodePropertyString logDir
    ) {
        this.maxConnections = maxConnections;
        this.maxRequests = maxRequests;
        this.requestTimeout = requestTimeout;
        this.logDir = logDir;
    }



    /**
     * Get maxConnections
     * @return maxConnections
     */
    public ConfigNodePropertyString getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(ConfigNodePropertyString maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * Get maxRequests
     * @return maxRequests
     */
    public ConfigNodePropertyString getMaxRequests() {
        return maxRequests;
    }

    public void setMaxRequests(ConfigNodePropertyString maxRequests) {
        this.maxRequests = maxRequests;
    }

    /**
     * Get requestTimeout
     * @return requestTimeout
     */
    public ConfigNodePropertyString getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(ConfigNodePropertyString requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    /**
     * Get logDir
     * @return logDir
     */
    public ConfigNodePropertyString getLogDir() {
        return logDir;
    }

    public void setLogDir(ConfigNodePropertyString logDir) {
        this.logDir = logDir;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {\n");
        
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
        sb.append("    maxRequests: ").append(toIndentedString(maxRequests)).append("\n");
        sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
        sb.append("    logDir: ").append(toIndentedString(logDir)).append("\n");
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

