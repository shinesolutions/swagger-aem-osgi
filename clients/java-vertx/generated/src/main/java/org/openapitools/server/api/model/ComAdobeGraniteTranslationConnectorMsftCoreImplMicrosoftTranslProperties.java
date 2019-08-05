package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties   {
  
  private ConfigNodePropertyString translationFactory = null;
  private ConfigNodePropertyString defaultConnectorLabel = null;
  private ConfigNodePropertyString defaultConnectorAttribution = null;
  private ConfigNodePropertyString defaultConnectorWorkspaceId = null;
  private ConfigNodePropertyString defaultConnectorSubscriptionKey = null;
  private ConfigNodePropertyString languageMapLocation = null;
  private ConfigNodePropertyString categoryMapLocation = null;
  private ConfigNodePropertyInteger retryAttempts = null;
  private ConfigNodePropertyInteger timeoutCount = null;

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties () {

  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties (ConfigNodePropertyString translationFactory, ConfigNodePropertyString defaultConnectorLabel, ConfigNodePropertyString defaultConnectorAttribution, ConfigNodePropertyString defaultConnectorWorkspaceId, ConfigNodePropertyString defaultConnectorSubscriptionKey, ConfigNodePropertyString languageMapLocation, ConfigNodePropertyString categoryMapLocation, ConfigNodePropertyInteger retryAttempts, ConfigNodePropertyInteger timeoutCount) {
    this.translationFactory = translationFactory;
    this.defaultConnectorLabel = defaultConnectorLabel;
    this.defaultConnectorAttribution = defaultConnectorAttribution;
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
    this.languageMapLocation = languageMapLocation;
    this.categoryMapLocation = categoryMapLocation;
    this.retryAttempts = retryAttempts;
    this.timeoutCount = timeoutCount;
  }

    
  @JsonProperty("translationFactory")
  public ConfigNodePropertyString getTranslationFactory() {
    return translationFactory;
  }
  public void setTranslationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
  }

    
  @JsonProperty("defaultConnectorLabel")
  public ConfigNodePropertyString getDefaultConnectorLabel() {
    return defaultConnectorLabel;
  }
  public void setDefaultConnectorLabel(ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
  }

    
  @JsonProperty("defaultConnectorAttribution")
  public ConfigNodePropertyString getDefaultConnectorAttribution() {
    return defaultConnectorAttribution;
  }
  public void setDefaultConnectorAttribution(ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
  }

    
  @JsonProperty("defaultConnectorWorkspaceId")
  public ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
    return defaultConnectorWorkspaceId;
  }
  public void setDefaultConnectorWorkspaceId(ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
  }

    
  @JsonProperty("defaultConnectorSubscriptionKey")
  public ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
    return defaultConnectorSubscriptionKey;
  }
  public void setDefaultConnectorSubscriptionKey(ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
  }

    
  @JsonProperty("languageMapLocation")
  public ConfigNodePropertyString getLanguageMapLocation() {
    return languageMapLocation;
  }
  public void setLanguageMapLocation(ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
  }

    
  @JsonProperty("categoryMapLocation")
  public ConfigNodePropertyString getCategoryMapLocation() {
    return categoryMapLocation;
  }
  public void setCategoryMapLocation(ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
  }

    
  @JsonProperty("retryAttempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }
  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

    
  @JsonProperty("timeoutCount")
  public ConfigNodePropertyInteger getTimeoutCount() {
    return timeoutCount;
  }
  public void setTimeoutCount(ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
