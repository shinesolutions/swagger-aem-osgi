package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
 */

@JsonTypeName("orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {

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
  private @Nullable ConfigNodePropertyArray allowedRoots;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString queueProviderFactoryTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString packageBuilderTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString triggersTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray priorityQueues;

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties name(@Nullable ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties title(@Nullable ConfigNodePropertyString title) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties details(@Nullable ConfigNodePropertyString details) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties serviceName(@Nullable ConfigNodePropertyString serviceName) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties logLevel(@Nullable ConfigNodePropertyDropDown logLevel) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties allowedRoots(@Nullable ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
    return this;
  }

  /**
   * Get allowedRoots
   * @return allowedRoots
   */
  @Valid 
  @Schema(name = "allowed.roots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed.roots")
  public @Nullable ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }

  @JsonProperty("allowed.roots")
  public void setAllowedRoots(@Nullable ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(@Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties queueProviderFactoryTarget(@Nullable ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
    return this;
  }

  /**
   * Get queueProviderFactoryTarget
   * @return queueProviderFactoryTarget
   */
  @Valid 
  @Schema(name = "queueProviderFactory.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueProviderFactory.target")
  public @Nullable ConfigNodePropertyString getQueueProviderFactoryTarget() {
    return queueProviderFactoryTarget;
  }

  @JsonProperty("queueProviderFactory.target")
  public void setQueueProviderFactoryTarget(@Nullable ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties packageBuilderTarget(@Nullable ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

  /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
   */
  @Valid 
  @Schema(name = "packageBuilder.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageBuilder.target")
  public @Nullable ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  @JsonProperty("packageBuilder.target")
  public void setPackageBuilderTarget(@Nullable ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties triggersTarget(@Nullable ConfigNodePropertyString triggersTarget) {
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties priorityQueues(@Nullable ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
    return this;
  }

  /**
   * Get priorityQueues
   * @return priorityQueues
   */
  @Valid 
  @Schema(name = "priorityQueues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priorityQueues")
  public @Nullable ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }

  @JsonProperty("priorityQueues")
  public void setPriorityQueues(@Nullable ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties = (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.name) &&
        Objects.equals(this.title, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.title) &&
        Objects.equals(this.details, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.details) &&
        Objects.equals(this.enabled, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.enabled) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.serviceName) &&
        Objects.equals(this.logLevel, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.logLevel) &&
        Objects.equals(this.allowedRoots, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.allowedRoots) &&
        Objects.equals(this.requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(this.queueProviderFactoryTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.queueProviderFactoryTarget) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.packageBuilderTarget) &&
        Objects.equals(this.triggersTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.triggersTarget) &&
        Objects.equals(this.priorityQueues, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.priorityQueues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, allowedRoots, requestAuthorizationStrategyTarget, queueProviderFactoryTarget, packageBuilderTarget, triggersTarget, priorityQueues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    allowedRoots: ").append(toIndentedString(allowedRoots)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    queueProviderFactoryTarget: ").append(toIndentedString(queueProviderFactoryTarget)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
    sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
    sb.append("    priorityQueues: ").append(toIndentedString(priorityQueues)).append("\n");
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

