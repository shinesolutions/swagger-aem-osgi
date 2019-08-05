package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties () {

  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties (ConfigNodePropertyString name, ConfigNodePropertyString title, ConfigNodePropertyString details, ConfigNodePropertyBoolean enabled, ConfigNodePropertyString serviceName, ConfigNodePropertyDropDown logLevel, ConfigNodePropertyBoolean queueProcessingEnabled, ConfigNodePropertyString packageExporterTarget, ConfigNodePropertyString packageImporterTarget, ConfigNodePropertyString requestAuthorizationStrategyTarget, ConfigNodePropertyString triggersTarget) {
    this.name = name;
    this.title = title;
    this.details = details;
    this.enabled = enabled;
    this.serviceName = serviceName;
    this.logLevel = logLevel;
    this.queueProcessingEnabled = queueProcessingEnabled;
    this.packageExporterTarget = packageExporterTarget;
    this.packageImporterTarget = packageImporterTarget;
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    this.triggersTarget = triggersTarget;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }
  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

    
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }
  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

    
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }
  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

    
  @JsonProperty("packageExporter.target")
  public ConfigNodePropertyString getPackageExporterTarget() {
    return packageExporterTarget;
  }
  public void setPackageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
  }

    
  @JsonProperty("packageImporter.target")
  public ConfigNodePropertyString getPackageImporterTarget() {
    return packageImporterTarget;
  }
  public void setPackageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
  }

    
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

    
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
