package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties   {
  @JsonProperty("event.topics")
  private ConfigNodePropertyString eventTopics;

  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter;

  public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

   /**
   * Get eventTopics
   * @return eventTopics
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

