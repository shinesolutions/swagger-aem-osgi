package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown translateLanguage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown translateDisplay = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean translateAttribution = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown translateCaching = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown translateSmartRendering = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString translateCachingDuration = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString translateSessionSaveInterval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString translateSessionSaveBatchLimit = null;
 /**
   * Get translateLanguage
   * @return translateLanguage
  **/
  @JsonProperty("translate.language")
  public ConfigNodePropertyDropDown getTranslateLanguage() {
    return translateLanguage;
  }

  public void setTranslateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
    return this;
  }

 /**
   * Get translateDisplay
   * @return translateDisplay
  **/
  @JsonProperty("translate.display")
  public ConfigNodePropertyDropDown getTranslateDisplay() {
    return translateDisplay;
  }

  public void setTranslateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
    return this;
  }

 /**
   * Get translateAttribution
   * @return translateAttribution
  **/
  @JsonProperty("translate.attribution")
  public ConfigNodePropertyBoolean getTranslateAttribution() {
    return translateAttribution;
  }

  public void setTranslateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
    return this;
  }

 /**
   * Get translateCaching
   * @return translateCaching
  **/
  @JsonProperty("translate.caching")
  public ConfigNodePropertyDropDown getTranslateCaching() {
    return translateCaching;
  }

  public void setTranslateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
    return this;
  }

 /**
   * Get translateSmartRendering
   * @return translateSmartRendering
  **/
  @JsonProperty("translate.smart.rendering")
  public ConfigNodePropertyDropDown getTranslateSmartRendering() {
    return translateSmartRendering;
  }

  public void setTranslateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
    return this;
  }

 /**
   * Get translateCachingDuration
   * @return translateCachingDuration
  **/
  @JsonProperty("translate.caching.duration")
  public ConfigNodePropertyString getTranslateCachingDuration() {
    return translateCachingDuration;
  }

  public void setTranslateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
    return this;
  }

 /**
   * Get translateSessionSaveInterval
   * @return translateSessionSaveInterval
  **/
  @JsonProperty("translate.session.save.interval")
  public ConfigNodePropertyString getTranslateSessionSaveInterval() {
    return translateSessionSaveInterval;
  }

  public void setTranslateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
    return this;
  }

 /**
   * Get translateSessionSaveBatchLimit
   * @return translateSessionSaveBatchLimit
  **/
  @JsonProperty("translate.session.save.batchLimit")
  public ConfigNodePropertyString getTranslateSessionSaveBatchLimit() {
    return translateSessionSaveBatchLimit;
  }

  public void setTranslateSessionSaveBatchLimit(ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
  }

  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveBatchLimit(ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

