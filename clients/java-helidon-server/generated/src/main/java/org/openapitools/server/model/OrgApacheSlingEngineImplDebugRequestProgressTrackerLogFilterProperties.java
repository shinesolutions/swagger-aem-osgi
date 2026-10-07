package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties   {

    private ConfigNodePropertyArray extensions;
    private ConfigNodePropertyInteger minDurationMs;
    private ConfigNodePropertyInteger maxDurationMs;
    private ConfigNodePropertyBoolean compactLogFormat;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
     *
     * @param extensions extensions
     * @param minDurationMs minDurationMs
     * @param maxDurationMs maxDurationMs
     * @param compactLogFormat compactLogFormat
     */
    public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(
        ConfigNodePropertyArray extensions, 
        ConfigNodePropertyInteger minDurationMs, 
        ConfigNodePropertyInteger maxDurationMs, 
        ConfigNodePropertyBoolean compactLogFormat
    ) {
        this.extensions = extensions;
        this.minDurationMs = minDurationMs;
        this.maxDurationMs = maxDurationMs;
        this.compactLogFormat = compactLogFormat;
    }



    /**
     * Get extensions
     * @return extensions
     */
    public ConfigNodePropertyArray getExtensions() {
        return extensions;
    }

    public void setExtensions(ConfigNodePropertyArray extensions) {
        this.extensions = extensions;
    }

    /**
     * Get minDurationMs
     * @return minDurationMs
     */
    public ConfigNodePropertyInteger getMinDurationMs() {
        return minDurationMs;
    }

    public void setMinDurationMs(ConfigNodePropertyInteger minDurationMs) {
        this.minDurationMs = minDurationMs;
    }

    /**
     * Get maxDurationMs
     * @return maxDurationMs
     */
    public ConfigNodePropertyInteger getMaxDurationMs() {
        return maxDurationMs;
    }

    public void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
        this.maxDurationMs = maxDurationMs;
    }

    /**
     * Get compactLogFormat
     * @return compactLogFormat
     */
    public ConfigNodePropertyBoolean getCompactLogFormat() {
        return compactLogFormat;
    }

    public void setCompactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
        this.compactLogFormat = compactLogFormat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {\n");
        
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
        sb.append("    minDurationMs: ").append(toIndentedString(minDurationMs)).append("\n");
        sb.append("    maxDurationMs: ").append(toIndentedString(maxDurationMs)).append("\n");
        sb.append("    compactLogFormat: ").append(toIndentedString(compactLogFormat)).append("\n");
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

