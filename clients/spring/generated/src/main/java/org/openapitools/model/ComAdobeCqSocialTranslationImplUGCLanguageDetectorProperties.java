package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
 */

@JsonTypeName("comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventTopics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray translateListenerType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray translatePropertyList;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger poolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger keepAliveTime;

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties eventTopics(@Nullable ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  /**
   * Get eventTopics
   * @return eventTopics
   */
  @Valid 
  @Schema(name = "event.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.topics")
  public @Nullable ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  @JsonProperty("event.topics")
  public void setEventTopics(@Nullable ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
   */
  @Valid 
  @Schema(name = "event.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.filter")
  public @Nullable ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties translateListenerType(@Nullable ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
    return this;
  }

  /**
   * Get translateListenerType
   * @return translateListenerType
   */
  @Valid 
  @Schema(name = "translate.listener.type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.listener.type")
  public @Nullable ConfigNodePropertyArray getTranslateListenerType() {
    return translateListenerType;
  }

  @JsonProperty("translate.listener.type")
  public void setTranslateListenerType(@Nullable ConfigNodePropertyArray translateListenerType) {
    this.translateListenerType = translateListenerType;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties translatePropertyList(@Nullable ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
    return this;
  }

  /**
   * Get translatePropertyList
   * @return translatePropertyList
   */
  @Valid 
  @Schema(name = "translate.property.list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translate.property.list")
  public @Nullable ConfigNodePropertyArray getTranslatePropertyList() {
    return translatePropertyList;
  }

  @JsonProperty("translate.property.list")
  public void setTranslatePropertyList(@Nullable ConfigNodePropertyArray translatePropertyList) {
    this.translatePropertyList = translatePropertyList;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties poolSize(@Nullable ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  /**
   * Get poolSize
   * @return poolSize
   */
  @Valid 
  @Schema(name = "poolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poolSize")
  public @Nullable ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  @JsonProperty("poolSize")
  public void setPoolSize(@Nullable ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties maxPoolSize(@Nullable ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

  /**
   * Get maxPoolSize
   * @return maxPoolSize
   */
  @Valid 
  @Schema(name = "maxPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPoolSize")
  public @Nullable ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  @JsonProperty("maxPoolSize")
  public void setMaxPoolSize(@Nullable ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties queueSize(@Nullable ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

  /**
   * Get queueSize
   * @return queueSize
   */
  @Valid 
  @Schema(name = "queueSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueSize")
  public @Nullable ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  @JsonProperty("queueSize")
  public void setQueueSize(@Nullable ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties keepAliveTime(@Nullable ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

  /**
   * Get keepAliveTime
   * @return keepAliveTime
   */
  @Valid 
  @Schema(name = "keepAliveTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keepAliveTime")
  public @Nullable ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  @JsonProperty("keepAliveTime")
  public void setKeepAliveTime(@Nullable ConfigNodePropertyInteger keepAliveTime) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

