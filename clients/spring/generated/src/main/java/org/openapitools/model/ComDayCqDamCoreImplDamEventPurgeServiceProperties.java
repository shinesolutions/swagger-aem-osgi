package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties
 */

@JsonTypeName("comDayCqDamCoreImplDamEventPurgeServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplDamEventPurgeServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString schedulerExpression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxSavedActivities;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger saveInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableActivityPurge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown eventTypes;

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties schedulerExpression(@Nullable ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  /**
   * Get schedulerExpression
   * @return schedulerExpression
   */
  @Valid 
  @Schema(name = "scheduler.expression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.expression")
  public @Nullable ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  @JsonProperty("scheduler.expression")
  public void setSchedulerExpression(@Nullable ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties maxSavedActivities(@Nullable ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
    return this;
  }

  /**
   * Get maxSavedActivities
   * @return maxSavedActivities
   */
  @Valid 
  @Schema(name = "maxSavedActivities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxSavedActivities")
  public @Nullable ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }

  @JsonProperty("maxSavedActivities")
  public void setMaxSavedActivities(@Nullable ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties saveInterval(@Nullable ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
    return this;
  }

  /**
   * Get saveInterval
   * @return saveInterval
   */
  @Valid 
  @Schema(name = "saveInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("saveInterval")
  public @Nullable ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }

  @JsonProperty("saveInterval")
  public void setSaveInterval(@Nullable ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties enableActivityPurge(@Nullable ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
    return this;
  }

  /**
   * Get enableActivityPurge
   * @return enableActivityPurge
   */
  @Valid 
  @Schema(name = "enableActivityPurge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableActivityPurge")
  public @Nullable ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }

  @JsonProperty("enableActivityPurge")
  public void setEnableActivityPurge(@Nullable ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties eventTypes(@Nullable ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  /**
   * Get eventTypes
   * @return eventTypes
   */
  @Valid 
  @Schema(name = "eventTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventTypes")
  public @Nullable ConfigNodePropertyDropDown getEventTypes() {
    return eventTypes;
  }

  @JsonProperty("eventTypes")
  public void setEventTypes(@Nullable ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplDamEventPurgeServiceProperties comDayCqDamCoreImplDamEventPurgeServiceProperties = (ComDayCqDamCoreImplDamEventPurgeServiceProperties) o;
    return Objects.equals(this.schedulerExpression, comDayCqDamCoreImplDamEventPurgeServiceProperties.schedulerExpression) &&
        Objects.equals(this.maxSavedActivities, comDayCqDamCoreImplDamEventPurgeServiceProperties.maxSavedActivities) &&
        Objects.equals(this.saveInterval, comDayCqDamCoreImplDamEventPurgeServiceProperties.saveInterval) &&
        Objects.equals(this.enableActivityPurge, comDayCqDamCoreImplDamEventPurgeServiceProperties.enableActivityPurge) &&
        Objects.equals(this.eventTypes, comDayCqDamCoreImplDamEventPurgeServiceProperties.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, maxSavedActivities, saveInterval, enableActivityPurge, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplDamEventPurgeServiceProperties {\n");
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    maxSavedActivities: ").append(toIndentedString(maxSavedActivities)).append("\n");
    sb.append("    saveInterval: ").append(toIndentedString(saveInterval)).append("\n");
    sb.append("    enableActivityPurge: ").append(toIndentedString(enableActivityPurge)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

