package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
 */

@JsonTypeName("comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown translateLanguage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown translateDisplay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean translateAttribution;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown translateCaching;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown translateSmartRendering;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString translateCachingDuration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString translateSessionSaveInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString translateSessionSaveBatchLimit;

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateLanguage(@Nullable ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
    return this;
  }

  /**
   * Get translateLanguage
   * @return translateLanguage
   */
  @Valid 
  @Schema(name = "translate.language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.language")
  public @Nullable ConfigNodePropertyDropDown getTranslateLanguage() {
    return translateLanguage;
  }

  @JsonProperty("translate.language")
  public void setTranslateLanguage(@Nullable ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateDisplay(@Nullable ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
    return this;
  }

  /**
   * Get translateDisplay
   * @return translateDisplay
   */
  @Valid 
  @Schema(name = "translate.display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.display")
  public @Nullable ConfigNodePropertyDropDown getTranslateDisplay() {
    return translateDisplay;
  }

  @JsonProperty("translate.display")
  public void setTranslateDisplay(@Nullable ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateAttribution(@Nullable ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
    return this;
  }

  /**
   * Get translateAttribution
   * @return translateAttribution
   */
  @Valid 
  @Schema(name = "translate.attribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.attribution")
  public @Nullable ConfigNodePropertyBoolean getTranslateAttribution() {
    return translateAttribution;
  }

  @JsonProperty("translate.attribution")
  public void setTranslateAttribution(@Nullable ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCaching(@Nullable ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
    return this;
  }

  /**
   * Get translateCaching
   * @return translateCaching
   */
  @Valid 
  @Schema(name = "translate.caching", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.caching")
  public @Nullable ConfigNodePropertyDropDown getTranslateCaching() {
    return translateCaching;
  }

  @JsonProperty("translate.caching")
  public void setTranslateCaching(@Nullable ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSmartRendering(@Nullable ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
    return this;
  }

  /**
   * Get translateSmartRendering
   * @return translateSmartRendering
   */
  @Valid 
  @Schema(name = "translate.smart.rendering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.smart.rendering")
  public @Nullable ConfigNodePropertyDropDown getTranslateSmartRendering() {
    return translateSmartRendering;
  }

  @JsonProperty("translate.smart.rendering")
  public void setTranslateSmartRendering(@Nullable ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCachingDuration(@Nullable ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
    return this;
  }

  /**
   * Get translateCachingDuration
   * @return translateCachingDuration
   */
  @Valid 
  @Schema(name = "translate.caching.duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.caching.duration")
  public @Nullable ConfigNodePropertyString getTranslateCachingDuration() {
    return translateCachingDuration;
  }

  @JsonProperty("translate.caching.duration")
  public void setTranslateCachingDuration(@Nullable ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveInterval(@Nullable ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
    return this;
  }

  /**
   * Get translateSessionSaveInterval
   * @return translateSessionSaveInterval
   */
  @Valid 
  @Schema(name = "translate.session.save.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.session.save.interval")
  public @Nullable ConfigNodePropertyString getTranslateSessionSaveInterval() {
    return translateSessionSaveInterval;
  }

  @JsonProperty("translate.session.save.interval")
  public void setTranslateSessionSaveInterval(@Nullable ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveBatchLimit(@Nullable ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
    return this;
  }

  /**
   * Get translateSessionSaveBatchLimit
   * @return translateSessionSaveBatchLimit
   */
  @Valid 
  @Schema(name = "translate.session.save.batchLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.session.save.batchLimit")
  public @Nullable ConfigNodePropertyString getTranslateSessionSaveBatchLimit() {
    return translateSessionSaveBatchLimit;
  }

  @JsonProperty("translate.session.save.batchLimit")
  public void setTranslateSessionSaveBatchLimit(@Nullable ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties = (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties) o;
    return Objects.equals(this.translateLanguage, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateLanguage) &&
        Objects.equals(this.translateDisplay, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateDisplay) &&
        Objects.equals(this.translateAttribution, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateAttribution) &&
        Objects.equals(this.translateCaching, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateCaching) &&
        Objects.equals(this.translateSmartRendering, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateSmartRendering) &&
        Objects.equals(this.translateCachingDuration, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateCachingDuration) &&
        Objects.equals(this.translateSessionSaveInterval, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateSessionSaveInterval) &&
        Objects.equals(this.translateSessionSaveBatchLimit, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateSessionSaveBatchLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translateLanguage, translateDisplay, translateAttribution, translateCaching, translateSmartRendering, translateCachingDuration, translateSessionSaveInterval, translateSessionSaveBatchLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {\n");
    sb.append("    translateLanguage: ").append(toIndentedString(translateLanguage)).append("\n");
    sb.append("    translateDisplay: ").append(toIndentedString(translateDisplay)).append("\n");
    sb.append("    translateAttribution: ").append(toIndentedString(translateAttribution)).append("\n");
    sb.append("    translateCaching: ").append(toIndentedString(translateCaching)).append("\n");
    sb.append("    translateSmartRendering: ").append(toIndentedString(translateSmartRendering)).append("\n");
    sb.append("    translateCachingDuration: ").append(toIndentedString(translateCachingDuration)).append("\n");
    sb.append("    translateSessionSaveInterval: ").append(toIndentedString(translateSessionSaveInterval)).append("\n");
    sb.append("    translateSessionSaveBatchLimit: ").append(toIndentedString(translateSessionSaveBatchLimit)).append("\n");
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

