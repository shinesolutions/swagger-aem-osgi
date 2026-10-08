package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
 */

@JsonTypeName("comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString operation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean emailEnabled;

  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties operation(@Nullable ConfigNodePropertyString operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @Valid 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation")
  public @Nullable ConfigNodePropertyString getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(@Nullable ConfigNodePropertyString operation) {
    this.operation = operation;
  }

  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties emailEnabled(@Nullable ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  /**
   * Get emailEnabled
   * @return emailEnabled
   */
  @Valid 
  @Schema(name = "emailEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailEnabled")
  public @Nullable ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  @JsonProperty("emailEnabled")
  public void setEmailEnabled(@Nullable ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties = (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties) o;
    return Objects.equals(this.operation, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.operation) &&
        Objects.equals(this.emailEnabled, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

