package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties   {
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

  @JsonProperty("queue.processing.enabled")
  private ConfigNodePropertyBoolean queueProcessingEnabled = null;

  @JsonProperty("packageExporter.target")
  private ConfigNodePropertyString packageExporterTarget = null;

  @JsonProperty("packageImporter.target")
  private ConfigNodePropertyString packageImporterTarget = null;

  @JsonProperty("requestAuthorizationStrategy.target")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  @JsonProperty("triggers.target")
  private ConfigNodePropertyString triggersTarget = null;

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties name(ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties title(ConfigNodePropertyString title) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties details(ConfigNodePropertyString details) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties enabled(ConfigNodePropertyBoolean enabled) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties serviceName(ConfigNodePropertyString serviceName) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties logLevel(ConfigNodePropertyDropDown logLevel) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

  /**
   * Get queueProcessingEnabled
   * @return queueProcessingEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
    return this;
  }

  /**
   * Get packageExporterTarget
   * @return packageExporterTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getPackageExporterTarget() {
    return packageExporterTarget;
  }

  public void setPackageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
    return this;
  }

  /**
   * Get packageImporterTarget
   * @return packageImporterTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getPackageImporterTarget() {
    return packageImporterTarget;
  }

  public void setPackageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
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


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

