package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties   {

    private ConfigNodePropertyString tcpPort;
    private ConfigNodePropertyBoolean allowRemoteAccess;
    private ConfigNodePropertyString maxRenderRgnPixels;
    private ConfigNodePropertyString maxMessageSize;
    private ConfigNodePropertyInteger randomAccessUrlTimeout;
    private ConfigNodePropertyInteger workerThreads;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.
     *
     * @param tcpPort tcpPort
     * @param allowRemoteAccess allowRemoteAccess
     * @param maxRenderRgnPixels maxRenderRgnPixels
     * @param maxMessageSize maxMessageSize
     * @param randomAccessUrlTimeout randomAccessUrlTimeout
     * @param workerThreads workerThreads
     */
    public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(
        ConfigNodePropertyString tcpPort, 
        ConfigNodePropertyBoolean allowRemoteAccess, 
        ConfigNodePropertyString maxRenderRgnPixels, 
        ConfigNodePropertyString maxMessageSize, 
        ConfigNodePropertyInteger randomAccessUrlTimeout, 
        ConfigNodePropertyInteger workerThreads
    ) {
        this.tcpPort = tcpPort;
        this.allowRemoteAccess = allowRemoteAccess;
        this.maxRenderRgnPixels = maxRenderRgnPixels;
        this.maxMessageSize = maxMessageSize;
        this.randomAccessUrlTimeout = randomAccessUrlTimeout;
        this.workerThreads = workerThreads;
    }



    /**
     * Get tcpPort
     * @return tcpPort
     */
    public ConfigNodePropertyString getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(ConfigNodePropertyString tcpPort) {
        this.tcpPort = tcpPort;
    }

    /**
     * Get allowRemoteAccess
     * @return allowRemoteAccess
     */
    public ConfigNodePropertyBoolean getAllowRemoteAccess() {
        return allowRemoteAccess;
    }

    public void setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
        this.allowRemoteAccess = allowRemoteAccess;
    }

    /**
     * Get maxRenderRgnPixels
     * @return maxRenderRgnPixels
     */
    public ConfigNodePropertyString getMaxRenderRgnPixels() {
        return maxRenderRgnPixels;
    }

    public void setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
        this.maxRenderRgnPixels = maxRenderRgnPixels;
    }

    /**
     * Get maxMessageSize
     * @return maxMessageSize
     */
    public ConfigNodePropertyString getMaxMessageSize() {
        return maxMessageSize;
    }

    public void setMaxMessageSize(ConfigNodePropertyString maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
    }

    /**
     * Get randomAccessUrlTimeout
     * @return randomAccessUrlTimeout
     */
    public ConfigNodePropertyInteger getRandomAccessUrlTimeout() {
        return randomAccessUrlTimeout;
    }

    public void setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
        this.randomAccessUrlTimeout = randomAccessUrlTimeout;
    }

    /**
     * Get workerThreads
     * @return workerThreads
     */
    public ConfigNodePropertyInteger getWorkerThreads() {
        return workerThreads;
    }

    public void setWorkerThreads(ConfigNodePropertyInteger workerThreads) {
        this.workerThreads = workerThreads;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {\n");
        
        sb.append("    tcpPort: ").append(toIndentedString(tcpPort)).append("\n");
        sb.append("    allowRemoteAccess: ").append(toIndentedString(allowRemoteAccess)).append("\n");
        sb.append("    maxRenderRgnPixels: ").append(toIndentedString(maxRenderRgnPixels)).append("\n");
        sb.append("    maxMessageSize: ").append(toIndentedString(maxMessageSize)).append("\n");
        sb.append("    randomAccessUrlTimeout: ").append(toIndentedString(randomAccessUrlTimeout)).append("\n");
        sb.append("    workerThreads: ").append(toIndentedString(workerThreads)).append("\n");
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

