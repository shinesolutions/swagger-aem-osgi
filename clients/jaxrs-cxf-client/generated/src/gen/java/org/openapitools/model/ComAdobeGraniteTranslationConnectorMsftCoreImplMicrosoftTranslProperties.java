package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString translationFactory;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString defaultConnectorLabel;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString defaultConnectorAttribution;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString defaultConnectorWorkspaceId;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString defaultConnectorSubscriptionKey;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString languageMapLocation;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString categoryMapLocation;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger retryAttempts;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger timeoutCount;
 /**
   * Get translationFactory
   * @return translationFactory
  **/
  @JsonProperty("translationFactory")
  public ConfigNodePropertyString getTranslationFactory() {
    return translationFactory;
  }

  public void setTranslationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties translationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
    return this;
  }

 /**
   * Get defaultConnectorLabel
   * @return defaultConnectorLabel
  **/
  @JsonProperty("defaultConnectorLabel")
  public ConfigNodePropertyString getDefaultConnectorLabel() {
    return defaultConnectorLabel;
  }

  public void setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
    return this;
  }

 /**
   * Get defaultConnectorAttribution
   * @return defaultConnectorAttribution
  **/
  @JsonProperty("defaultConnectorAttribution")
  public ConfigNodePropertyString getDefaultConnectorAttribution() {
    return defaultConnectorAttribution;
  }

  public void setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
    return this;
  }

 /**
   * Get defaultConnectorWorkspaceId
   * @return defaultConnectorWorkspaceId
  **/
  @JsonProperty("defaultConnectorWorkspaceId")
  public ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
    return defaultConnectorWorkspaceId;
  }

  public void setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
    return this;
  }

 /**
   * Get defaultConnectorSubscriptionKey
   * @return defaultConnectorSubscriptionKey
  **/
  @JsonProperty("defaultConnectorSubscriptionKey")
  public ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
    return defaultConnectorSubscriptionKey;
  }

  public void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
    return this;
  }

 /**
   * Get languageMapLocation
   * @return languageMapLocation
  **/
  @JsonProperty("languageMapLocation")
  public ConfigNodePropertyString getLanguageMapLocation() {
    return languageMapLocation;
  }

  public void setLanguageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties languageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
    return this;
  }

 /**
   * Get categoryMapLocation
   * @return categoryMapLocation
  **/
  @JsonProperty("categoryMapLocation")
  public ConfigNodePropertyString getCategoryMapLocation() {
    return categoryMapLocation;
  }

  public void setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties categoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
    return this;
  }

 /**
   * Get retryAttempts
   * @return retryAttempts
  **/
  @JsonProperty("retryAttempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

 /**
   * Get timeoutCount
   * @return timeoutCount
  **/
  @JsonProperty("timeoutCount")
  public ConfigNodePropertyInteger getTimeoutCount() {
    return timeoutCount;
  }

  public void setTimeoutCount(ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties timeoutCount(ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

