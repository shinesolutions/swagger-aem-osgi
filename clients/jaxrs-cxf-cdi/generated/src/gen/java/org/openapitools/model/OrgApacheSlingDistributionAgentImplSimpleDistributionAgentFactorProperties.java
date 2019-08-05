package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties   {
  
  private ConfigNodePropertyString name = null;

  private ConfigNodePropertyString title = null;

  private ConfigNodePropertyString details = null;

  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyString serviceName = null;

  private ConfigNodePropertyDropDown logLevel = null;

  private ConfigNodePropertyBoolean queueProcessingEnabled = null;

  private ConfigNodePropertyString packageExporterTarget = null;

  private ConfigNodePropertyString packageImporterTarget = null;

  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  private ConfigNodePropertyString triggersTarget = null;


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }
  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }
  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }
  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageExporter.target")
  public ConfigNodePropertyString getPackageExporterTarget() {
    return packageExporterTarget;
  }
  public void setPackageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageImporter.target")
  public ConfigNodePropertyString getPackageImporterTarget() {
    return packageImporterTarget;
  }
  public void setPackageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }


  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }
  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties = (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.name) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.title) &&
        Objects.equals(details, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.details) &&
        Objects.equals(enabled, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.enabled) &&
        Objects.equals(serviceName, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.serviceName) &&
        Objects.equals(logLevel, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.logLevel) &&
        Objects.equals(queueProcessingEnabled, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.queueProcessingEnabled) &&
        Objects.equals(packageExporterTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.packageExporterTarget) &&
        Objects.equals(packageImporterTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.packageImporterTarget) &&
        Objects.equals(requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(triggersTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.triggersTarget);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

