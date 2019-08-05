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

public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray extensions = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minDurationMs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxDurationMs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean compactLogFormat = null;
 /**
   * Get extensions
   * @return extensions
  **/
  @JsonProperty("extensions")
  public ConfigNodePropertyArray getExtensions() {
    return extensions;
  }

  public void setExtensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties extensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
    return this;
  }

 /**
   * Get minDurationMs
   * @return minDurationMs
  **/
  @JsonProperty("minDurationMs")
  public ConfigNodePropertyInteger getMinDurationMs() {
    return minDurationMs;
  }

  public void setMinDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties minDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
    return this;
  }

 /**
   * Get maxDurationMs
   * @return maxDurationMs
  **/
  @JsonProperty("maxDurationMs")
  public ConfigNodePropertyInteger getMaxDurationMs() {
    return maxDurationMs;
  }

  public void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties maxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
    return this;
  }

 /**
   * Get compactLogFormat
   * @return compactLogFormat
  **/
  @JsonProperty("compactLogFormat")
  public ConfigNodePropertyBoolean getCompactLogFormat() {
    return compactLogFormat;
  }

  public void setCompactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties compactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
    return this;
  }


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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

