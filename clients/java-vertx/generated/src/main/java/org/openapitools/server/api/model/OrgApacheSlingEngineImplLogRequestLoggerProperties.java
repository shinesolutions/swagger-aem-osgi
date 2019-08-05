package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEngineImplLogRequestLoggerProperties   {
  
  private ConfigNodePropertyString requestLogOutput = null;
  private ConfigNodePropertyDropDown requestLogOutputtype = null;
  private ConfigNodePropertyBoolean requestLogEnabled = null;
  private ConfigNodePropertyString accessLogOutput = null;
  private ConfigNodePropertyDropDown accessLogOutputtype = null;
  private ConfigNodePropertyBoolean accessLogEnabled = null;

  public OrgApacheSlingEngineImplLogRequestLoggerProperties () {

  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties (ConfigNodePropertyString requestLogOutput, ConfigNodePropertyDropDown requestLogOutputtype, ConfigNodePropertyBoolean requestLogEnabled, ConfigNodePropertyString accessLogOutput, ConfigNodePropertyDropDown accessLogOutputtype, ConfigNodePropertyBoolean accessLogEnabled) {
    this.requestLogOutput = requestLogOutput;
    this.requestLogOutputtype = requestLogOutputtype;
    this.requestLogEnabled = requestLogEnabled;
    this.accessLogOutput = accessLogOutput;
    this.accessLogOutputtype = accessLogOutputtype;
    this.accessLogEnabled = accessLogEnabled;
  }

    
  @JsonProperty("request.log.output")
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }
  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

    
  @JsonProperty("request.log.outputtype")
  public ConfigNodePropertyDropDown getRequestLogOutputtype() {
    return requestLogOutputtype;
  }
  public void setRequestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
  }

    
  @JsonProperty("request.log.enabled")
  public ConfigNodePropertyBoolean getRequestLogEnabled() {
    return requestLogEnabled;
  }
  public void setRequestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
  }

    
  @JsonProperty("access.log.output")
  public ConfigNodePropertyString getAccessLogOutput() {
    return accessLogOutput;
  }
  public void setAccessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
  }

    
  @JsonProperty("access.log.outputtype")
  public ConfigNodePropertyDropDown getAccessLogOutputtype() {
    return accessLogOutputtype;
  }
  public void setAccessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
  }

    
  @JsonProperty("access.log.enabled")
  public ConfigNodePropertyBoolean getAccessLogEnabled() {
    return accessLogEnabled;
  }
  public void setAccessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplLogRequestLoggerProperties orgApacheSlingEngineImplLogRequestLoggerProperties = (OrgApacheSlingEngineImplLogRequestLoggerProperties) o;
    return Objects.equals(requestLogOutput, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogOutput) &&
        Objects.equals(requestLogOutputtype, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogOutputtype) &&
        Objects.equals(requestLogEnabled, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogEnabled) &&
        Objects.equals(accessLogOutput, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogOutput) &&
        Objects.equals(accessLogOutputtype, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogOutputtype) &&
        Objects.equals(accessLogEnabled, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestLogOutput, requestLogOutputtype, requestLogEnabled, accessLogOutput, accessLogOutputtype, accessLogEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineImplLogRequestLoggerProperties {\n");
    
    sb.append("    requestLogOutput: ").append(toIndentedString(requestLogOutput)).append("\n");
    sb.append("    requestLogOutputtype: ").append(toIndentedString(requestLogOutputtype)).append("\n");
    sb.append("    requestLogEnabled: ").append(toIndentedString(requestLogEnabled)).append("\n");
    sb.append("    accessLogOutput: ").append(toIndentedString(accessLogOutput)).append("\n");
    sb.append("    accessLogOutputtype: ").append(toIndentedString(accessLogOutputtype)).append("\n");
    sb.append("    accessLogEnabled: ").append(toIndentedString(accessLogEnabled)).append("\n");
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
