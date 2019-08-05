package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingTracerInternalLogTracerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray tracerSets = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean servletEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger recordingCacheSizeInMB = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger recordingCacheDurationInSecs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean recordingCompressionEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean gzipResponse = null;
 /**
   * Get tracerSets
   * @return tracerSets
  **/
  @JsonProperty("tracerSets")
  public ConfigNodePropertyArray getTracerSets() {
    return tracerSets;
  }

  public void setTracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties tracerSets(ConfigNodePropertyArray tracerSets) {
    this.tracerSets = tracerSets;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get servletEnabled
   * @return servletEnabled
  **/
  @JsonProperty("servletEnabled")
  public ConfigNodePropertyBoolean getServletEnabled() {
    return servletEnabled;
  }

  public void setServletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties servletEnabled(ConfigNodePropertyBoolean servletEnabled) {
    this.servletEnabled = servletEnabled;
    return this;
  }

 /**
   * Get recordingCacheSizeInMB
   * @return recordingCacheSizeInMB
  **/
  @JsonProperty("recordingCacheSizeInMB")
  public ConfigNodePropertyInteger getRecordingCacheSizeInMB() {
    return recordingCacheSizeInMB;
  }

  public void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB) {
    this.recordingCacheSizeInMB = recordingCacheSizeInMB;
    return this;
  }

 /**
   * Get recordingCacheDurationInSecs
   * @return recordingCacheDurationInSecs
  **/
  @JsonProperty("recordingCacheDurationInSecs")
  public ConfigNodePropertyInteger getRecordingCacheDurationInSecs() {
    return recordingCacheDurationInSecs;
  }

  public void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs) {
    this.recordingCacheDurationInSecs = recordingCacheDurationInSecs;
    return this;
  }

 /**
   * Get recordingCompressionEnabled
   * @return recordingCompressionEnabled
  **/
  @JsonProperty("recordingCompressionEnabled")
  public ConfigNodePropertyBoolean getRecordingCompressionEnabled() {
    return recordingCompressionEnabled;
  }

  public void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties recordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled) {
    this.recordingCompressionEnabled = recordingCompressionEnabled;
    return this;
  }

 /**
   * Get gzipResponse
   * @return gzipResponse
  **/
  @JsonProperty("gzipResponse")
  public ConfigNodePropertyBoolean getGzipResponse() {
    return gzipResponse;
  }

  public void setGzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
  }

  public OrgApacheSlingTracerInternalLogTracerProperties gzipResponse(ConfigNodePropertyBoolean gzipResponse) {
    this.gzipResponse = gzipResponse;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

