package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingEngineImplLogRequestLoggerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplLogRequestLoggerProperties   {
  private ConfigNodePropertyString requestLogOutput;
  private ConfigNodePropertyDropDown requestLogOutputtype;
  private ConfigNodePropertyBoolean requestLogEnabled;
  private ConfigNodePropertyString accessLogOutput;
  private ConfigNodePropertyDropDown accessLogOutputtype;
  private ConfigNodePropertyBoolean accessLogEnabled;

  public OrgApacheSlingEngineImplLogRequestLoggerProperties() {
  }

  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.output")
  @Valid public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }

  @JsonProperty("request.log.output")
  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.outputtype")
  @Valid public ConfigNodePropertyDropDown getRequestLogOutputtype() {
    return requestLogOutputtype;
  }

  @JsonProperty("request.log.outputtype")
  public void setRequestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
  }

  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.enabled")
  @Valid public ConfigNodePropertyBoolean getRequestLogEnabled() {
    return requestLogEnabled;
  }

  @JsonProperty("request.log.enabled")
  public void setRequestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
  }

  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("access.log.output")
  @Valid public ConfigNodePropertyString getAccessLogOutput() {
    return accessLogOutput;
  }

  @JsonProperty("access.log.output")
  public void setAccessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
  }

  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("access.log.outputtype")
  @Valid public ConfigNodePropertyDropDown getAccessLogOutputtype() {
    return accessLogOutputtype;
  }

  @JsonProperty("access.log.outputtype")
  public void setAccessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
  }

  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("access.log.enabled")
  @Valid public ConfigNodePropertyBoolean getAccessLogEnabled() {
    return accessLogEnabled;
  }

  @JsonProperty("access.log.enabled")
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
    return Objects.equals(this.requestLogOutput, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogOutput) &&
        Objects.equals(this.requestLogOutputtype, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogOutputtype) &&
        Objects.equals(this.requestLogEnabled, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogEnabled) &&
        Objects.equals(this.accessLogOutput, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogOutput) &&
        Objects.equals(this.accessLogOutputtype, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogOutputtype) &&
        Objects.equals(this.accessLogEnabled, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogEnabled);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
