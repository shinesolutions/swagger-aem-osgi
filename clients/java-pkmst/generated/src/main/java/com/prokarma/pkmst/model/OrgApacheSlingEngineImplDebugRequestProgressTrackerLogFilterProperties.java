package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties   {
  @JsonProperty("extensions")
  private ConfigNodePropertyArray extensions;

  @JsonProperty("minDurationMs")
  private ConfigNodePropertyInteger minDurationMs;

  @JsonProperty("maxDurationMs")
  private ConfigNodePropertyInteger maxDurationMs;

  @JsonProperty("compactLogFormat")
  private ConfigNodePropertyBoolean compactLogFormat;

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties extensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
    return this;
  }

  /**
   * Get extensions
   * @return extensions
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExtensions() {
    return extensions;
  }

  public void setExtensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties minDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
    return this;
  }

  /**
   * Get minDurationMs
   * @return minDurationMs
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinDurationMs() {
    return minDurationMs;
  }

  public void setMinDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties maxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
    return this;
  }

  /**
   * Get maxDurationMs
   * @return maxDurationMs
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxDurationMs() {
    return maxDurationMs;
  }

  public void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties compactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
    return this;
  }

  /**
   * Get compactLogFormat
   * @return compactLogFormat
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCompactLogFormat() {
    return compactLogFormat;
  }

  public void setCompactLogFormat(ConfigNodePropertyBoolean compactLogFormat) {
    this.compactLogFormat = compactLogFormat;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

