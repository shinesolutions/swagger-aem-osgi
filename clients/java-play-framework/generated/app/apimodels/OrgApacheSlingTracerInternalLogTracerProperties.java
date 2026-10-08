package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingTracerInternalLogTracerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingTracerInternalLogTracerProperties   {
  @JsonProperty("tracerSets")
  @Valid

  private ConfigNodePropertyArray tracerSets;

  @JsonProperty("enabled")
  @Valid

  private ConfigNodePropertyBoolean enabled;

  @JsonProperty("servletEnabled")
  @Valid

  private ConfigNodePropertyBoolean servletEnabled;

  @JsonProperty("recordingCacheSizeInMB")
  @Valid

  private ConfigNodePropertyInteger recordingCacheSizeInMB;

  @JsonProperty("recordingCacheDurationInSecs")
  @Valid

  private ConfigNodePropertyInteger recordingCacheDurationInSecs;

  @JsonProperty("recordingCompressionEnabled")
  @Valid

  private ConfigNodePropertyBoolean recordingCompressionEnabled;

  @JsonProperty("gzipResponse")
  @Valid

  private ConfigNodePropertyBoolean gzipResponse;

  public OrgApacheSlingTracerInternalLogTracerProperties tracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
    return this;
  }

   /**
   * Get tracerSets
   * @return tracerSets
  **/
  public ConfigNodePropertyArray getTracerSets() {
    return tracerSets;
  }

  public void setTracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties servletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
    return this;
  }

   /**
   * Get servletEnabled
   * @return servletEnabled
  **/
  public ConfigNodePropertyBoolean getServletEnabled() {
    return servletEnabled;
  }

  public void setServletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    return this;
  }

   /**
   * Get recordingCacheSizeInMB
   * @return recordingCacheSizeInMB
  **/
  public ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
    return recordingCacheSizeInMB;
  }

  public void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    return this;
  }

   /**
   * Get recordingCacheDurationInSecs
   * @return recordingCacheDurationInSecs
  **/
  public ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
    return recordingCacheDurationInSecs;
  }

  public void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
    return this;
  }

   /**
   * Get recordingCompressionEnabled
   * @return recordingCompressionEnabled
  **/
  public ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
    return recordingCompressionEnabled;
  }

  public void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties gzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
    return this;
  }

   /**
   * Get gzipResponse
   * @return gzipResponse
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

