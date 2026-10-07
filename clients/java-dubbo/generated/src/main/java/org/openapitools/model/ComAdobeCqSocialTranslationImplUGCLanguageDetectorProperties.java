package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("event.topics")
  private ConfigNodePropertyString eventTopics;

  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter;

  @JsonProperty("translate.listener.type")
  private ConfigNodePropertyArray translateListenerType;

  @JsonProperty("translate.property.list")
  private ConfigNodePropertyArray translatePropertyList;

  @JsonProperty("poolSize")
  private ConfigNodePropertyInteger poolSize;

  @JsonProperty("maxPoolSize")
  private ConfigNodePropertyInteger maxPoolSize;

  @JsonProperty("queueSize")
  private ConfigNodePropertyInteger queueSize;

  @JsonProperty("keepAliveTime")
  private ConfigNodePropertyInteger keepAliveTime;

  /**
   * 
   * @return eventTopics
   */
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   * 
   * @return eventFilter
   */
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   * 
   * @return translateListenerType
   */
  public ConfigNodePropertyArray getTranslateListenerType() {
    return translateListenerType;
  }

  public void setTranslateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
  }

  /**
   * 
   * @return translatePropertyList
   */
  public ConfigNodePropertyArray getTranslatePropertyList() {
    return translatePropertyList;
  }

  public void setTranslatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
  }

  /**
   * 
   * @return poolSize
   */
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   * 
   * @return maxPoolSize
   */
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   * 
   * @return queueSize
   */
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   * 
   * @return keepAliveTime
   */
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
    return Objects.equals(this.eventTopics, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.eventTopics) &&
        Objects.equals(this.eventFilter, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.eventFilter) &&
        Objects.equals(this.translateListenerType, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.translateListenerType) &&
        Objects.equals(this.translatePropertyList, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.translatePropertyList) &&
        Objects.equals(this.poolSize, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.poolSize) &&
        Objects.equals(this.maxPoolSize, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.maxPoolSize) &&
        Objects.equals(this.queueSize, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.queueSize) &&
        Objects.equals(this.keepAliveTime, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.keepAliveTime);
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
