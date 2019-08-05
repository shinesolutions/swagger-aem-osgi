package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqProjectsPurgeSchedulerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString scheduledpurgeName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgePurgeActive = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray scheduledpurgeTemplates = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgePurgeGroups = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgePurgeAssets = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger scheduledpurgeDaysold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger scheduledpurgeSaveThreshold = null;
 /**
   * Get scheduledpurgeName
   * @return scheduledpurgeName
  **/
  @JsonProperty("scheduledpurge.name")
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }

  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

 /**
   * Get scheduledpurgePurgeActive
   * @return scheduledpurgePurgeActive
  **/
  @JsonProperty("scheduledpurge.purgeActive")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
    return scheduledpurgePurgeActive;
  }

  public void setScheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
    this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
    return this;
  }

 /**
   * Get scheduledpurgeTemplates
   * @return scheduledpurgeTemplates
  **/
  @JsonProperty("scheduledpurge.templates")
  public ConfigNodePropertyArray getScheduledpurgeTemplates() {
    return scheduledpurgeTemplates;
  }

  public void setScheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
    this.scheduledpurgeTemplates = scheduledpurgeTemplates;
    return this;
  }

 /**
   * Get scheduledpurgePurgeGroups
   * @return scheduledpurgePurgeGroups
  **/
  @JsonProperty("scheduledpurge.purgeGroups")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
    return scheduledpurgePurgeGroups;
  }

  public void setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
    this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
    return this;
  }

 /**
   * Get scheduledpurgePurgeAssets
   * @return scheduledpurgePurgeAssets
  **/
  @JsonProperty("scheduledpurge.purgeAssets")
  public ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
    return scheduledpurgePurgeAssets;
  }

  public void setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
    this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
    return this;
  }

 /**
   * Get scheduledpurgeTerminateRunningWorkflows
   * @return scheduledpurgeTerminateRunningWorkflows
  **/
  @JsonProperty("scheduledpurge.terminateRunningWorkflows")
  public ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
    return scheduledpurgeTerminateRunningWorkflows;
  }

  public void setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
    this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
    return this;
  }

 /**
   * Get scheduledpurgeDaysold
   * @return scheduledpurgeDaysold
  **/
  @JsonProperty("scheduledpurge.daysold")
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }

  public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    return this;
  }

 /**
   * Get scheduledpurgeSaveThreshold
   * @return scheduledpurgeSaveThreshold
  **/
  @JsonProperty("scheduledpurge.saveThreshold")
  public ConfigNodePropertyInteger getScheduledpurgeSaveThreshold() {
    return scheduledpurgeSaveThreshold;
  }

  public void setScheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
  }

  public ComAdobeCqProjectsPurgeSchedulerProperties scheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
    this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

