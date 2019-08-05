package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties   {
  @JsonProperty("request.log.service.format")
  private ConfigNodePropertyString requestLogServiceFormat = null;

  @JsonProperty("request.log.service.output")
  private ConfigNodePropertyString requestLogServiceOutput = null;

  @JsonProperty("request.log.service.outputtype")
  private ConfigNodePropertyDropDown requestLogServiceOutputtype = null;

  @JsonProperty("request.log.service.onentry")
  private ConfigNodePropertyBoolean requestLogServiceOnentry = null;

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
    return this;
  }

  /**
   * Get requestLogServiceFormat
   * @return requestLogServiceFormat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRequestLogServiceFormat() {
    return requestLogServiceFormat;
  }

  public void setRequestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
    return this;
  }

  /**
   * Get requestLogServiceOutput
   * @return requestLogServiceOutput
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRequestLogServiceOutput() {
    return requestLogServiceOutput;
  }

  public void setRequestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
    return this;
  }

  /**
   * Get requestLogServiceOutputtype
   * @return requestLogServiceOutputtype
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getRequestLogServiceOutputtype() {
    return requestLogServiceOutputtype;
  }

  public void setRequestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
    return this;
  }

  /**
   * Get requestLogServiceOnentry
   * @return requestLogServiceOnentry
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getRequestLogServiceOnentry() {
    return requestLogServiceOnentry;
  }

  public void setRequestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties orgApacheSlingEngineImplLogRequestLoggerServiceProperties = (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties) o;
    return Objects.equals(this.requestLogServiceFormat, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceFormat) &&
        Objects.equals(this.requestLogServiceOutput, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceOutput) &&
        Objects.equals(this.requestLogServiceOutputtype, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceOutputtype) &&
        Objects.equals(this.requestLogServiceOnentry, orgApacheSlingEngineImplLogRequestLoggerServiceProperties.requestLogServiceOnentry);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

