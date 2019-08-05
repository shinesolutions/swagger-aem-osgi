package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties   {
  
  private @Valid ConfigNodePropertyString translationFactory = null;
  private @Valid ConfigNodePropertyString defaultConnectorLabel = null;
  private @Valid ConfigNodePropertyString defaultConnectorAttribution = null;
  private @Valid ConfigNodePropertyString defaultConnectorWorkspaceId = null;
  private @Valid ConfigNodePropertyString defaultConnectorSubscriptionKey = null;
  private @Valid ConfigNodePropertyString languageMapLocation = null;
  private @Valid ConfigNodePropertyString categoryMapLocation = null;
  private @Valid ConfigNodePropertyInteger retryAttempts = null;
  private @Valid ConfigNodePropertyInteger timeoutCount = null;

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties translationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translationFactory")
  public ConfigNodePropertyString getTranslationFactory() {
    return translationFactory;
  }
  public void setTranslationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultConnectorLabel")
  public ConfigNodePropertyString getDefaultConnectorLabel() {
    return defaultConnectorLabel;
  }
  public void setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultConnectorAttribution")
  public ConfigNodePropertyString getDefaultConnectorAttribution() {
    return defaultConnectorAttribution;
  }
  public void setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultConnectorWorkspaceId")
  public ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
    return defaultConnectorWorkspaceId;
  }
  public void setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultConnectorSubscriptionKey")
  public ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
    return defaultConnectorSubscriptionKey;
  }
  public void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties languageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("languageMapLocation")
  public ConfigNodePropertyString getLanguageMapLocation() {
    return languageMapLocation;
  }
  public void setLanguageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties categoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("categoryMapLocation")
  public ConfigNodePropertyString getCategoryMapLocation() {
    return categoryMapLocation;
  }
  public void setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("retryAttempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }
  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties timeoutCount(ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timeoutCount")
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
    return Objects.equals(translationFactory, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.translationFactory) &&
        Objects.equals(defaultConnectorLabel, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorLabel) &&
        Objects.equals(defaultConnectorAttribution, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorAttribution) &&
        Objects.equals(defaultConnectorWorkspaceId, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorWorkspaceId) &&
        Objects.equals(defaultConnectorSubscriptionKey, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.defaultConnectorSubscriptionKey) &&
        Objects.equals(languageMapLocation, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.languageMapLocation) &&
        Objects.equals(categoryMapLocation, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.categoryMapLocation) &&
        Objects.equals(retryAttempts, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.retryAttempts) &&
        Objects.equals(timeoutCount, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.timeoutCount);
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

