package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqProjectsPurgeSchedulerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString scheduledpurgeName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgePurgeActive;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray scheduledpurgeTemplates;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgePurgeGroups;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgePurgeAssets;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger scheduledpurgeDaysold;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger scheduledpurgeSaveThreshold;
 /**
  * Get scheduledpurgeName
  * @return scheduledpurgeName
  */
  @JsonProperty("scheduledpurge.name")
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }

  /**
   * Sets the <code>scheduledpurgeName</code> property.
   */
 public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  /**
   * Sets the <code>scheduledpurgeName</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

 /**
  * Get scheduledpurgePurgeActive
  * @return scheduledpurgePurgeActive
  */
  @JsonProperty("scheduledpurge.purgeActive")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
    return scheduledpurgePurgeActive;
  }

  /**
   * Sets the <code>scheduledpurgePurgeActive</code> property.
   */
 public void setScheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
  }

  /**
   * Sets the <code>scheduledpurgePurgeActive</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
    return this;
  }

 /**
  * Get scheduledpurgeTemplates
  * @return scheduledpurgeTemplates
  */
  @JsonProperty("scheduledpurge.templates")
  public ConfigNodePropertyArray getScheduledpurgeTemplates() {
    return scheduledpurgeTemplates;
  }

  /**
   * Sets the <code>scheduledpurgeTemplates</code> property.
   */
 public void setScheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
  }

  /**
   * Sets the <code>scheduledpurgeTemplates</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
    return this;
  }

 /**
  * Get scheduledpurgePurgeGroups
  * @return scheduledpurgePurgeGroups
  */
  @JsonProperty("scheduledpurge.purgeGroups")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
    return scheduledpurgePurgeGroups;
  }

  /**
   * Sets the <code>scheduledpurgePurgeGroups</code> property.
   */
 public void setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
  }

  /**
   * Sets the <code>scheduledpurgePurgeGroups</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
    return this;
  }

 /**
  * Get scheduledpurgePurgeAssets
  * @return scheduledpurgePurgeAssets
  */
  @JsonProperty("scheduledpurge.purgeAssets")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
    return scheduledpurgePurgeAssets;
  }

  /**
   * Sets the <code>scheduledpurgePurgeAssets</code> property.
   */
 public void setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
  }

  /**
   * Sets the <code>scheduledpurgePurgeAssets</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
    return this;
  }

 /**
  * Get scheduledpurgeTerminateRunningWorkflows
  * @return scheduledpurgeTerminateRunningWorkflows
  */
  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  public ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
    return scheduledpurgeTerminateRunningWorkflows;
  }

  /**
   * Sets the <code>scheduledpurgeTerminateRunningWorkflows</code> property.
   */
 public void setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
  }

  /**
   * Sets the <code>scheduledpurgeTerminateRunningWorkflows</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
    return this;
  }

 /**
  * Get scheduledpurgeDaysold
  * @return scheduledpurgeDaysold
  */
  @JsonProperty("scheduledpurge.daysold")
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }

  /**
   * Sets the <code>scheduledpurgeDaysold</code> property.
   */
 public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

  /**
   * Sets the <code>scheduledpurgeDaysold</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    return this;
  }

 /**
  * Get scheduledpurgeSaveThreshold
  * @return scheduledpurgeSaveThreshold
  */
  @JsonProperty("scheduledpurge.saveThreshold")
  public ConfigNodePropertyInteger getScheduledpurgeSaveThreshold() {
    return scheduledpurgeSaveThreshold;
  }

  /**
   * Sets the <code>scheduledpurgeSaveThreshold</code> property.
   */
 public void setScheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
  }

  /**
   * Sets the <code>scheduledpurgeSaveThreshold</code> property.
   */
  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

