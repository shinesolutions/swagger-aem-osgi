package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmNotificationImplNotificationManagerImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmNotificationImplNotificationManagerImplProperties   {
  @JsonProperty("event.topics")
  private ConfigNodePropertyArray eventTopics;

  public ComDayCqWcmNotificationImplNotificationManagerImplProperties eventTopics(ConfigNodePropertyArray eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  /**
   * Get eventTopics
   * @return eventTopics
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getEventTopics() {
    return eventTopics;
  }

  public void setEventTopics(ConfigNodePropertyArray eventTopics) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

