package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties   {
  
  private ConfigNodePropertyString eventTopics = null;
  private ConfigNodePropertyString eventFilter = null;
  private ConfigNodePropertyArray translateListenerType = null;
  private ConfigNodePropertyArray translatePropertyList = null;
  private ConfigNodePropertyInteger poolSize = null;
  private ConfigNodePropertyInteger maxPoolSize = null;
  private ConfigNodePropertyInteger queueSize = null;
  private ConfigNodePropertyInteger keepAliveTime = null;

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties () {

  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties (ConfigNodePropertyString eventTopics, ConfigNodePropertyString eventFilter, ConfigNodePropertyArray translateListenerType, ConfigNodePropertyArray translatePropertyList, ConfigNodePropertyInteger poolSize, ConfigNodePropertyInteger maxPoolSize, ConfigNodePropertyInteger queueSize, ConfigNodePropertyInteger keepAliveTime) {
    this.eventTopics = eventTopics;
    this.eventFilter = eventFilter;
    this.translateListenerType = translateListenerType;
    this.translatePropertyList = translatePropertyList;
    this.poolSize = poolSize;
    this.maxPoolSize = maxPoolSize;
    this.queueSize = queueSize;
    this.keepAliveTime = keepAliveTime;
  }

    
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }
  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

    
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

    
  @JsonProperty("translate.listener.type")
  public ConfigNodePropertyArray getTranslateListenerType() {
    return translateListenerType;
  }
  public void setTranslateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
  }

    
  @JsonProperty("translate.property.list")
  public ConfigNodePropertyArray getTranslatePropertyList() {
    return translatePropertyList;
  }
  public void setTranslatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
  }

    
  @JsonProperty("poolSize")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

    
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

    
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

    
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
