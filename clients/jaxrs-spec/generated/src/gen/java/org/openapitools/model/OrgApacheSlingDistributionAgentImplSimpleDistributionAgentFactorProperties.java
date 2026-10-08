package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties   {
  private ConfigNodePropertyString name;
  private ConfigNodePropertyString title;
  private ConfigNodePropertyString details;
  private ConfigNodePropertyBoolean enabled;
  private ConfigNodePropertyString serviceName;
  private ConfigNodePropertyDropDown logLevel;
  private ConfigNodePropertyBoolean queueProcessingEnabled;
  private ConfigNodePropertyString packageExporterTarget;
  private ConfigNodePropertyString packageImporterTarget;
  private ConfigNodePropertyString requestAuthorizationStrategyTarget;
  private ConfigNodePropertyString triggersTarget;

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties() {
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  @Valid public ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
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
  @Valid public ConfigNodePropertyString getTitle() {
    return title;
  }

  @JsonProperty("title")
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
  @Valid public ConfigNodePropertyString getDetails() {
    return details;
  }

  @JsonProperty("details")
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
  @Valid public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
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
  @Valid public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
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
  @Valid public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  @JsonProperty("log.level")
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
  @Valid public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  @JsonProperty("queue.processing.enabled")
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
  @Valid public ConfigNodePropertyString getPackageExporterTarget() {
    return packageExporterTarget;
  }

  @JsonProperty("packageExporter.target")
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
  @Valid public ConfigNodePropertyString getPackageImporterTarget() {
    return packageImporterTarget;
  }

  @JsonProperty("packageImporter.target")
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
  @Valid public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  @JsonProperty("requestAuthorizationStrategy.target")
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
  @Valid public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  @JsonProperty("triggers.target")
  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
