package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingTracerInternalLogTracerProperties   {
  @JsonProperty("tracerSets")
  private ConfigNodePropertyArray tracerSets = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("servletEnabled")
  private ConfigNodePropertyBoolean servletEnabled = null;

  @JsonProperty("recordingCacheSizeInMB")
  private ConfigNodePropertyInteger recordingCacheSizeInMB = null;

  @JsonProperty("recordingCacheDurationInSecs")
  private ConfigNodePropertyInteger recordingCacheDurationInSecs = null;

  @JsonProperty("recordingCompressionEnabled")
  private ConfigNodePropertyBoolean recordingCompressionEnabled = null;

  @JsonProperty("gzipResponse")
  private ConfigNodePropertyBoolean gzipResponse = null;

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties tracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracerSets")
  public ConfigNodePropertyArray getTracerSets() {
    return tracerSets;
  }
  public void setTracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
  }

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties servletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("servletEnabled")
  public ConfigNodePropertyBoolean getServletEnabled() {
    return servletEnabled;
  }
  public void setServletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
  }

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("recordingCacheSizeInMB")
  public ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
    return recordingCacheSizeInMB;
  }
  public void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
  }

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("recordingCacheDurationInSecs")
  public ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
    return recordingCacheDurationInSecs;
  }
  public void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
  }

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties recordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("recordingCompressionEnabled")
  public ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
    return recordingCompressionEnabled;
  }
  public void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
  }

  /**
   **/
  public OrgApacheSlingTracerInternalLogTracerProperties gzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gzipResponse")
  public ConfigNodePropertyBoolean getGzipResponse() {
    return gzipResponse;
  }
  public void setGzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

