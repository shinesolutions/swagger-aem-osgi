package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties   {
  
  private ConfigNodePropertyDropDown translateLanguage = null;
  private ConfigNodePropertyDropDown translateDisplay = null;
  private ConfigNodePropertyBoolean translateAttribution = null;
  private ConfigNodePropertyDropDown translateCaching = null;
  private ConfigNodePropertyDropDown translateSmartRendering = null;
  private ConfigNodePropertyString translateCachingDuration = null;
  private ConfigNodePropertyString translateSessionSaveInterval = null;
  private ConfigNodePropertyString translateSessionSaveBatchLimit = null;

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties () {

  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties (ConfigNodePropertyDropDown translateLanguage, ConfigNodePropertyDropDown translateDisplay, ConfigNodePropertyBoolean translateAttribution, ConfigNodePropertyDropDown translateCaching, ConfigNodePropertyDropDown translateSmartRendering, ConfigNodePropertyString translateCachingDuration, ConfigNodePropertyString translateSessionSaveInterval, ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateLanguage = translateLanguage;
    this.translateDisplay = translateDisplay;
    this.translateAttribution = translateAttribution;
    this.translateCaching = translateCaching;
    this.translateSmartRendering = translateSmartRendering;
    this.translateCachingDuration = translateCachingDuration;
    this.translateSessionSaveInterval = translateSessionSaveInterval;
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
  }

    
  @JsonProperty("translate.language")
  public ConfigNodePropertyDropDown getTranslateLanguage() {
    return translateLanguage;
  }
  public void setTranslateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
  }

    
  @JsonProperty("translate.display")
  public ConfigNodePropertyDropDown getTranslateDisplay() {
    return translateDisplay;
  }
  public void setTranslateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
  }

    
  @JsonProperty("translate.attribution")
  public ConfigNodePropertyBoolean getTranslateAttribution() {
    return translateAttribution;
  }
  public void setTranslateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
  }

    
  @JsonProperty("translate.caching")
  public ConfigNodePropertyDropDown getTranslateCaching() {
    return translateCaching;
  }
  public void setTranslateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
  }

    
  @JsonProperty("translate.smart.rendering")
  public ConfigNodePropertyDropDown getTranslateSmartRendering() {
    return translateSmartRendering;
  }
  public void setTranslateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
  }

    
  @JsonProperty("translate.caching.duration")
  public ConfigNodePropertyString getTranslateCachingDuration() {
    return translateCachingDuration;
  }
  public void setTranslateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
  }

    
  @JsonProperty("translate.session.save.interval")
  public ConfigNodePropertyString getTranslateSessionSaveInterval() {
    return translateSessionSaveInterval;
  }
  public void setTranslateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
  }

    
  @JsonProperty("translate.session.save.batchLimit")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
