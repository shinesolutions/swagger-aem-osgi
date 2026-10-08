package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqNotificationImplNotificationServiceImplProperties
 */

@JsonTypeName("comDayCqNotificationImplNotificationServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqNotificationImplNotificationServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  public ComDayCqNotificationImplNotificationServiceImplProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
   */
  @Valid 
  @Schema(name = "event.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.filter")
  public @Nullable ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(@Nullable ConfigNodePropertyString eventFilter) {
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
    ComDayCqNotificationImplNotificationServiceImplProperties comDayCqNotificationImplNotificationServiceImplProperties = (ComDayCqNotificationImplNotificationServiceImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqNotificationImplNotificationServiceImplProperties.eventFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqNotificationImplNotificationServiceImplProperties {\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
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

