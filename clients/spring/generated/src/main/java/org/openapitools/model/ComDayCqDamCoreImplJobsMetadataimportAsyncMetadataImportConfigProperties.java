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
 * ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
 */

@JsonTypeName("comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString operation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString operationIcon;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString topicName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean emailEnabled;

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties operation(@Nullable ConfigNodePropertyString operation) {
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

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties operationIcon(@Nullable ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
    return this;
  }

  /**
   * Get operationIcon
   * @return operationIcon
   */
  @Valid 
  @Schema(name = "operationIcon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationIcon")
  public @Nullable ConfigNodePropertyString getOperationIcon() {
    return operationIcon;
  }

  @JsonProperty("operationIcon")
  public void setOperationIcon(@Nullable ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties topicName(@Nullable ConfigNodePropertyString topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Get topicName
   * @return topicName
   */
  @Valid 
  @Schema(name = "topicName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topicName")
  public @Nullable ConfigNodePropertyString getTopicName() {
    return topicName;
  }

  @JsonProperty("topicName")
  public void setTopicName(@Nullable ConfigNodePropertyString topicName) {
    this.topicName = topicName;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties emailEnabled(@Nullable ConfigNodePropertyBoolean emailEnabled) {
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
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties = (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties) o;
    return Objects.equals(this.operation, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.operation) &&
        Objects.equals(this.operationIcon, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.operationIcon) &&
        Objects.equals(this.topicName, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.topicName) &&
        Objects.equals(this.emailEnabled, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, operationIcon, topicName, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    operationIcon: ").append(toIndentedString(operationIcon)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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

