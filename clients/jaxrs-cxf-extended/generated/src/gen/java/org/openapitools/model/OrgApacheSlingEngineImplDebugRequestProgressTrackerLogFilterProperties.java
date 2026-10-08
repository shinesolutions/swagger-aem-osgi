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


public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray extensions;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minDurationMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxDurationMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean compactLogFormat;
 /**
  * Get extensions
  * @return extensions
  */
  @JsonProperty("extensions")
  public ConfigNodePropertyArray getExtensions() {
    return extensions;
  }

  /**
   * Sets the <code>extensions</code> property.
   */
 public void setExtensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
  }

  /**
   * Sets the <code>extensions</code> property.
   */
  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties extensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
    return this;
  }

 /**
  * Get minDurationMs
  * @return minDurationMs
  */
  @JsonProperty("minDurationMs")
  public ConfigNodePropertyInteger getMinDurationMs() {
    return minDurationMs;
  }

  /**
   * Sets the <code>minDurationMs</code> property.
   */
 public void setMinDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

  /**
   * Sets the <code>minDurationMs</code> property.
   */
  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties minDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
    return this;
  }

 /**
  * Get maxDurationMs
  * @return maxDurationMs
  */
  @JsonProperty("maxDurationMs")
  public ConfigNodePropertyInteger getMaxDurationMs() {
    return maxDurationMs;
  }

  /**
   * Sets the <code>maxDurationMs</code> property.
   */
 public void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  /**
   * Sets the <code>maxDurationMs</code> property.
   */
  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties maxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
    return this;
  }

 /**
  * Get compactLogFormat
  * @return compactLogFormat
  */
  @JsonProperty("compactLogFormat")
  public ConfigNodePropertyBoolean getCompactLogFormat() {
    return compactLogFormat;
  }

  /**
   * Sets the <code>compactLogFormat</code> property.
   */
 public void setCompactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
  }

  /**
   * Sets the <code>compactLogFormat</code> property.
   */
  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties compactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
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
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties = (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties) o;
    return Objects.equals(this.extensions, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.extensions) &&
        Objects.equals(this.minDurationMs, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.minDurationMs) &&
        Objects.equals(this.maxDurationMs, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.maxDurationMs) &&
        Objects.equals(this.compactLogFormat, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.compactLogFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, minDurationMs, maxDurationMs, compactLogFormat);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

