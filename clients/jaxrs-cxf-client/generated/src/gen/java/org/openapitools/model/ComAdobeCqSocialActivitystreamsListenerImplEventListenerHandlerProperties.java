package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString eventTopics;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString eventFilter;
 /**
   * Get eventTopics
   * @return eventTopics
  **/
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

 /**
   * Get eventFilter
   * @return eventFilter
  **/
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
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
    ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties = (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties) o;
    return Objects.equals(this.eventTopics, comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.eventTopics) &&
        Objects.equals(this.eventFilter, comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.eventFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics, eventFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties {\n");
    
    sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
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

