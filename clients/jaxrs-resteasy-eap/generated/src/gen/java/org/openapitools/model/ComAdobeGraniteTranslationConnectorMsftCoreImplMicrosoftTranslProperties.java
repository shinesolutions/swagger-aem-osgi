package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties   {
  
  private ConfigNodePropertyString translationFactory;
  private ConfigNodePropertyString defaultConnectorLabel;
  private ConfigNodePropertyString defaultConnectorAttribution;
  private ConfigNodePropertyString defaultConnectorWorkspaceId;
  private ConfigNodePropertyString defaultConnectorSubscriptionKey;
  private ConfigNodePropertyString languageMapLocation;
  private ConfigNodePropertyString categoryMapLocation;
  private ConfigNodePropertyInteger retryAttempts;
  private ConfigNodePropertyInteger timeoutCount;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

