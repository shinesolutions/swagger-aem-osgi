package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmNotificationImplNotificationManagerImplProperties   {
  
  private @Valid ConfigNodePropertyArray eventTopics = null;

  /**
   **/
  public ComDayCqWcmNotificationImplNotificationManagerImplProperties eventTopics(ConfigNodePropertyArray eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.topics")
  public ConfigNodePropertyArray getEventTopics() {
    return eventTopics;
  }
  public void setEventTopics(ConfigNodePropertyArray eventTopics) {
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
    ComDayCqWcmNotificationImplNotificationManagerImplProperties comDayCqWcmNotificationImplNotificationManagerImplProperties = (ComDayCqWcmNotificationImplNotificationManagerImplProperties) o;
    return Objects.equals(eventTopics, comDayCqWcmNotificationImplNotificationManagerImplProperties.eventTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmNotificationImplNotificationManagerImplProperties {\n");
    
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

