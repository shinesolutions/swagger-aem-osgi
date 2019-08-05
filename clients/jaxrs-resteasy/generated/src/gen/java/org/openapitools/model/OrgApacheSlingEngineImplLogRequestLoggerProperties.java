package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingEngineImplLogRequestLoggerProperties   {
  
  private ConfigNodePropertyString requestLogOutput = null;
  private ConfigNodePropertyDropDown requestLogOutputtype = null;
  private ConfigNodePropertyBoolean requestLogEnabled = null;
  private ConfigNodePropertyString accessLogOutput = null;
  private ConfigNodePropertyDropDown accessLogOutputtype = null;
  private ConfigNodePropertyBoolean accessLogEnabled = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.output")
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }
  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.outputtype")
  public ConfigNodePropertyDropDown getRequestLogOutputtype() {
    return requestLogOutputtype;
  }
  public void setRequestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.enabled")
  public ConfigNodePropertyBoolean getRequestLogEnabled() {
    return requestLogEnabled;
  }
  public void setRequestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("access.log.output")
  public ConfigNodePropertyString getAccessLogOutput() {
    return accessLogOutput;
  }
  public void setAccessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("access.log.outputtype")
  public ConfigNodePropertyDropDown getAccessLogOutputtype() {
    return accessLogOutputtype;
  }
  public void setAccessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("access.log.enabled")
  public ConfigNodePropertyBoolean getAccessLogEnabled() {
    return accessLogEnabled;
  }
  public void setAccessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

