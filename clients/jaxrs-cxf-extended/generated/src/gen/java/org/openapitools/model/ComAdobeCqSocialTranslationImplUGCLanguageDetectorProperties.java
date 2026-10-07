package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventTopics;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventFilter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray translateListenerType;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray translatePropertyList;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger poolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxPoolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queueSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger keepAliveTime;
 /**
  * Get eventTopics
  * @return eventTopics
  */
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  /**
   * Sets the <code>eventTopics</code> property.
   */
 public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  /**
   * Sets the <code>eventTopics</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

 /**
  * Get eventFilter
  * @return eventFilter
  */
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
 public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
  * Get translateListenerType
  * @return translateListenerType
  */
  @JsonProperty("translate.listener.type")
  public ConfigNodePropertyArray getTranslateListenerType() {
    return translateListenerType;
  }

  /**
   * Sets the <code>translateListenerType</code> property.
   */
 public void setTranslateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
  }

  /**
   * Sets the <code>translateListenerType</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties translateListenerType(ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
    return this;
  }

 /**
  * Get translatePropertyList
  * @return translatePropertyList
  */
  @JsonProperty("translate.property.list")
  public ConfigNodePropertyArray getTranslatePropertyList() {
    return translatePropertyList;
  }

  /**
   * Sets the <code>translatePropertyList</code> property.
   */
 public void setTranslatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
  }

  /**
   * Sets the <code>translatePropertyList</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties translatePropertyList(ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
    return this;
  }

 /**
  * Get poolSize
  * @return poolSize
  */
  @JsonProperty("poolSize")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  /**
   * Sets the <code>poolSize</code> property.
   */
 public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   * Sets the <code>poolSize</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

 /**
  * Get maxPoolSize
  * @return maxPoolSize
  */
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  /**
   * Sets the <code>maxPoolSize</code> property.
   */
 public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   * Sets the <code>maxPoolSize</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

 /**
  * Get queueSize
  * @return queueSize
  */
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  /**
   * Sets the <code>queueSize</code> property.
   */
 public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   * Sets the <code>queueSize</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

 /**
  * Get keepAliveTime
  * @return keepAliveTime
  */
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  /**
   * Sets the <code>keepAliveTime</code> property.
   */
 public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  /**
   * Sets the <code>keepAliveTime</code> property.
   */
  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

