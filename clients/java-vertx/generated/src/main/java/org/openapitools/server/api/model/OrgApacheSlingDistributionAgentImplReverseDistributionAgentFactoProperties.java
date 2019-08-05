package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString title = null;
  private ConfigNodePropertyString details = null;
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyDropDown logLevel = null;
  private ConfigNodePropertyBoolean queueProcessingEnabled = null;
  private ConfigNodePropertyArray packageExporterEndpoints = null;
  private ConfigNodePropertyInteger pullItems = null;
  private ConfigNodePropertyInteger httpConnTimeout = null;
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;
  private ConfigNodePropertyString transportSecretProviderTarget = null;
  private ConfigNodePropertyString packageBuilderTarget = null;
  private ConfigNodePropertyString triggersTarget = null;

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties () {

  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties (ConfigNodePropertyString name, ConfigNodePropertyString title, ConfigNodePropertyString details, ConfigNodePropertyBoolean enabled, ConfigNodePropertyString serviceName, ConfigNodePropertyDropDown logLevel, ConfigNodePropertyBoolean queueProcessingEnabled, ConfigNodePropertyArray packageExporterEndpoints, ConfigNodePropertyInteger pullItems, ConfigNodePropertyInteger httpConnTimeout, ConfigNodePropertyString requestAuthorizationStrategyTarget, ConfigNodePropertyString transportSecretProviderTarget, ConfigNodePropertyString packageBuilderTarget, ConfigNodePropertyString triggersTarget) {
    this.name = name;
    this.title = title;
    this.details = details;
    this.enabled = enabled;
    this.serviceName = serviceName;
    this.logLevel = logLevel;
    this.queueProcessingEnabled = queueProcessingEnabled;
    this.packageExporterEndpoints = packageExporterEndpoints;
    this.pullItems = pullItems;
    this.httpConnTimeout = httpConnTimeout;
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    this.packageBuilderTarget = packageBuilderTarget;
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

    
  @JsonProperty("packageExporter.endpoints")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }
  public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

    
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }
  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

    
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }
  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

    
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

    
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }
  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

    
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
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
    OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties = (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.name) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.title) &&
        Objects.equals(details, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.details) &&
        Objects.equals(enabled, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.enabled) &&
        Objects.equals(serviceName, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.serviceName) &&
        Objects.equals(logLevel, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.logLevel) &&
        Objects.equals(queueProcessingEnabled, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.queueProcessingEnabled) &&
        Objects.equals(packageExporterEndpoints, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.packageExporterEndpoints) &&
        Objects.equals(pullItems, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.pullItems) &&
        Objects.equals(httpConnTimeout, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.httpConnTimeout) &&
        Objects.equals(requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(transportSecretProviderTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.transportSecretProviderTarget) &&
        Objects.equals(packageBuilderTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.packageBuilderTarget) &&
        Objects.equals(triggersTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.triggersTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, queueProcessingEnabled, packageExporterEndpoints, pullItems, httpConnTimeout, requestAuthorizationStrategyTarget, transportSecretProviderTarget, packageBuilderTarget, triggersTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
    sb.append("    packageExporterEndpoints: ").append(toIndentedString(packageExporterEndpoints)).append("\n");
    sb.append("    pullItems: ").append(toIndentedString(pullItems)).append("\n");
    sb.append("    httpConnTimeout: ").append(toIndentedString(httpConnTimeout)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
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
