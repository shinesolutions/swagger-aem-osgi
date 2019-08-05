package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties   {
  
  private ConfigNodePropertyString eventTopics = null;

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties () {

  }

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties (ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }

    
  @JsonProperty("event.topics")
  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }
  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties = (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties) o;
    return Objects.equals(eventTopics, comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.eventTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties {\n");
    
    sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
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
