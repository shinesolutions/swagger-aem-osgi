package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
 */

@JsonTypeName("comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString translationFactory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultConnectorLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultConnectorAttribution;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultConnectorWorkspaceId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultConnectorSubscriptionKey;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString languageMapLocation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString categoryMapLocation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger retryAttempts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger timeoutCount;

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties translationFactory(@Nullable ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
    return this;
  }

  /**
   * Get translationFactory
   * @return translationFactory
   */
  @Valid 
  @Schema(name = "translationFactory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translationFactory")
  public @Nullable ConfigNodePropertyString getTranslationFactory() {
    return translationFactory;
  }

  @JsonProperty("translationFactory")
  public void setTranslationFactory(@Nullable ConfigNodePropertyString translationFactory) {
    this.translationFactory = translationFactory;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorLabel(@Nullable ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
    return this;
  }

  /**
   * Get defaultConnectorLabel
   * @return defaultConnectorLabel
   */
  @Valid 
  @Schema(name = "defaultConnectorLabel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultConnectorLabel")
  public @Nullable ConfigNodePropertyString getDefaultConnectorLabel() {
    return defaultConnectorLabel;
  }

  @JsonProperty("defaultConnectorLabel")
  public void setDefaultConnectorLabel(@Nullable ConfigNodePropertyString defaultConnectorLabel) {
    this.defaultConnectorLabel = defaultConnectorLabel;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorAttribution(@Nullable ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
    return this;
  }

  /**
   * Get defaultConnectorAttribution
   * @return defaultConnectorAttribution
   */
  @Valid 
  @Schema(name = "defaultConnectorAttribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultConnectorAttribution")
  public @Nullable ConfigNodePropertyString getDefaultConnectorAttribution() {
    return defaultConnectorAttribution;
  }

  @JsonProperty("defaultConnectorAttribution")
  public void setDefaultConnectorAttribution(@Nullable ConfigNodePropertyString defaultConnectorAttribution) {
    this.defaultConnectorAttribution = defaultConnectorAttribution;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorWorkspaceId(@Nullable ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
    return this;
  }

  /**
   * Get defaultConnectorWorkspaceId
   * @return defaultConnectorWorkspaceId
   */
  @Valid 
  @Schema(name = "defaultConnectorWorkspaceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultConnectorWorkspaceId")
  public @Nullable ConfigNodePropertyString getDefaultConnectorWorkspaceId() {
    return defaultConnectorWorkspaceId;
  }

  @JsonProperty("defaultConnectorWorkspaceId")
  public void setDefaultConnectorWorkspaceId(@Nullable ConfigNodePropertyString defaultConnectorWorkspaceId) {
    this.defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties defaultConnectorSubscriptionKey(@Nullable ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
    return this;
  }

  /**
   * Get defaultConnectorSubscriptionKey
   * @return defaultConnectorSubscriptionKey
   */
  @Valid 
  @Schema(name = "defaultConnectorSubscriptionKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultConnectorSubscriptionKey")
  public @Nullable ConfigNodePropertyString getDefaultConnectorSubscriptionKey() {
    return defaultConnectorSubscriptionKey;
  }

  @JsonProperty("defaultConnectorSubscriptionKey")
  public void setDefaultConnectorSubscriptionKey(@Nullable ConfigNodePropertyString defaultConnectorSubscriptionKey) {
    this.defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties languageMapLocation(@Nullable ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
    return this;
  }

  /**
   * Get languageMapLocation
   * @return languageMapLocation
   */
  @Valid 
  @Schema(name = "languageMapLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageMapLocation")
  public @Nullable ConfigNodePropertyString getLanguageMapLocation() {
    return languageMapLocation;
  }

  @JsonProperty("languageMapLocation")
  public void setLanguageMapLocation(@Nullable ConfigNodePropertyString languageMapLocation) {
    this.languageMapLocation = languageMapLocation;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties categoryMapLocation(@Nullable ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
    return this;
  }

  /**
   * Get categoryMapLocation
   * @return categoryMapLocation
   */
  @Valid 
  @Schema(name = "categoryMapLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryMapLocation")
  public @Nullable ConfigNodePropertyString getCategoryMapLocation() {
    return categoryMapLocation;
  }

  @JsonProperty("categoryMapLocation")
  public void setCategoryMapLocation(@Nullable ConfigNodePropertyString categoryMapLocation) {
    this.categoryMapLocation = categoryMapLocation;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties retryAttempts(@Nullable ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

  /**
   * Get retryAttempts
   * @return retryAttempts
   */
  @Valid 
  @Schema(name = "retryAttempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retryAttempts")
  public @Nullable ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  @JsonProperty("retryAttempts")
  public void setRetryAttempts(@Nullable ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties timeoutCount(@Nullable ConfigNodePropertyInteger timeoutCount) {
    this.timeoutCount = timeoutCount;
    return this;
  }

  /**
   * Get timeoutCount
   * @return timeoutCount
   */
  @Valid 
  @Schema(name = "timeoutCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeoutCount")
  public @Nullable ConfigNodePropertyInteger getTimeoutCount() {
    return timeoutCount;
  }

  @JsonProperty("timeoutCount")
  public void setTimeoutCount(@Nullable ConfigNodePropertyInteger timeoutCount) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

