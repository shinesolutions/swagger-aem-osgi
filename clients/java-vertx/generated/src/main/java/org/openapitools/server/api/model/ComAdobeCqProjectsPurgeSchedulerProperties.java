package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqProjectsPurgeSchedulerProperties   {
  
  private ConfigNodePropertyString scheduledpurgeName = null;
  private ConfigNodePropertyBoolean scheduledpurgePurgeActive = null;
  private ConfigNodePropertyArray scheduledpurgeTemplates = null;
  private ConfigNodePropertyBoolean scheduledpurgePurgeGroups = null;
  private ConfigNodePropertyBoolean scheduledpurgePurgeAssets = null;
  private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows = null;
  private ConfigNodePropertyInteger scheduledpurgeDaysold = null;
  private ConfigNodePropertyInteger scheduledpurgeSaveThreshold = null;

  public ComAdobeCqProjectsPurgeSchedulerProperties () {

  }

  public ComAdobeCqProjectsPurgeSchedulerProperties (ConfigNodePropertyString scheduledpurgeName, ConfigNodePropertyBoolean scheduledpurgePurgeActive, ConfigNodePropertyArray scheduledpurgeTemplates, ConfigNodePropertyBoolean scheduledpurgePurgeGroups, ConfigNodePropertyBoolean scheduledpurgePurgeAssets, ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows, ConfigNodePropertyInteger scheduledpurgeDaysold, ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeName = scheduledpurgeName;
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
  }

    
  @JsonProperty("scheduledpurge.name")
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }
  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

    
  @JsonProperty("scheduledpurge.purgeActive")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
    return scheduledpurgePurgeActive;
  }
  public void setScheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
  }

    
  @JsonProperty("scheduledpurge.templates")
  public ConfigNodePropertyArray getScheduledpurgeTemplates() {
    return scheduledpurgeTemplates;
  }
  public void setScheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
  }

    
  @JsonProperty("scheduledpurge.purgeGroups")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
    return scheduledpurgePurgeGroups;
  }
  public void setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
  }

    
  @JsonProperty("scheduledpurge.purgeAssets")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
    return scheduledpurgePurgeAssets;
  }
  public void setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
  }

    
  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  public ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
    return scheduledpurgeTerminateRunningWorkflows;
  }
  public void setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
  }

    
  @JsonProperty("scheduledpurge.daysold")
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }
  public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

    
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
    return Objects.equals(scheduledpurgeName, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeName) &&
        Objects.equals(scheduledpurgePurgeActive, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgePurgeActive) &&
        Objects.equals(scheduledpurgeTemplates, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeTemplates) &&
        Objects.equals(scheduledpurgePurgeGroups, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgePurgeGroups) &&
        Objects.equals(scheduledpurgePurgeAssets, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgePurgeAssets) &&
        Objects.equals(scheduledpurgeTerminateRunningWorkflows, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeTerminateRunningWorkflows) &&
        Objects.equals(scheduledpurgeDaysold, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeDaysold) &&
        Objects.equals(scheduledpurgeSaveThreshold, comAdobeCqProjectsPurgeSchedulerProperties.scheduledpurgeSaveThreshold);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
