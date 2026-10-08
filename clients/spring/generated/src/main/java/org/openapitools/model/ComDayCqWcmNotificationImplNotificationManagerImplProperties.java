package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmNotificationImplNotificationManagerImplProperties
 */

@JsonTypeName("comDayCqWcmNotificationImplNotificationManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmNotificationImplNotificationManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray eventTopics;

  public ComDayCqWcmNotificationImplNotificationManagerImplProperties eventTopics(@Nullable ConfigNodePropertyArray eventTopics) {
    this.eventTopics = eventTopics;
    return this;
  }

  /**
   * Get eventTopics
   * @return eventTopics
   */
  @Valid 
  @Schema(name = "event.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.topics")
  public @Nullable ConfigNodePropertyArray getEventTopics() {
    return eventTopics;
  }

  @JsonProperty("event.topics")
  public void setEventTopics(@Nullable ConfigNodePropertyArray eventTopics) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

