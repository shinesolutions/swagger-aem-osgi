package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties   {
  
  private ConfigNodePropertyDropDown translateLanguage;

  private ConfigNodePropertyDropDown translateDisplay;

  private ConfigNodePropertyBoolean translateAttribution;

  private ConfigNodePropertyDropDown translateCaching;

  private ConfigNodePropertyDropDown translateSmartRendering;

  private ConfigNodePropertyString translateCachingDuration;

  private ConfigNodePropertyString translateSessionSaveInterval;

  private ConfigNodePropertyString translateSessionSaveBatchLimit;

  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.language")
  public ConfigNodePropertyDropDown getTranslateLanguage() {
    return translateLanguage;
  }
  public void setTranslateLanguage(ConfigNodePropertyDropDown translateLanguage) {
    this.translateLanguage = translateLanguage;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.display")
  public ConfigNodePropertyDropDown getTranslateDisplay() {
    return translateDisplay;
  }
  public void setTranslateDisplay(ConfigNodePropertyDropDown translateDisplay) {
    this.translateDisplay = translateDisplay;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.attribution")
  public ConfigNodePropertyBoolean getTranslateAttribution() {
    return translateAttribution;
  }
  public void setTranslateAttribution(ConfigNodePropertyBoolean translateAttribution) {
    this.translateAttribution = translateAttribution;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.caching")
  public ConfigNodePropertyDropDown getTranslateCaching() {
    return translateCaching;
  }
  public void setTranslateCaching(ConfigNodePropertyDropDown translateCaching) {
    this.translateCaching = translateCaching;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.smart.rendering")
  public ConfigNodePropertyDropDown getTranslateSmartRendering() {
    return translateSmartRendering;
  }
  public void setTranslateSmartRendering(ConfigNodePropertyDropDown translateSmartRendering) {
    this.translateSmartRendering = translateSmartRendering;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.caching.duration")
  public ConfigNodePropertyString getTranslateCachingDuration() {
    return translateCachingDuration;
  }
  public void setTranslateCachingDuration(ConfigNodePropertyString translateCachingDuration) {
    this.translateCachingDuration = translateCachingDuration;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.session.save.interval")
  public ConfigNodePropertyString getTranslateSessionSaveInterval() {
    return translateSessionSaveInterval;
  }
  public void setTranslateSessionSaveInterval(ConfigNodePropertyString translateSessionSaveInterval) {
    this.translateSessionSaveInterval = translateSessionSaveInterval;
  }


  /**
   **/
  public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties translateSessionSaveBatchLimit(ConfigNodePropertyString translateSessionSaveBatchLimit) {
    this.translateSessionSaveBatchLimit = translateSessionSaveBatchLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

