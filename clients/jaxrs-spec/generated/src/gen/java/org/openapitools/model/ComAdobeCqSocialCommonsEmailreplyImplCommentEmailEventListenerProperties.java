package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties   {
  private ConfigNodePropertyString eventTopics;

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties eventTopics(ConfigNodePropertyString eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.topics")
  @Valid public ConfigNodePropertyString getEventTopics() {
    return eventTopics;
  }

  @JsonProperty("event.topics")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
