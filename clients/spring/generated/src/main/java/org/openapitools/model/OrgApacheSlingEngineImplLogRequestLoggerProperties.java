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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplLogRequestLoggerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestLogOutput;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown requestLogOutputtype;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean requestLogEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString accessLogOutput;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown accessLogOutputtype;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean accessLogEnabled;

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutput(@Nullable ConfigNodePropertyString requestLogOutput) {
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
  public @Nullable ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }

  @JsonProperty("request.log.output")
  public void setRequestLogOutput(@Nullable ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutputtype(@Nullable ConfigNodePropertyDropDown requestLogOutputtype) {
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
  public @Nullable ConfigNodePropertyDropDown getRequestLogOutputtype() {
    return requestLogOutputtype;
  }

  @JsonProperty("request.log.outputtype")
  public void setRequestLogOutputtype(@Nullable ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogEnabled(@Nullable ConfigNodePropertyBoolean requestLogEnabled) {
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
  public @Nullable ConfigNodePropertyBoolean getRequestLogEnabled() {
    return requestLogEnabled;
  }

  @JsonProperty("request.log.enabled")
  public void setRequestLogEnabled(@Nullable ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutput(@Nullable ConfigNodePropertyString accessLogOutput) {
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
  public @Nullable ConfigNodePropertyString getAccessLogOutput() {
    return accessLogOutput;
  }

  @JsonProperty("access.log.output")
  public void setAccessLogOutput(@Nullable ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutputtype(@Nullable ConfigNodePropertyDropDown accessLogOutputtype) {
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
  public @Nullable ConfigNodePropertyDropDown getAccessLogOutputtype() {
    return accessLogOutputtype;
  }

  @JsonProperty("access.log.outputtype")
  public void setAccessLogOutputtype(@Nullable ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogEnabled(@Nullable ConfigNodePropertyBoolean accessLogEnabled) {
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
  public @Nullable ConfigNodePropertyBoolean getAccessLogEnabled() {
    return accessLogEnabled;
  }

  @JsonProperty("access.log.enabled")
  public void setAccessLogEnabled(@Nullable ConfigNodePropertyBoolean accessLogEnabled) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

