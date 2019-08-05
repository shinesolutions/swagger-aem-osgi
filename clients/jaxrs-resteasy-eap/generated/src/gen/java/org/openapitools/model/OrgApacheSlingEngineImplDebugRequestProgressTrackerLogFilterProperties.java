package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties   {
  

  private ConfigNodePropertyArray extensions = null;

  private ConfigNodePropertyInteger minDurationMs = null;

  private ConfigNodePropertyInteger maxDurationMs = null;

  private ConfigNodePropertyBoolean compactLogFormat = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extensions")
  public ConfigNodePropertyArray getExtensions() {
    return extensions;
  }
  public void setExtensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minDurationMs")
  public ConfigNodePropertyInteger getMinDurationMs() {
    return minDurationMs;
  }
  public void setMinDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxDurationMs")
  public ConfigNodePropertyInteger getMaxDurationMs() {
    return maxDurationMs;
  }
  public void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("compactLogFormat")
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
    return Objects.equals(extensions, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.extensions) &&
        Objects.equals(minDurationMs, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.minDurationMs) &&
        Objects.equals(maxDurationMs, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.maxDurationMs) &&
        Objects.equals(compactLogFormat, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.compactLogFormat);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

