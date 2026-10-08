package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties   {
  @JsonProperty("translate.language")
  @Valid

  private ConfigNodePropertyDropDown translateLanguage;

  @JsonProperty("translate.display")
  @Valid

  private ConfigNodePropertyDropDown translateDisplay;

  @JsonProperty("translate.attribution")
  @Valid

  private ConfigNodePropertyBoolean translateAttribution;

  @JsonProperty("translate.caching")
  @Valid

  private ConfigNodePropertyDropDown translateCaching;

  @JsonProperty("translate.smart.rendering")
  @Valid

  private ConfigNodePropertyDropDown translateSmartRendering;

  @JsonProperty("translate.caching.duration")
  @Valid

  private ConfigNodePropertyString translateCachingDuration;

  @JsonProperty("translate.session.save.interval")
  @Valid

  private ConfigNodePropertyString translateSessionSaveInterval;

  @JsonProperty("translate.session.save.batchLimit")
  @Valid

  private ConfigNodePropertyString translateSessionSaveBatchLimit;

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
    return this;
  }

   /**
   * Get translateLanguage
   * @return translateLanguage
  **/
  public ConfigNodePropertyDropDown getTranslateLanguage() {
    return translateLanguage;
  }

  public void setTranslateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
    return this;
  }

   /**
   * Get translateDisplay
   * @return translateDisplay
  **/
  public ConfigNodePropertyDropDown getTranslateDisplay() {
    return translateDisplay;
  }

  public void setTranslateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
    return this;
  }

   /**
   * Get translateAttribution
   * @return translateAttribution
  **/
  public ConfigNodePropertyBoolean getTranslateAttribution() {
    return translateAttribution;
  }

  public void setTranslateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
    return this;
  }

   /**
   * Get translateCaching
   * @return translateCaching
  **/
  public ConfigNodePropertyDropDown getTranslateCaching() {
    return translateCaching;
  }

  public void setTranslateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
    return this;
  }

   /**
   * Get translateSmartRendering
   * @return translateSmartRendering
  **/
  public ConfigNodePropertyDropDown getTranslateSmartRendering() {
    return translateSmartRendering;
  }

  public void setTranslateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
    return this;
  }

   /**
   * Get translateCachingDuration
   * @return translateCachingDuration
  **/
  public ConfigNodePropertyString getTranslateCachingDuration() {
    return translateCachingDuration;
  }

  public void setTranslateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
    return this;
  }

   /**
   * Get translateSessionSaveInterval
   * @return translateSessionSaveInterval
  **/
  public ConfigNodePropertyString getTranslateSessionSaveInterval() {
    return translateSessionSaveInterval;
  }

  public void setTranslateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveBatchLimit(ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
    return this;
  }

   /**
   * Get translateSessionSaveBatchLimit
   * @return translateSessionSaveBatchLimit
  **/
  public ConfigNodePropertyString getTranslateSessionSaveBatchLimit() {
    return translateSessionSaveBatchLimit;
  }

  public void setTranslateSessionSaveBatchLimit(ConfigNodePropertyString translateSessionSaveBatchLimit) {
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
    return Objects.equals(translateLanguage, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateLanguage) &&
        Objects.equals(translateDisplay, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateDisplay) &&
        Objects.equals(translateAttribution, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateAttribution) &&
        Objects.equals(translateCaching, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateCaching) &&
        Objects.equals(translateSmartRendering, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateSmartRendering) &&
        Objects.equals(translateCachingDuration, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateCachingDuration) &&
        Objects.equals(translateSessionSaveInterval, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateSessionSaveInterval) &&
        Objects.equals(translateSessionSaveBatchLimit, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.translateSessionSaveBatchLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translateLanguage, translateDisplay, translateAttribution, translateCaching, translateSmartRendering, translateCachingDuration, translateSessionSaveInterval, translateSessionSaveBatchLimit);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

