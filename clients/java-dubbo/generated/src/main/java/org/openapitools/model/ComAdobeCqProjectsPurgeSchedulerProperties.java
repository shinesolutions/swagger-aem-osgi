package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqProjectsPurgeSchedulerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scheduledpurge.name")
  private ConfigNodePropertyString scheduledpurgeName;

  @JsonProperty("scheduledpurge.purgeActive")
  private ConfigNodePropertyBoolean scheduledpurgePurgeActive;

  @JsonProperty("scheduledpurge.templates")
  private ConfigNodePropertyArray scheduledpurgeTemplates;

  @JsonProperty("scheduledpurge.purgeGroups")
  private ConfigNodePropertyBoolean scheduledpurgePurgeGroups;

  @JsonProperty("scheduledpurge.purgeAssets")
  private ConfigNodePropertyBoolean scheduledpurgePurgeAssets;

  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows;

  @JsonProperty("scheduledpurge.daysold")
  private ConfigNodePropertyInteger scheduledpurgeDaysold;

  @JsonProperty("scheduledpurge.saveThreshold")
  private ConfigNodePropertyInteger scheduledpurgeSaveThreshold;

  /**
   * 
   * @return scheduledpurgeName
   */
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }

  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  /**
   * 
   * @return scheduledpurgePurgeActive
   */
  public ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
    return scheduledpurgePurgeActive;
  }

  public void setScheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
  }

  /**
   * 
   * @return scheduledpurgeTemplates
   */
  public ConfigNodePropertyArray getScheduledpurgeTemplates() {
    return scheduledpurgeTemplates;
  }

  public void setScheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
  }

  /**
   * 
   * @return scheduledpurgePurgeGroups
   */
  public ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
    return scheduledpurgePurgeGroups;
  }

  public void setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
  }

  /**
   * 
   * @return scheduledpurgePurgeAssets
   */
  public ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
    return scheduledpurgePurgeAssets;
  }

  public void setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
  }

  /**
   * 
   * @return scheduledpurgeTerminateRunningWorkflows
   */
  public ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
    return scheduledpurgeTerminateRunningWorkflows;
  }

  public void setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
  }

  /**
   * 
   * @return scheduledpurgeDaysold
   */
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }

  public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

  /**
   * 
   * @return scheduledpurgeSaveThreshold
   */
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
