package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString title;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString details;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown logLevel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean queueProcessingEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray packageExporterEndpoints;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger pullItems;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger httpConnTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString transportSecretProviderTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString packageBuilderTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString triggersTarget;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

 /**
  * Get details
  * @return details
  */
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  /**
   * Sets the <code>details</code> property.
   */
 public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  /**
   * Sets the <code>details</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

 /**
  * Get enabled
  * @return enabled
  */
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
 public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
  * Get serviceName
  * @return serviceName
  */
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  /**
   * Sets the <code>serviceName</code> property.
   */
 public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Sets the <code>serviceName</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
  * Get logLevel
  * @return logLevel
  */
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  /**
   * Sets the <code>logLevel</code> property.
   */
 public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * Sets the <code>logLevel</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

 /**
  * Get queueProcessingEnabled
  * @return queueProcessingEnabled
  */
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  /**
   * Sets the <code>queueProcessingEnabled</code> property.
   */
 public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  /**
   * Sets the <code>queueProcessingEnabled</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

 /**
  * Get packageExporterEndpoints
  * @return packageExporterEndpoints
  */
  @JsonProperty("packageExporter.endpoints")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }

  /**
   * Sets the <code>packageExporterEndpoints</code> property.
   */
 public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  /**
   * Sets the <code>packageExporterEndpoints</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties packageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
    return this;
  }

 /**
  * Get pullItems
  * @return pullItems
  */
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  /**
   * Sets the <code>pullItems</code> property.
   */
 public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  /**
   * Sets the <code>pullItems</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

 /**
  * Get httpConnTimeout
  * @return httpConnTimeout
  */
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }

  /**
   * Sets the <code>httpConnTimeout</code> property.
   */
 public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  /**
   * Sets the <code>httpConnTimeout</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
  }

 /**
  * Get requestAuthorizationStrategyTarget
  * @return requestAuthorizationStrategyTarget
  */
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  /**
   * Sets the <code>requestAuthorizationStrategyTarget</code> property.
   */
 public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  /**
   * Sets the <code>requestAuthorizationStrategyTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

 /**
  * Get transportSecretProviderTarget
  * @return transportSecretProviderTarget
  */
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  /**
   * Sets the <code>transportSecretProviderTarget</code> property.
   */
 public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  /**
   * Sets the <code>transportSecretProviderTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

 /**
  * Get packageBuilderTarget
  * @return packageBuilderTarget
  */
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  /**
   * Sets the <code>packageBuilderTarget</code> property.
   */
 public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   * Sets the <code>packageBuilderTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

 /**
  * Get triggersTarget
  * @return triggersTarget
  */
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  /**
   * Sets the <code>triggersTarget</code> property.
   */
 public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  /**
   * Sets the <code>triggersTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
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
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.name) &&
        Objects.equals(this.title, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.title) &&
        Objects.equals(this.details, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.details) &&
        Objects.equals(this.enabled, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.enabled) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.serviceName) &&
        Objects.equals(this.logLevel, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.logLevel) &&
        Objects.equals(this.queueProcessingEnabled, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.queueProcessingEnabled) &&
        Objects.equals(this.packageExporterEndpoints, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.packageExporterEndpoints) &&
        Objects.equals(this.pullItems, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.pullItems) &&
        Objects.equals(this.httpConnTimeout, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.httpConnTimeout) &&
        Objects.equals(this.requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(this.transportSecretProviderTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.transportSecretProviderTarget) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.packageBuilderTarget) &&
        Objects.equals(this.triggersTarget, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.triggersTarget);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

