package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties   {

    private ConfigNodePropertyString scriptFilename;
    private ConfigNodePropertyString scriptDisplay;
    private ConfigNodePropertyString scriptPath;
    private ConfigNodePropertyArray scriptPlatform;
    private ConfigNodePropertyInteger interval;
    private ConfigNodePropertyString jmxdomain;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteMonitoringImplScriptConfigImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteMonitoringImplScriptConfigImplProperties.
     *
     * @param scriptFilename scriptFilename
     * @param scriptDisplay scriptDisplay
     * @param scriptPath scriptPath
     * @param scriptPlatform scriptPlatform
     * @param interval interval
     * @param jmxdomain jmxdomain
     */
    public ComAdobeGraniteMonitoringImplScriptConfigImplProperties(
        ConfigNodePropertyString scriptFilename, 
        ConfigNodePropertyString scriptDisplay, 
        ConfigNodePropertyString scriptPath, 
        ConfigNodePropertyArray scriptPlatform, 
        ConfigNodePropertyInteger interval, 
        ConfigNodePropertyString jmxdomain
    ) {
        this.scriptFilename = scriptFilename;
        this.scriptDisplay = scriptDisplay;
        this.scriptPath = scriptPath;
        this.scriptPlatform = scriptPlatform;
        this.interval = interval;
        this.jmxdomain = jmxdomain;
    }



    /**
     * Get scriptFilename
     * @return scriptFilename
     */
    public ConfigNodePropertyString getScriptFilename() {
        return scriptFilename;
    }

    public void setScriptFilename(ConfigNodePropertyString scriptFilename) {
        this.scriptFilename = scriptFilename;
    }

    /**
     * Get scriptDisplay
     * @return scriptDisplay
     */
    public ConfigNodePropertyString getScriptDisplay() {
        return scriptDisplay;
    }

    public void setScriptDisplay(ConfigNodePropertyString scriptDisplay) {
        this.scriptDisplay = scriptDisplay;
    }

    /**
     * Get scriptPath
     * @return scriptPath
     */
    public ConfigNodePropertyString getScriptPath() {
        return scriptPath;
    }

    public void setScriptPath(ConfigNodePropertyString scriptPath) {
        this.scriptPath = scriptPath;
    }

    /**
     * Get scriptPlatform
     * @return scriptPlatform
     */
    public ConfigNodePropertyArray getScriptPlatform() {
        return scriptPlatform;
    }

    public void setScriptPlatform(ConfigNodePropertyArray scriptPlatform) {
        this.scriptPlatform = scriptPlatform;
    }

    /**
     * Get interval
     * @return interval
     */
    public ConfigNodePropertyInteger getInterval() {
        return interval;
    }

    public void setInterval(ConfigNodePropertyInteger interval) {
        this.interval = interval;
    }

    /**
     * Get jmxdomain
     * @return jmxdomain
     */
    public ConfigNodePropertyString getJmxdomain() {
        return jmxdomain;
    }

    public void setJmxdomain(ConfigNodePropertyString jmxdomain) {
        this.jmxdomain = jmxdomain;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {\n");
        
        sb.append("    scriptFilename: ").append(toIndentedString(scriptFilename)).append("\n");
        sb.append("    scriptDisplay: ").append(toIndentedString(scriptDisplay)).append("\n");
        sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
        sb.append("    scriptPlatform: ").append(toIndentedString(scriptPlatform)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    jmxdomain: ").append(toIndentedString(jmxdomain)).append("\n");
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

