/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties   {
  
  private ConfigNodePropertyString eventTopics;
  private ConfigNodePropertyString eventFilter;
  private ConfigNodePropertyArray translateListenerType;
  private ConfigNodePropertyArray translatePropertyList;
  private ConfigNodePropertyInteger poolSize;
  private ConfigNodePropertyInteger maxPoolSize;
  private ConfigNodePropertyInteger queueSize;
  private ConfigNodePropertyInteger keepAliveTime;

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }
  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties translateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.listener.type")
  public ConfigNodePropertyArray getTranslateListenerType() {
    return translateListenerType;
  }
  public void setTranslateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties translatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translate.property.list")
  public ConfigNodePropertyArray getTranslatePropertyList() {
    return translatePropertyList;
  }
  public void setTranslatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("poolSize")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

  
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

