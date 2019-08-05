package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties   {
  @JsonProperty("event.topics")
  private ConfigNodePropertyString eventTopics = null;

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  /**
   * Get eventTopics
   * @return eventTopics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties = (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties) o;
    return Objects.equals(this.eventTopics, comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.eventTopics);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

