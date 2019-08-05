package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialScoringImplScoringEventListenerProperties   {
  
  private @Valid ConfigNodePropertyString eventTopics = null;
  private @Valid ConfigNodePropertyString eventFilter = null;

  /**
   **/
  public ComAdobeCqSocialScoringImplScoringEventListenerProperties eventTopics(ConfigNodePropertyString eventTopics) {
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
   **/
  public ComAdobeCqSocialScoringImplScoringEventListenerProperties eventFilter(ConfigNodePropertyString eventFilter) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialScoringImplScoringEventListenerProperties comAdobeCqSocialScoringImplScoringEventListenerProperties = (ComAdobeCqSocialScoringImplScoringEventListenerProperties) o;
    return Objects.equals(eventTopics, comAdobeCqSocialScoringImplScoringEventListenerProperties.eventTopics) &&
        Objects.equals(eventFilter, comAdobeCqSocialScoringImplScoringEventListenerProperties.eventFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics, eventFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialScoringImplScoringEventListenerProperties {\n");
    
    sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

