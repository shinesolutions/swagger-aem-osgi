package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties   {
  
  private ConfigNodePropertyArray extensions = null;
  private ConfigNodePropertyInteger minDurationMs = null;
  private ConfigNodePropertyInteger maxDurationMs = null;
  private ConfigNodePropertyBoolean compactLogFormat = null;

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties () {

  }

  public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties (ConfigNodePropertyArray extensions, ConfigNodePropertyInteger minDurationMs, ConfigNodePropertyInteger maxDurationMs, ConfigNodePropertyBoolean compactLogFormat) {
    this.extensions = extensions;
    this.minDurationMs = minDurationMs;
    this.maxDurationMs = maxDurationMs;
    this.compactLogFormat = compactLogFormat;
  }

    
  @JsonProperty("extensions")
  public ConfigNodePropertyArray getExtensions() {
    return extensions;
  }
  public void setExtensions(ConfigNodePropertyArray extensions) {
    this.extensions = extensions;
  }

    
  @JsonProperty("minDurationMs")
  public ConfigNodePropertyInteger getMinDurationMs() {
    return minDurationMs;
  }
  public void setMinDurationMs(ConfigNodePropertyInteger minDurationMs) {
    this.minDurationMs = minDurationMs;
  }

    
  @JsonProperty("maxDurationMs")
  public ConfigNodePropertyInteger getMaxDurationMs() {
    return maxDurationMs;
  }
  public void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs) {
    this.maxDurationMs = maxDurationMs;
  }

    
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
