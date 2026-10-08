package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingTracerInternalLogTracerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray tracerSets;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean servletEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger recordingCacheSizeInMB;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger recordingCacheDurationInSecs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean recordingCompressionEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean gzipResponse;
 /**
  * Get tracerSets
  * @return tracerSets
  */
  @JsonProperty("tracerSets")
  public ConfigNodePropertyArray getTracerSets() {
    return tracerSets;
  }

  /**
   * Sets the <code>tracerSets</code> property.
   */
 public void setTracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
  }

  /**
   * Sets the <code>tracerSets</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties tracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
    return this;
  }

 /**
  * Get enabled
  * @return enabled
  */
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
 public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
  * Get servletEnabled
  * @return servletEnabled
  */
  @JsonProperty("servletEnabled")
  public ConfigNodePropertyBoolean getServletEnabled() {
    return servletEnabled;
  }

  /**
   * Sets the <code>servletEnabled</code> property.
   */
 public void setServletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
  }

  /**
   * Sets the <code>servletEnabled</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties servletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
    return this;
  }

 /**
  * Get recordingCacheSizeInMB
  * @return recordingCacheSizeInMB
  */
  @JsonProperty("recordingCacheSizeInMB")
  public ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
    return recordingCacheSizeInMB;
  }

  /**
   * Sets the <code>recordingCacheSizeInMB</code> property.
   */
 public void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
  }

  /**
   * Sets the <code>recordingCacheSizeInMB</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    return this;
  }

 /**
  * Get recordingCacheDurationInSecs
  * @return recordingCacheDurationInSecs
  */
  @JsonProperty("recordingCacheDurationInSecs")
  public ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
    return recordingCacheDurationInSecs;
  }

  /**
   * Sets the <code>recordingCacheDurationInSecs</code> property.
   */
 public void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
  }

  /**
   * Sets the <code>recordingCacheDurationInSecs</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    return this;
  }

 /**
  * Get recordingCompressionEnabled
  * @return recordingCompressionEnabled
  */
  @JsonProperty("recordingCompressionEnabled")
  public ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
    return recordingCompressionEnabled;
  }

  /**
   * Sets the <code>recordingCompressionEnabled</code> property.
   */
 public void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
  }

  /**
   * Sets the <code>recordingCompressionEnabled</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties recordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
    return this;
  }

 /**
  * Get gzipResponse
  * @return gzipResponse
  */
  @JsonProperty("gzipResponse")
  public ConfigNodePropertyBoolean getGzipResponse() {
    return gzipResponse;
  }

  /**
   * Sets the <code>gzipResponse</code> property.
   */
 public void setGzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
  }

  /**
   * Sets the <code>gzipResponse</code> property.
   */
  public OrgApacheSlingTracerInternalLogTracerProperties gzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
    return this;
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
    return Objects.equals(this.tracerSets, orgApacheSlingTracerInternalLogTracerProperties.tracerSets) &&
        Objects.equals(this.enabled, orgApacheSlingTracerInternalLogTracerProperties.enabled) &&
        Objects.equals(this.servletEnabled, orgApacheSlingTracerInternalLogTracerProperties.servletEnabled) &&
        Objects.equals(this.recordingCacheSizeInMB, orgApacheSlingTracerInternalLogTracerProperties.recordingCacheSizeInMB) &&
        Objects.equals(this.recordingCacheDurationInSecs, orgApacheSlingTracerInternalLogTracerProperties.recordingCacheDurationInSecs) &&
        Objects.equals(this.recordingCompressionEnabled, orgApacheSlingTracerInternalLogTracerProperties.recordingCompressionEnabled) &&
        Objects.equals(this.gzipResponse, orgApacheSlingTracerInternalLogTracerProperties.gzipResponse);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

