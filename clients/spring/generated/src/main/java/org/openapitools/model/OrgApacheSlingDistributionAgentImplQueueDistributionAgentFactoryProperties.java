package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("title")
  private ConfigNodePropertyString title = null;

  @JsonProperty("details")
  private ConfigNodePropertyString details = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("log.level")
  private ConfigNodePropertyDropDown logLevel = null;

  @JsonProperty("allowed.roots")
  private ConfigNodePropertyArray allowedRoots = null;

  @JsonProperty("requestAuthorizationStrategy.target")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  @JsonProperty("queueProviderFactory.target")
  private ConfigNodePropertyString queueProviderFactoryTarget = null;

  @JsonProperty("packageBuilder.target")
  private ConfigNodePropertyString packageBuilderTarget = null;

  @JsonProperty("triggers.target")
  private ConfigNodePropertyString triggersTarget = null;

  @JsonProperty("priorityQueues")
  private ConfigNodePropertyArray priorityQueues = null;

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  /**
   * Get logLevel
   * @return logLevel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties allowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
    return this;
  }

  /**
   * Get allowedRoots
   * @return allowedRoots
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }

  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

  /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties queueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
    return this;
  }

  /**
   * Get queueProviderFactoryTarget
   * @return queueProviderFactoryTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getQueueProviderFactoryTarget() {
    return queueProviderFactoryTarget;
  }

  public void setQueueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

  /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

  /**
   * Get triggersTarget
   * @return triggersTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties priorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
    return this;
  }

  /**
   * Get priorityQueues
   * @return priorityQueues
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }

  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

