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
 * OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
 */

@JsonTypeName("orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString title;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString details;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown logLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean queueProcessingEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString packageExporterTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString packageImporterTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString triggersTarget;

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties title(@Nullable ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Valid 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable ConfigNodePropertyString getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties details(@Nullable ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @Valid 
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public @Nullable ConfigNodePropertyString getDetails() {
    return details;
  }

  @JsonProperty("details")
  public void setDetails(@Nullable ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties serviceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @Valid 
  @Schema(name = "serviceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public @Nullable ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
  public void setServiceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties logLevel(@Nullable ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  /**
   * Get logLevel
   * @return logLevel
   */
  @Valid 
  @Schema(name = "log.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("log.level")
  public @Nullable ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  @JsonProperty("log.level")
  public void setLogLevel(@Nullable ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties queueProcessingEnabled(@Nullable ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

  /**
   * Get queueProcessingEnabled
   * @return queueProcessingEnabled
   */
  @Valid 
  @Schema(name = "queue.processing.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.processing.enabled")
  public @Nullable ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  @JsonProperty("queue.processing.enabled")
  public void setQueueProcessingEnabled(@Nullable ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageExporterTarget(@Nullable ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
    return this;
  }

  /**
   * Get packageExporterTarget
   * @return packageExporterTarget
   */
  @Valid 
  @Schema(name = "packageExporter.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageExporter.target")
  public @Nullable ConfigNodePropertyString getPackageExporterTarget() {
    return packageExporterTarget;
  }

  @JsonProperty("packageExporter.target")
  public void setPackageExporterTarget(@Nullable ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageImporterTarget(@Nullable ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
    return this;
  }

  /**
   * Get packageImporterTarget
   * @return packageImporterTarget
   */
  @Valid 
  @Schema(name = "packageImporter.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageImporter.target")
  public @Nullable ConfigNodePropertyString getPackageImporterTarget() {
    return packageImporterTarget;
  }

  @JsonProperty("packageImporter.target")
  public void setPackageImporterTarget(@Nullable ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties requestAuthorizationStrategyTarget(@Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

  /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
   */
  @Valid 
  @Schema(name = "requestAuthorizationStrategy.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestAuthorizationStrategy.target")
  public @Nullable ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  @JsonProperty("requestAuthorizationStrategy.target")
  public void setRequestAuthorizationStrategyTarget(@Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties triggersTarget(@Nullable ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

  /**
   * Get triggersTarget
   * @return triggersTarget
   */
  @Valid 
  @Schema(name = "triggers.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggers.target")
  public @Nullable ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  @JsonProperty("triggers.target")
  public void setTriggersTarget(@Nullable ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties = (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.name) &&
        Objects.equals(this.title, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.title) &&
        Objects.equals(this.details, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.details) &&
        Objects.equals(this.enabled, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.enabled) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.serviceName) &&
        Objects.equals(this.logLevel, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.logLevel) &&
        Objects.equals(this.queueProcessingEnabled, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.queueProcessingEnabled) &&
        Objects.equals(this.packageExporterTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.packageExporterTarget) &&
        Objects.equals(this.packageImporterTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.packageImporterTarget) &&
        Objects.equals(this.requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(this.triggersTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.triggersTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, queueProcessingEnabled, packageExporterTarget, packageImporterTarget, requestAuthorizationStrategyTarget, triggersTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
    sb.append("    packageExporterTarget: ").append(toIndentedString(packageExporterTarget)).append("\n");
    sb.append("    packageImporterTarget: ").append(toIndentedString(packageImporterTarget)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
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

