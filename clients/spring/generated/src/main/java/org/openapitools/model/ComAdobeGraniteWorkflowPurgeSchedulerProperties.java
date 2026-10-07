package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */

@JsonTypeName("comAdobeGraniteWorkflowPurgeSchedulerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowPurgeSchedulerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString scheduledpurgeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray scheduledpurgeModelIds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger scheduledpurgeDaysold;

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeName(@Nullable ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

  /**
   * Get scheduledpurgeName
   * @return scheduledpurgeName
   */
  @Valid 
  @Schema(name = "scheduledpurge.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.name")
  public @Nullable ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }

  @JsonProperty("scheduledpurge.name")
  public void setScheduledpurgeName(@Nullable ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeWorkflowStatus(@Nullable ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
    return this;
  }

  /**
   * Get scheduledpurgeWorkflowStatus
   * @return scheduledpurgeWorkflowStatus
   */
  @Valid 
  @Schema(name = "scheduledpurge.workflowStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.workflowStatus")
  public @Nullable ConfigNodePropertyDropDown getScheduledpurgeWorkflowStatus() {
    return scheduledpurgeWorkflowStatus;
  }

  @JsonProperty("scheduledpurge.workflowStatus")
  public void setScheduledpurgeWorkflowStatus(@Nullable ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeModelIds(@Nullable ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
    return this;
  }

  /**
   * Get scheduledpurgeModelIds
   * @return scheduledpurgeModelIds
   */
  @Valid 
  @Schema(name = "scheduledpurge.modelIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.modelIds")
  public @Nullable ConfigNodePropertyArray getScheduledpurgeModelIds() {
    return scheduledpurgeModelIds;
  }

  @JsonProperty("scheduledpurge.modelIds")
  public void setScheduledpurgeModelIds(@Nullable ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeDaysold(@Nullable ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    return this;
  }

  /**
   * Get scheduledpurgeDaysold
   * @return scheduledpurgeDaysold
   */
  @Valid 
  @Schema(name = "scheduledpurge.daysold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.daysold")
  public @Nullable ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }

  @JsonProperty("scheduledpurge.daysold")
  public void setScheduledpurgeDaysold(@Nullable ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowPurgeSchedulerProperties comAdobeGraniteWorkflowPurgeSchedulerProperties = (ComAdobeGraniteWorkflowPurgeSchedulerProperties) o;
    return Objects.equals(this.scheduledpurgeName, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeName) &&
        Objects.equals(this.scheduledpurgeWorkflowStatus, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeWorkflowStatus) &&
        Objects.equals(this.scheduledpurgeModelIds, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeModelIds) &&
        Objects.equals(this.scheduledpurgeDaysold, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeDaysold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledpurgeName, scheduledpurgeWorkflowStatus, scheduledpurgeModelIds, scheduledpurgeDaysold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowPurgeSchedulerProperties {\n");
    sb.append("    scheduledpurgeName: ").append(toIndentedString(scheduledpurgeName)).append("\n");
    sb.append("    scheduledpurgeWorkflowStatus: ").append(toIndentedString(scheduledpurgeWorkflowStatus)).append("\n");
    sb.append("    scheduledpurgeModelIds: ").append(toIndentedString(scheduledpurgeModelIds)).append("\n");
    sb.append("    scheduledpurgeDaysold: ").append(toIndentedString(scheduledpurgeDaysold)).append("\n");
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

