/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyDropDown;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private ConfigNodePropertyString name = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private ConfigNodePropertyString title = null;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private ConfigNodePropertyString details = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private ConfigNodePropertyBoolean enabled = null;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private ConfigNodePropertyString serviceName = null;

  public static final String SERIALIZED_NAME_LOG_LEVEL = "log.level";
  @SerializedName(SERIALIZED_NAME_LOG_LEVEL)
  private ConfigNodePropertyDropDown logLevel = null;

  public static final String SERIALIZED_NAME_QUEUE_PROCESSING_ENABLED = "queue.processing.enabled";
  @SerializedName(SERIALIZED_NAME_QUEUE_PROCESSING_ENABLED)
  private ConfigNodePropertyBoolean queueProcessingEnabled = null;

  public static final String SERIALIZED_NAME_PACKAGE_EXPORTER_ENDPOINTS = "packageExporter.endpoints";
  @SerializedName(SERIALIZED_NAME_PACKAGE_EXPORTER_ENDPOINTS)
  private ConfigNodePropertyArray packageExporterEndpoints = null;

  public static final String SERIALIZED_NAME_PULL_ITEMS = "pull.items";
  @SerializedName(SERIALIZED_NAME_PULL_ITEMS)
  private ConfigNodePropertyInteger pullItems = null;

  public static final String SERIALIZED_NAME_HTTP_CONN_TIMEOUT = "http.conn.timeout";
  @SerializedName(SERIALIZED_NAME_HTTP_CONN_TIMEOUT)
  private ConfigNodePropertyInteger httpConnTimeout = null;

  public static final String SERIALIZED_NAME_REQUEST_AUTHORIZATION_STRATEGY_TARGET = "requestAuthorizationStrategy.target";
  @SerializedName(SERIALIZED_NAME_REQUEST_AUTHORIZATION_STRATEGY_TARGET)
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  public static final String SERIALIZED_NAME_TRANSPORT_SECRET_PROVIDER_TARGET = "transportSecretProvider.target";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_SECRET_PROVIDER_TARGET)
  private ConfigNodePropertyString transportSecretProviderTarget = null;

  public static final String SERIALIZED_NAME_PACKAGE_BUILDER_TARGET = "packageBuilder.target";
  @SerializedName(SERIALIZED_NAME_PACKAGE_BUILDER_TARGET)
  private ConfigNodePropertyString packageBuilderTarget = null;

  public static final String SERIALIZED_NAME_TRIGGERS_TARGET = "triggers.target";
  @SerializedName(SERIALIZED_NAME_TRIGGERS_TARGET)
  private ConfigNodePropertyString triggersTarget = null;

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Get logLevel
   * @return logLevel
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

   /**
   * Get queueProcessingEnabled
   * @return queueProcessingEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties packageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
    return this;
  }

   /**
   * Get packageExporterEndpoints
   * @return packageExporterEndpoints
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }

  public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

   /**
   * Get pullItems
   * @return pullItems
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
  }

   /**
   * Get httpConnTimeout
   * @return httpConnTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }

  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

   /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

   /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

   /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

   /**
   * Get triggersTarget
   * @return triggersTarget
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

