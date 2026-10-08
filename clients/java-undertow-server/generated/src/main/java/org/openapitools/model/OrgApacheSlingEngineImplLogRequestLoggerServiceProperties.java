/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties   {
  
  private ConfigNodePropertyString requestLogServiceFormat;
  private ConfigNodePropertyString requestLogServiceOutput;
  private ConfigNodePropertyDropDown requestLogServiceOutputtype;
  private ConfigNodePropertyBoolean requestLogServiceOnentry;

  /**
   */
  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.service.format")
  public ConfigNodePropertyString getRequestLogServiceFormat() {
    return requestLogServiceFormat;
  }
  public void setRequestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
  }

  /**
   */
  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.service.output")
  public ConfigNodePropertyString getRequestLogServiceOutput() {
    return requestLogServiceOutput;
  }
  public void setRequestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
  }

  /**
   */
  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.service.outputtype")
  public ConfigNodePropertyDropDown getRequestLogServiceOutputtype() {
    return requestLogServiceOutputtype;
  }
  public void setRequestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
  }

  /**
   */
  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.service.onentry")
  public ConfigNodePropertyBoolean getRequestLogServiceOnentry() {
    return requestLogServiceOnentry;
  }
  public void setRequestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties orgApacheSlingEngineImplLogRequestLoggerServiceProperties = (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties) o;
    return Objects.equals(requestLogServiceFormat, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceFormat) &&
        Objects.equals(requestLogServiceOutput, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceOutput) &&
        Objects.equals(requestLogServiceOutputtype, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceOutputtype) &&
        Objects.equals(requestLogServiceOnentry, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceOnentry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestLogServiceFormat, requestLogServiceOutput, requestLogServiceOutputtype, requestLogServiceOnentry);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

