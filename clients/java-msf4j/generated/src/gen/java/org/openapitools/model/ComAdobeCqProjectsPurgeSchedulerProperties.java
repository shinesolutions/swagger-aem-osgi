package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqProjectsPurgeSchedulerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqProjectsPurgeSchedulerProperties   {
  @JsonProperty("scheduledpurge.name")
  private ConfigNodePropertyString scheduledpurgeName = null;

  @JsonProperty("scheduledpurge.purgeActive")
  private ConfigNodePropertyBoolean scheduledpurgePurgeActive = null;

  @JsonProperty("scheduledpurge.templates")
  private ConfigNodePropertyArray scheduledpurgeTemplates = null;

  @JsonProperty("scheduledpurge.purgeGroups")
  private ConfigNodePropertyBoolean scheduledpurgePurgeGroups = null;

  @JsonProperty("scheduledpurge.purgeAssets")
  private ConfigNodePropertyBoolean scheduledpurgePurgeAssets = null;

  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows = null;

  @JsonProperty("scheduledpurge.daysold")
  private ConfigNodePropertyInteger scheduledpurgeDaysold = null;

  @JsonProperty("scheduledpurge.saveThreshold")
  private ConfigNodePropertyInteger scheduledpurgeSaveThreshold = null;

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

   /**
   * Get scheduledpurgeName
   * @return scheduledpurgeName
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getScheduledpurgeSaveThreshold() {
    return scheduledpurgeSaveThreshold;
  }

  public void setScheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

