package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingEngineImplLogRequestLoggerProperties   {
  
  private ConfigNodePropertyString requestLogOutput = null;

  private ConfigNodePropertyDropDown requestLogOutputtype = null;

  private ConfigNodePropertyBoolean requestLogEnabled = null;

  private ConfigNodePropertyString accessLogOutput = null;

  private ConfigNodePropertyDropDown accessLogOutputtype = null;

  private ConfigNodePropertyBoolean accessLogEnabled = null;


  /**
   **/
  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
  }

  
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
  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
    return this;
  }

  
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
  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
    return this;
  }

  
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
  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
    return this;
  }

  
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
  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
    return this;
  }

  
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
  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
    return this;
  }

  
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

