package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString title = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString details = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown logLevel = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray allowedRoots = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString queueProviderFactoryTarget = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString packageBuilderTarget = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString triggersTarget = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray priorityQueues = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get serviceName
   * @return serviceName
  **/
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Get logLevel
   * @return logLevel
  **/
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

 /**
   * Get allowedRoots
   * @return allowedRoots
  **/
  @JsonProperty("allowed.roots")
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }

  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties allowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
    return this;
  }

 /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
  **/
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

 /**
   * Get queueProviderFactoryTarget
   * @return queueProviderFactoryTarget
  **/
  @JsonProperty("queueProviderFactory.target")
  public ConfigNodePropertyString getQueueProviderFactoryTarget() {
    return queueProviderFactoryTarget;
  }

  public void setQueueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties queueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
    return this;
  }

 /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
  **/
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

 /**
   * Get triggersTarget
   * @return triggersTarget
  **/
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

 /**
   * Get priorityQueues
   * @return priorityQueues
  **/
  @JsonProperty("priorityQueues")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }

  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties priorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

