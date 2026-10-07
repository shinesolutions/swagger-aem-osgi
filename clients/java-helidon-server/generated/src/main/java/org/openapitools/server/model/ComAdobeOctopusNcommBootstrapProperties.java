package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeOctopusNcommBootstrapProperties   {

    private ConfigNodePropertyInteger maxConnections;
    private ConfigNodePropertyInteger maxRequests;
    private ConfigNodePropertyInteger requestTimeout;
    private ConfigNodePropertyInteger requestRetries;
    private ConfigNodePropertyInteger launchTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeOctopusNcommBootstrapProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeOctopusNcommBootstrapProperties.
     *
     * @param maxConnections maxConnections
     * @param maxRequests maxRequests
     * @param requestTimeout requestTimeout
     * @param requestRetries requestRetries
     * @param launchTimeout launchTimeout
     */
    public ComAdobeOctopusNcommBootstrapProperties(
        ConfigNodePropertyInteger maxConnections, 
        ConfigNodePropertyInteger maxRequests, 
        ConfigNodePropertyInteger requestTimeout, 
        ConfigNodePropertyInteger requestRetries, 
        ConfigNodePropertyInteger launchTimeout
    ) {
        this.maxConnections = maxConnections;
        this.maxRequests = maxRequests;
        this.requestTimeout = requestTimeout;
        this.requestRetries = requestRetries;
        this.launchTimeout = launchTimeout;
    }



    /**
     * Get maxConnections
     * @return maxConnections
     */
    public ConfigNodePropertyInteger getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(ConfigNodePropertyInteger maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * Get maxRequests
     * @return maxRequests
     */
    public ConfigNodePropertyInteger getMaxRequests() {
        return maxRequests;
    }

    public void setMaxRequests(ConfigNodePropertyInteger maxRequests) {
        this.maxRequests = maxRequests;
    }

    /**
     * Get requestTimeout
     * @return requestTimeout
     */
    public ConfigNodePropertyInteger getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(ConfigNodePropertyInteger requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    /**
     * Get requestRetries
     * @return requestRetries
     */
    public ConfigNodePropertyInteger getRequestRetries() {
        return requestRetries;
    }

    public void setRequestRetries(ConfigNodePropertyInteger requestRetries) {
        this.requestRetries = requestRetries;
    }

    /**
     * Get launchTimeout
     * @return launchTimeout
     */
    public ConfigNodePropertyInteger getLaunchTimeout() {
        return launchTimeout;
    }

    public void setLaunchTimeout(ConfigNodePropertyInteger launchTimeout) {
        this.launchTimeout = launchTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeOctopusNcommBootstrapProperties {\n");
        
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
        sb.append("    maxRequests: ").append(toIndentedString(maxRequests)).append("\n");
        sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
        sb.append("    requestRetries: ").append(toIndentedString(requestRetries)).append("\n");
        sb.append("    launchTimeout: ").append(toIndentedString(launchTimeout)).append("\n");
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

