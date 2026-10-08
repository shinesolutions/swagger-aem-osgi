package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingEngineImplLogRequestLoggerProperties
 */

@JsonTypeName("orgApacheSlingEngineImplLogRequestLoggerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplLogRequestLoggerProperties {

  private ConfigNodePropertyString requestLogOutput;

  private ConfigNodePropertyDropDown requestLogOutputtype;

  private ConfigNodePropertyBoolean requestLogEnabled;

  private ConfigNodePropertyString accessLogOutput;

  private ConfigNodePropertyDropDown accessLogOutputtype;

  private ConfigNodePropertyBoolean accessLogEnabled;

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
  }

  /**
   * Get requestLogOutput
   * @return requestLogOutput
   */
  @Valid 
  @Schema(name = "request.log.output", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.output")
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }

  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
    return this;
  }

  /**
   * Get requestLogOutputtype
   * @return requestLogOutputtype
   */
  @Valid 
  @Schema(name = "request.log.outputtype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.outputtype")
  public ConfigNodePropertyDropDown getRequestLogOutputtype() {
    return requestLogOutputtype;
  }

  public void setRequestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
    return this;
  }

  /**
   * Get requestLogEnabled
   * @return requestLogEnabled
   */
  @Valid 
  @Schema(name = "request.log.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.enabled")
  public ConfigNodePropertyBoolean getRequestLogEnabled() {
    return requestLogEnabled;
  }

  public void setRequestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
    return this;
  }

  /**
   * Get accessLogOutput
   * @return accessLogOutput
   */
  @Valid 
  @Schema(name = "access.log.output", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access.log.output")
  public ConfigNodePropertyString getAccessLogOutput() {
    return accessLogOutput;
  }

  public void setAccessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
    return this;
  }

  /**
   * Get accessLogOutputtype
   * @return accessLogOutputtype
   */
  @Valid 
  @Schema(name = "access.log.outputtype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access.log.outputtype")
  public ConfigNodePropertyDropDown getAccessLogOutputtype() {
    return accessLogOutputtype;
  }

  public void setAccessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
    return this;
  }

  /**
   * Get accessLogEnabled
   * @return accessLogEnabled
   */
  @Valid 
  @Schema(name = "access.log.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

