package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties() {
  }

  /**
   **/
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties translationFactory(ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translationFactory")
  @Valid public ConfigNodePropertyString getTranslationFactory() {
    return translationFactory;
  }

  @JsonProperty("translationFactory")
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
  @Valid public ConfigNodePropertyString getDefaultConnectorLabel() {
    return defaultConnectorLabel;
  }

  @JsonProperty("defaultConnectorLabel")
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
  @Valid public ConfigNodePropertyString getDefaultConnectorAttribution() {
    return defaultConnectorAttribution;
  }

  @JsonProperty("defaultConnectorAttribution")
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
  @Valid public ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
    return defaultConnectorWorkspaceId;
  }

  @JsonProperty("defaultConnectorWorkspaceId")
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
  @Valid public ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
    return defaultConnectorSubscriptionKey;
  }

  @JsonProperty("defaultConnectorSubscriptionKey")
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
  @Valid public ConfigNodePropertyString getLanguageMapLocation() {
    return languageMapLocation;
  }

  @JsonProperty("languageMapLocation")
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
  @Valid public ConfigNodePropertyString getCategoryMapLocation() {
    return categoryMapLocation;
  }

  @JsonProperty("categoryMapLocation")
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
  @Valid public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  @JsonProperty("retryAttempts")
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
  @Valid public ConfigNodePropertyInteger getTimeoutCount() {
    return timeoutCount;
  }

  @JsonProperty("timeoutCount")
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
