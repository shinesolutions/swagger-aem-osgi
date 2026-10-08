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
 * OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
 */

@JsonTypeName("orgApacheSlingEngineImplLogRequestLoggerServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestLogServiceFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestLogServiceOutput;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown requestLogServiceOutputtype;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean requestLogServiceOnentry;

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceFormat(@Nullable ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
    return this;
  }

  /**
   * Get requestLogServiceFormat
   * @return requestLogServiceFormat
   */
  @Valid 
  @Schema(name = "request.log.service.format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.service.format")
  public @Nullable ConfigNodePropertyString getRequestLogServiceFormat() {
    return requestLogServiceFormat;
  }

  @JsonProperty("request.log.service.format")
  public void setRequestLogServiceFormat(@Nullable ConfigNodePropertyString requestLogServiceFormat) {
    this.requestLogServiceFormat = requestLogServiceFormat;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutput(@Nullable ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
    return this;
  }

  /**
   * Get requestLogServiceOutput
   * @return requestLogServiceOutput
   */
  @Valid 
  @Schema(name = "request.log.service.output", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.service.output")
  public @Nullable ConfigNodePropertyString getRequestLogServiceOutput() {
    return requestLogServiceOutput;
  }

  @JsonProperty("request.log.service.output")
  public void setRequestLogServiceOutput(@Nullable ConfigNodePropertyString requestLogServiceOutput) {
    this.requestLogServiceOutput = requestLogServiceOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOutputtype(@Nullable ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
    return this;
  }

  /**
   * Get requestLogServiceOutputtype
   * @return requestLogServiceOutputtype
   */
  @Valid 
  @Schema(name = "request.log.service.outputtype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.service.outputtype")
  public @Nullable ConfigNodePropertyDropDown getRequestLogServiceOutputtype() {
    return requestLogServiceOutputtype;
  }

  @JsonProperty("request.log.service.outputtype")
  public void setRequestLogServiceOutputtype(@Nullable ConfigNodePropertyDropDown requestLogServiceOutputtype) {
    this.requestLogServiceOutputtype = requestLogServiceOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties requestLogServiceOnentry(@Nullable ConfigNodePropertyBoolean requestLogServiceOnentry) {
    this.requestLogServiceOnentry = requestLogServiceOnentry;
    return this;
  }

  /**
   * Get requestLogServiceOnentry
   * @return requestLogServiceOnentry
   */
  @Valid 
  @Schema(name = "request.log.service.onentry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.log.service.onentry")
  public @Nullable ConfigNodePropertyBoolean getRequestLogServiceOnentry() {
    return requestLogServiceOnentry;
  }

  @JsonProperty("request.log.service.onentry")
  public void setRequestLogServiceOnentry(@Nullable ConfigNodePropertyBoolean requestLogServiceOnentry) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

