package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingTracerInternalLogTracerProperties   {
  
  private ConfigNodePropertyArray tracerSets = null;
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyBoolean servletEnabled = null;
  private ConfigNodePropertyInteger recordingCacheSizeInMB = null;
  private ConfigNodePropertyInteger recordingCacheDurationInSecs = null;
  private ConfigNodePropertyBoolean recordingCompressionEnabled = null;
  private ConfigNodePropertyBoolean gzipResponse = null;

  public OrgApacheSlingTracerInternalLogTracerProperties () {

  }

  public OrgApacheSlingTracerInternalLogTracerProperties (ConfigNodePropertyArray tracerSets, ConfigNodePropertyBoolean enabled, ConfigNodePropertyBoolean servletEnabled, ConfigNodePropertyInteger recordingCacheSizeInMB, ConfigNodePropertyInteger recordingCacheDurationInSecs, ConfigNodePropertyBoolean recordingCompressionEnabled, ConfigNodePropertyBoolean gzipResponse) {
    this.tracerSets = tracerSets;
    this.enabled = enabled;
    this.servletEnabled = servletEnabled;
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    this.recordingCompressionEnabled = recordingCompressionEnabled;
    this.gzipResponse = gzipResponse;
  }

    
  @JsonProperty("tracerSets")
  public ConfigNodePropertyArray getTracerSets() {
    return tracerSets;
  }
  public void setTracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("servletEnabled")
  public ConfigNodePropertyBoolean getServletEnabled() {
    return servletEnabled;
  }
  public void setServletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
  }

    
  @JsonProperty("recordingCacheSizeInMB")
  public ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
    return recordingCacheSizeInMB;
  }
  public void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
  }

    
  @JsonProperty("recordingCacheDurationInSecs")
  public ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
    return recordingCacheDurationInSecs;
  }
  public void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
  }

    
  @JsonProperty("recordingCompressionEnabled")
  public ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
    return recordingCompressionEnabled;
  }
  public void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
  }

    
  @JsonProperty("gzipResponse")
  public ConfigNodePropertyBoolean getGzipResponse() {
    return gzipResponse;
  }
  public void setGzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingTracerInternalLogTracerProperties orgApacheSlingTracerInternalLogTracerProperties = (OrgApacheSlingTracerInternalLogTracerProperties) o;
    return Objects.equals(tracerSets, orgApacheSlingTracerInternalLogTracerProperties.tracerSets) &&
        Objects.equals(enabled, orgApacheSlingTracerInternalLogTracerProperties.enabled) &&
        Objects.equals(servletEnabled, orgApacheSlingTracerInternalLogTracerProperties.servletEnabled) &&
        Objects.equals(recordingCacheSizeInMB, orgApacheSlingTracerInternalLogTracerProperties.recordingCacheSizeInMB) &&
        Objects.equals(recordingCacheDurationInSecs, orgApacheSlingTracerInternalLogTracerProperties.recordingCacheDurationInSecs) &&
        Objects.equals(recordingCompressionEnabled, orgApacheSlingTracerInternalLogTracerProperties.recordingCompressionEnabled) &&
        Objects.equals(gzipResponse, orgApacheSlingTracerInternalLogTracerProperties.gzipResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracerSets, enabled, servletEnabled, recordingCacheSizeInMB, recordingCacheDurationInSecs, recordingCompressionEnabled, gzipResponse);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
