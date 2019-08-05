package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString requestLogServiceFormat = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString requestLogServiceOutput = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown requestLogServiceOutputtype = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean requestLogServiceOnentry = null;
 /**
   * Get requestLogServiceFormat
   * @return requestLogServiceFormat
  **/
  @JsonProperty("request.log.service.format")
  public ConfigNodePropertyString getRequestLogServiceFormat() {
    return requestLogServiceFormat;
  }

  public void setRequestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
    return this;
  }

 /**
   * Get requestLogServiceOutput
   * @return requestLogServiceOutput
  **/
  @JsonProperty("request.log.service.output")
  public ConfigNodePropertyString getRequestLogServiceOutput() {
    return requestLogServiceOutput;
  }

  public void setRequestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
    return this;
  }

 /**
   * Get requestLogServiceOutputtype
   * @return requestLogServiceOutputtype
  **/
  @JsonProperty("request.log.service.outputtype")
  public ConfigNodePropertyDropDown getRequestLogServiceOutputtype() {
    return requestLogServiceOutputtype;
  }

  public void setRequestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
    return this;
  }

 /**
   * Get requestLogServiceOnentry
   * @return requestLogServiceOnentry
  **/
  @JsonProperty("request.log.service.onentry")
  public ConfigNodePropertyBoolean getRequestLogServiceOnentry() {
    return requestLogServiceOnentry;
  }

  public void setRequestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {\n");
    
    sb.append("    requestLogServiceFormat: ").append(toIndentedString(requestLogServiceFormat)).append("\n");
    sb.append("    requestLogServiceOutput: ").append(toIndentedString(requestLogServiceOutput)).append("\n");
    sb.append("    requestLogServiceOutputtype: ").append(toIndentedString(requestLogServiceOutputtype)).append("\n");
    sb.append("    requestLogServiceOnentry: ").append(toIndentedString(requestLogServiceOnentry)).append("\n");
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

