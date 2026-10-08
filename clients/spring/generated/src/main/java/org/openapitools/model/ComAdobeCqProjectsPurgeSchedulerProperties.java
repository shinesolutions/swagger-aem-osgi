package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeCqProjectsPurgeSchedulerProperties
 */

@JsonTypeName("comAdobeCqProjectsPurgeSchedulerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqProjectsPurgeSchedulerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString scheduledpurgeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean scheduledpurgePurgeActive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray scheduledpurgeTemplates;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean scheduledpurgePurgeGroups;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean scheduledpurgePurgeAssets;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger scheduledpurgeDaysold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger scheduledpurgeSaveThreshold;

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeName(@Nullable ConfigNodePropertyString scheduledpurgeName) {
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

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeActive(@Nullable ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
    return this;
  }

  /**
   * Get scheduledpurgePurgeActive
   * @return scheduledpurgePurgeActive
   */
  @Valid 
  @Schema(name = "scheduledpurge.purgeActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.purgeActive")
  public @Nullable ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
    return scheduledpurgePurgeActive;
  }

  @JsonProperty("scheduledpurge.purgeActive")
  public void setScheduledpurgePurgeActive(@Nullable ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTemplates(@Nullable ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
    return this;
  }

  /**
   * Get scheduledpurgeTemplates
   * @return scheduledpurgeTemplates
   */
  @Valid 
  @Schema(name = "scheduledpurge.templates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.templates")
  public @Nullable ConfigNodePropertyArray getScheduledpurgeTemplates() {
    return scheduledpurgeTemplates;
  }

  @JsonProperty("scheduledpurge.templates")
  public void setScheduledpurgeTemplates(@Nullable ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeGroups(@Nullable ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
    return this;
  }

  /**
   * Get scheduledpurgePurgeGroups
   * @return scheduledpurgePurgeGroups
   */
  @Valid 
  @Schema(name = "scheduledpurge.purgeGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.purgeGroups")
  public @Nullable ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
    return scheduledpurgePurgeGroups;
  }

  @JsonProperty("scheduledpurge.purgeGroups")
  public void setScheduledpurgePurgeGroups(@Nullable ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeAssets(@Nullable ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
    return this;
  }

  /**
   * Get scheduledpurgePurgeAssets
   * @return scheduledpurgePurgeAssets
   */
  @Valid 
  @Schema(name = "scheduledpurge.purgeAssets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.purgeAssets")
  public @Nullable ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
    return scheduledpurgePurgeAssets;
  }

  @JsonProperty("scheduledpurge.purgeAssets")
  public void setScheduledpurgePurgeAssets(@Nullable ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTerminateRunningWorkflows(@Nullable ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
    return this;
  }

  /**
   * Get scheduledpurgeTerminateRunningWorkflows
   * @return scheduledpurgeTerminateRunningWorkflows
   */
  @Valid 
  @Schema(name = "scheduledpurge.terminateRunningWorkflows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  public @Nullable ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
    return scheduledpurgeTerminateRunningWorkflows;
  }

  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  public void setScheduledpurgeTerminateRunningWorkflows(@Nullable ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeDaysold(@Nullable ConfigNodePropertyInteger scheduledpurgeDaysold) {
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

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeSaveThreshold(@Nullable ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
    return this;
  }

  /**
   * Get scheduledpurgeSaveThreshold
   * @return scheduledpurgeSaveThreshold
   */
  @Valid 
  @Schema(name = "scheduledpurge.saveThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledpurge.saveThreshold")
  public @Nullable ConfigNodePropertyInteger getScheduledpurgeSaveThreshold() {
    return scheduledpurgeSaveThreshold;
  }

  @JsonProperty("scheduledpurge.saveThreshold")
  public void setScheduledpurgeSaveThreshold(@Nullable ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqProjectsPurgeSchedulerProperties comAdobeCqProjectsPurgeSchedulerProperties = (ComAdobeCqProjectsPurgeSchedulerProperties) o;
    return Objects.equals(this.scheduledpurgeName, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeName) &&
        Objects.equals(this.scheduledpurgePurgeActive, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgePurgeActive) &&
        Objects.equals(this.scheduledpurgeTemplates, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeTemplates) &&
        Objects.equals(this.scheduledpurgePurgeGroups, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgePurgeGroups) &&
        Objects.equals(this.scheduledpurgePurgeAssets, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgePurgeAssets) &&
        Objects.equals(this.scheduledpurgeTerminateRunningWorkflows, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeTerminateRunningWorkflows) &&
        Objects.equals(this.scheduledpurgeDaysold, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeDaysold) &&
        Objects.equals(this.scheduledpurgeSaveThreshold, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeSaveThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledpurgeName, scheduledpurgePurgeActive, scheduledpurgeTemplates, scheduledpurgePurgeGroups, scheduledpurgePurgeAssets, scheduledpurgeTerminateRunningWorkflows, scheduledpurgeDaysold, scheduledpurgeSaveThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqProjectsPurgeSchedulerProperties {\n");
    sb.append("    scheduledpurgeName: ").append(toIndentedString(scheduledpurgeName)).append("\n");
    sb.append("    scheduledpurgePurgeActive: ").append(toIndentedString(scheduledpurgePurgeActive)).append("\n");
    sb.append("    scheduledpurgeTemplates: ").append(toIndentedString(scheduledpurgeTemplates)).append("\n");
    sb.append("    scheduledpurgePurgeGroups: ").append(toIndentedString(scheduledpurgePurgeGroups)).append("\n");
    sb.append("    scheduledpurgePurgeAssets: ").append(toIndentedString(scheduledpurgePurgeAssets)).append("\n");
    sb.append("    scheduledpurgeTerminateRunningWorkflows: ").append(toIndentedString(scheduledpurgeTerminateRunningWorkflows)).append("\n");
    sb.append("    scheduledpurgeDaysold: ").append(toIndentedString(scheduledpurgeDaysold)).append("\n");
    sb.append("    scheduledpurgeSaveThreshold: ").append(toIndentedString(scheduledpurgeSaveThreshold)).append("\n");
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

