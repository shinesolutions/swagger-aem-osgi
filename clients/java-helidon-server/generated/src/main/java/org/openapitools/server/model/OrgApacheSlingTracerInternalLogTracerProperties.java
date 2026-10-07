package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingTracerInternalLogTracerProperties   {

    private ConfigNodePropertyArray tracerSets;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyBoolean servletEnabled;
    private ConfigNodePropertyInteger recordingCacheSizeInMB;
    private ConfigNodePropertyInteger recordingCacheDurationInSecs;
    private ConfigNodePropertyBoolean recordingCompressionEnabled;
    private ConfigNodePropertyBoolean gzipResponse;

    /**
     * Default constructor.
     */
    public OrgApacheSlingTracerInternalLogTracerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingTracerInternalLogTracerProperties.
     *
     * @param tracerSets tracerSets
     * @param enabled enabled
     * @param servletEnabled servletEnabled
     * @param recordingCacheSizeInMB recordingCacheSizeInMB
     * @param recordingCacheDurationInSecs recordingCacheDurationInSecs
     * @param recordingCompressionEnabled recordingCompressionEnabled
     * @param gzipResponse gzipResponse
     */
    public OrgApacheSlingTracerInternalLogTracerProperties(
        ConfigNodePropertyArray tracerSets, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyBoolean servletEnabled, 
        ConfigNodePropertyInteger recordingCacheSizeInMB, 
        ConfigNodePropertyInteger recordingCacheDurationInSecs, 
        ConfigNodePropertyBoolean recordingCompressionEnabled, 
        ConfigNodePropertyBoolean gzipResponse
    ) {
        this.tracerSets = tracerSets;
        this.enabled = enabled;
        this.servletEnabled = servletEnabled;
        this.recordingCacheSizeInMB = recordingCacheSizeInMB;
        this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
        this.recordingCompressionEnabled = recordingCompressionEnabled;
        this.gzipResponse = gzipResponse;
    }



    /**
     * Get tracerSets
     * @return tracerSets
     */
    public ConfigNodePropertyArray getTracerSets() {
        return tracerSets;
    }

    public void setTracerSets(ConfigNodePropertyArray tracerSets) {
        this.tracerSets = tracerSets;
    }

    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get servletEnabled
     * @return servletEnabled
     */
    public ConfigNodePropertyBoolean getServletEnabled() {
        return servletEnabled;
    }

    public void setServletEnabled(ConfigNodePropertyBoolean servletEnabled) {
        this.servletEnabled = servletEnabled;
    }

    /**
     * Get recordingCacheSizeInMB
     * @return recordingCacheSizeInMB
     */
    public ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
        return recordingCacheSizeInMB;
    }

    public void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
        this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    }

    /**
     * Get recordingCacheDurationInSecs
     * @return recordingCacheDurationInSecs
     */
    public ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
        return recordingCacheDurationInSecs;
    }

    public void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
        this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    }

    /**
     * Get recordingCompressionEnabled
     * @return recordingCompressionEnabled
     */
    public ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
        return recordingCompressionEnabled;
    }

    public void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
        this.recordingCompressionEnabled = recordingCompressionEnabled;
    }

    /**
     * Get gzipResponse
     * @return gzipResponse
     */
    public ConfigNodePropertyBoolean getGzipResponse() {
        return gzipResponse;
    }

    public void setGzipResponse(ConfigNodePropertyBoolean gzipResponse) {
        this.gzipResponse = gzipResponse;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingTracerInternalLogTracerProperties {\n");
        
        sb.append("    tracerSets: ").append(toIndentedString(tracerSets)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    servletEnabled: ").append(toIndentedString(servletEnabled)).append("\n");
        sb.append("    recordingCacheSizeInMB: ").append(toIndentedString(recordingCacheSizeInMB)).append("\n");
        sb.append("    recordingCacheDurationInSecs: ").append(toIndentedString(recordingCacheDurationInSecs)).append("\n");
        sb.append("    recordingCompressionEnabled: ").append(toIndentedString(recordingCompressionEnabled)).append("\n");
        sb.append("    gzipResponse: ").append(toIndentedString(gzipResponse)).append("\n");
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

