package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmNotificationImplNotificationManagerImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray eventTopics;
 /**
   * Get eventTopics
   * @return eventTopics
  **/
  @JsonProperty("event.topics")
  public ConfigNodePropertyArray getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyArray eventTopics) {
    this.eventTopics = eventTopics;
  }

  public ComDayCqWcmNotificationImplNotificationManagerImplProperties eventTopics(ConfigNodePropertyArray eventTopics) {
    this.eventTopics = eventTopics;
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
    ComDayCqWcmNotificationImplNotificationManagerImplProperties comDayCqWcmNotificationImplNotificationManagerImplProperties = (ComDayCqWcmNotificationImplNotificationManagerImplProperties) o;
    return Objects.equals(this.eventTopics, comDayCqWcmNotificationImplNotificationManagerImplProperties.eventTopics);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

