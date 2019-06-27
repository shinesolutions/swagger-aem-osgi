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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
  public static final String SERIALIZED_NAME_TRANSLATION_FACTORY = "translationFactory";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_FACTORY)
  private ConfigNodePropertyString translationFactory = null;

  public static final String SERIALIZED_NAME_DEFAULT_CONNECTOR_LABEL = "defaultConnectorLabel";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CONNECTOR_LABEL)
  private ConfigNodePropertyString defaultConnectorLabel = null;

  public static final String SERIALIZED_NAME_DEFAULT_CONNECTOR_ATTRIBUTION = "defaultConnectorAttribution";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CONNECTOR_ATTRIBUTION)
  private ConfigNodePropertyString defaultConnectorAttribution = null;

  public static final String SERIALIZED_NAME_DEFAULT_CONNECTOR_WORKSPACE_ID = "defaultConnectorWorkspaceId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CONNECTOR_WORKSPACE_ID)
  private ConfigNodePropertyString defaultConnectorWorkspaceId = null;

  public static final String SERIALIZED_NAME_DEFAULT_CONNECTOR_SUBSCRIPTION_KEY = "defaultConnectorSubscriptionKey";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CONNECTOR_SUBSCRIPTION_KEY)
  private ConfigNodePropertyString defaultConnectorSubscriptionKey = null;

  public static final String SERIALIZED_NAME_LANGUAGE_MAP_LOCATION = "languageMapLocation";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_MAP_LOCATION)
  private ConfigNodePropertyString languageMapLocation = null;

  public static final String SERIALIZED_NAME_CATEGORY_MAP_LOCATION = "categoryMapLocation";
  @SerializedName(SERIALIZED_NAME_CATEGORY_MAP_LOCATION)
  private ConfigNodePropertyString categoryMapLocation = null;

  public static final String SERIALIZED_NAME_RETRY_ATTEMPTS = "retryAttempts";
  @SerializedName(SERIALIZED_NAME_RETRY_ATTEMPTS)
  private ConfigNodePropertyInteger retryAttempts = null;

  public static final String SERIALIZED_NAME_TIMEOUT_COUNT = "timeoutCount";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_COUNT)
  private ConfigNodePropertyInteger timeoutCount = null;

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties translationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
    return this;
  }

   /**
   * Get translationFactory
   * @return translationFactory
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTranslationFactory() {
    return translationFactory;
  }

  public void setTranslationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
    return this;
  }

   /**
   * Get defaultConnectorLabel
   * @return defaultConnectorLabel
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDefaultConnectorLabel() {
    return defaultConnectorLabel;
  }

  public void setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
    return this;
  }

   /**
   * Get defaultConnectorAttribution
   * @return defaultConnectorAttribution
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDefaultConnectorAttribution() {
    return defaultConnectorAttribution;
  }

  public void setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
    return this;
  }

   /**
   * Get defaultConnectorWorkspaceId
   * @return defaultConnectorWorkspaceId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
    return defaultConnectorWorkspaceId;
  }

  public void setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
    return this;
  }

   /**
   * Get defaultConnectorSubscriptionKey
   * @return defaultConnectorSubscriptionKey
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
    return defaultConnectorSubscriptionKey;
  }

  public void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties languageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
    return this;
  }

   /**
   * Get languageMapLocation
   * @return languageMapLocation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLanguageMapLocation() {
    return languageMapLocation;
  }

  public void setLanguageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties categoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
    return this;
  }

   /**
   * Get categoryMapLocation
   * @return categoryMapLocation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCategoryMapLocation() {
    return categoryMapLocation;
  }

  public void setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

   /**
   * Get retryAttempts
   * @return retryAttempts
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties timeoutCount(ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
    return this;
  }

   /**
   * Get timeoutCount
   * @return timeoutCount
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getTimeoutCount() {
    return timeoutCount;
  }

  public void setTimeoutCount(ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties = (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties) o;
    return Objects.equals(this.translationFactory, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.translationFactory) &&
        Objects.equals(this.defaultConnectorLabel, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorLabel) &&
        Objects.equals(this.defaultConnectorAttribution, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorAttribution) &&
        Objects.equals(this.defaultConnectorWorkspaceId, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorWorkspaceId) &&
        Objects.equals(this.defaultConnectorSubscriptionKey, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorSubscriptionKey) &&
        Objects.equals(this.languageMapLocation, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.languageMapLocation) &&
        Objects.equals(this.categoryMapLocation, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.categoryMapLocation) &&
        Objects.equals(this.retryAttempts, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.retryAttempts) &&
        Objects.equals(this.timeoutCount, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.timeoutCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translationFactory, defaultConnectorLabel, defaultConnectorAttribution, defaultConnectorWorkspaceId, defaultConnectorSubscriptionKey, languageMapLocation, categoryMapLocation, retryAttempts, timeoutCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {\n");
    sb.append("    translationFactory: ").append(toIndentedString(translationFactory)).append("\n");
    sb.append("    defaultConnectorLabel: ").append(toIndentedString(defaultConnectorLabel)).append("\n");
    sb.append("    defaultConnectorAttribution: ").append(toIndentedString(defaultConnectorAttribution)).append("\n");
    sb.append("    defaultConnectorWorkspaceId: ").append(toIndentedString(defaultConnectorWorkspaceId)).append("\n");
    sb.append("    defaultConnectorSubscriptionKey: ").append(toIndentedString(defaultConnectorSubscriptionKey)).append("\n");
    sb.append("    languageMapLocation: ").append(toIndentedString(languageMapLocation)).append("\n");
    sb.append("    categoryMapLocation: ").append(toIndentedString(categoryMapLocation)).append("\n");
    sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
    sb.append("    timeoutCount: ").append(toIndentedString(timeoutCount)).append("\n");
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

