package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties   {
  

  private ConfigNodePropertyString eventTopics = null;

  private ConfigNodePropertyString eventFilter = null;

  private ConfigNodePropertyArray translateListenerType = null;

  private ConfigNodePropertyArray translatePropertyList = null;

  private ConfigNodePropertyInteger poolSize = null;

  private ConfigNodePropertyInteger maxPoolSize = null;

  private ConfigNodePropertyInteger queueSize = null;

  private ConfigNodePropertyInteger keepAliveTime = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }
  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.listener.type")
  public ConfigNodePropertyArray getTranslateListenerType() {
    return translateListenerType;
  }
  public void setTranslateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.property.list")
  public ConfigNodePropertyArray getTranslatePropertyList() {
    return translatePropertyList;
  }
  public void setTranslatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("poolSize")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }
  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties = (ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties) o;
    return Objects.equals(eventTopics, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.eventTopics) &&
        Objects.equals(eventFilter, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.eventFilter) &&
        Objects.equals(translateListenerType, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.translateListenerType) &&
        Objects.equals(translatePropertyList, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.translatePropertyList) &&
        Objects.equals(poolSize, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.poolSize) &&
        Objects.equals(maxPoolSize, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.maxPoolSize) &&
        Objects.equals(queueSize, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.queueSize) &&
        Objects.equals(keepAliveTime, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.keepAliveTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics, eventFilter, translateListenerType, translatePropertyList, poolSize, maxPoolSize, queueSize, keepAliveTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {\n");
    
    sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    translateListenerType: ").append(toIndentedString(translateListenerType)).append("\n");
    sb.append("    translatePropertyList: ").append(toIndentedString(translatePropertyList)).append("\n");
    sb.append("    poolSize: ").append(toIndentedString(poolSize)).append("\n");
    sb.append("    maxPoolSize: ").append(toIndentedString(maxPoolSize)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    keepAliveTime: ").append(toIndentedString(keepAliveTime)).append("\n");
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

