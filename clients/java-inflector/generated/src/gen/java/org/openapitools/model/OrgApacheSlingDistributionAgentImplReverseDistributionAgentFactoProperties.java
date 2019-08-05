package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties   {
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

  @JsonProperty("packageExporter.endpoints")
  private ConfigNodePropertyArray packageExporterEndpoints = null;

  @JsonProperty("pull.items")
  private ConfigNodePropertyInteger pullItems = null;

  @JsonProperty("http.conn.timeout")
  private ConfigNodePropertyInteger httpConnTimeout = null;

  @JsonProperty("requestAuthorizationStrategy.target")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  @JsonProperty("transportSecretProvider.target")
  private ConfigNodePropertyString transportSecretProviderTarget = null;

  @JsonProperty("packageBuilder.target")
  private ConfigNodePropertyString packageBuilderTarget = null;

  @JsonProperty("triggers.target")
  private ConfigNodePropertyString triggersTarget = null;

  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties name(ConfigNodePropertyString name) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties title(ConfigNodePropertyString title) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties details(ConfigNodePropertyString details) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties serviceName(ConfigNodePropertyString serviceName) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties logLevel(ConfigNodePropertyDropDown logLevel) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties packageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageExporter.endpoints")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }
  public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }
  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }
  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }
  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

