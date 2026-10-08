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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqProjectsPurgeSchedulerProperties {

  private ConfigNodePropertyString scheduledpurgeName;

  private ConfigNodePropertyBoolean scheduledpurgePurgeActive;

  private ConfigNodePropertyArray scheduledpurgeTemplates;

  private ConfigNodePropertyBoolean scheduledpurgePurgeGroups;

  private ConfigNodePropertyBoolean scheduledpurgePurgeAssets;

  private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows;

  private ConfigNodePropertyInteger scheduledpurgeDaysold;

  private ConfigNodePropertyInteger scheduledpurgeSaveThreshold;

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
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
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }

  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
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
  public ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
    return scheduledpurgePurgeActive;
  }

  public void setScheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
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
  public ConfigNodePropertyArray getScheduledpurgeTemplates() {
    return scheduledpurgeTemplates;
  }

  public void setScheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
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
  public ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
    return scheduledpurgePurgeGroups;
  }

  public void setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
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
  public ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
    return scheduledpurgePurgeAssets;
  }

  public void setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
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
  public ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
    return scheduledpurgeTerminateRunningWorkflows;
  }

  public void setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
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
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }

  public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
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
  public ConfigNodePropertyInteger getScheduledpurgeSaveThreshold() {
    return scheduledpurgeSaveThreshold;
  }

  public void setScheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

