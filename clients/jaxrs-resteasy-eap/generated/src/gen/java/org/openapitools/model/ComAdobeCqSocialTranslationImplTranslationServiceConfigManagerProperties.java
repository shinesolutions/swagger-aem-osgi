package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties   {
  

  private ConfigNodePropertyDropDown translateLanguage = null;

  private ConfigNodePropertyDropDown translateDisplay = null;

  private ConfigNodePropertyBoolean translateAttribution = null;

  private ConfigNodePropertyDropDown translateCaching = null;

  private ConfigNodePropertyDropDown translateSmartRendering = null;

  private ConfigNodePropertyString translateCachingDuration = null;

  private ConfigNodePropertyString translateSessionSaveInterval = null;

  private ConfigNodePropertyString translateSessionSaveBatchLimit = null;

  /**
   **/
  
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

