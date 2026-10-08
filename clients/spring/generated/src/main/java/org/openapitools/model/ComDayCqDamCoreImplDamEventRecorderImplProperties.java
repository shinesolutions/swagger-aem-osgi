package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComDayCqDamCoreImplDamEventRecorderImplProperties
 */

@JsonTypeName("comDayCqDamCoreImplDamEventRecorderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplDamEventRecorderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger eventQueueLength;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean eventrecorderEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray eventrecorderBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown eventrecorderEventtypes;

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
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

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventQueueLength(@Nullable ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
    return this;
  }

  /**
   * Get eventQueueLength
   * @return eventQueueLength
   */
  @Valid 
  @Schema(name = "event.queue.length", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.queue.length")
  public @Nullable ConfigNodePropertyInteger getEventQueueLength() {
    return eventQueueLength;
  }

  @JsonProperty("event.queue.length")
  public void setEventQueueLength(@Nullable ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEnabled(@Nullable ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
    return this;
  }

  /**
   * Get eventrecorderEnabled
   * @return eventrecorderEnabled
   */
  @Valid 
  @Schema(name = "eventrecorder.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventrecorder.enabled")
  public @Nullable ConfigNodePropertyBoolean getEventrecorderEnabled() {
    return eventrecorderEnabled;
  }

  @JsonProperty("eventrecorder.enabled")
  public void setEventrecorderEnabled(@Nullable ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderBlacklist(@Nullable ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
    return this;
  }

  /**
   * Get eventrecorderBlacklist
   * @return eventrecorderBlacklist
   */
  @Valid 
  @Schema(name = "eventrecorder.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventrecorder.blacklist")
  public @Nullable ConfigNodePropertyArray getEventrecorderBlacklist() {
    return eventrecorderBlacklist;
  }

  @JsonProperty("eventrecorder.blacklist")
  public void setEventrecorderBlacklist(@Nullable ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEventtypes(@Nullable ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
    return this;
  }

  /**
   * Get eventrecorderEventtypes
   * @return eventrecorderEventtypes
   */
  @Valid 
  @Schema(name = "eventrecorder.eventtypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventrecorder.eventtypes")
  public @Nullable ConfigNodePropertyDropDown getEventrecorderEventtypes() {
    return eventrecorderEventtypes;
  }

  @JsonProperty("eventrecorder.eventtypes")
  public void setEventrecorderEventtypes(@Nullable ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplDamEventRecorderImplProperties comDayCqDamCoreImplDamEventRecorderImplProperties = (ComDayCqDamCoreImplDamEventRecorderImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqDamCoreImplDamEventRecorderImplProperties.eventFilter) &&
        Objects.equals(this.eventQueueLength, comDayCqDamCoreImplDamEventRecorderImplProperties.eventQueueLength) &&
        Objects.equals(this.eventrecorderEnabled, comDayCqDamCoreImplDamEventRecorderImplProperties.eventrecorderEnabled) &&
        Objects.equals(this.eventrecorderBlacklist, comDayCqDamCoreImplDamEventRecorderImplProperties.eventrecorderBlacklist) &&
        Objects.equals(this.eventrecorderEventtypes, comDayCqDamCoreImplDamEventRecorderImplProperties.eventrecorderEventtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, eventQueueLength, eventrecorderEnabled, eventrecorderBlacklist, eventrecorderEventtypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplDamEventRecorderImplProperties {\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    eventQueueLength: ").append(toIndentedString(eventQueueLength)).append("\n");
    sb.append("    eventrecorderEnabled: ").append(toIndentedString(eventrecorderEnabled)).append("\n");
    sb.append("    eventrecorderBlacklist: ").append(toIndentedString(eventrecorderBlacklist)).append("\n");
    sb.append("    eventrecorderEventtypes: ").append(toIndentedString(eventrecorderEventtypes)).append("\n");
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

