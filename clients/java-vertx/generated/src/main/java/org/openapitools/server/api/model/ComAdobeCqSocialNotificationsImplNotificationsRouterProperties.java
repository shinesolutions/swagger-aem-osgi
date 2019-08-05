package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties   {
  
  private ConfigNodePropertyString eventTopics = null;
  private ConfigNodePropertyString eventFilter = null;

  public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties () {

  }

  public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties (ConfigNodePropertyString eventTopics, ConfigNodePropertyString eventFilter) {
    this.eventTopics = eventTopics;
    this.eventFilter = eventFilter;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialNotificationsImplNotificationsRouterProperties comAdobeCqSocialNotificationsImplNotificationsRouterProperties = (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties) o;
    return Objects.equals(eventTopics, comAdobeCqSocialNotificationsImplNotificationsRouterProperties.eventTopics) &&
        Objects.equals(eventFilter, comAdobeCqSocialNotificationsImplNotificationsRouterProperties.eventFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics, eventFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
