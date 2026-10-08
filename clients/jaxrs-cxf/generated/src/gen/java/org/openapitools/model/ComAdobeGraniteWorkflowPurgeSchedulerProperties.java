package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowPurgeSchedulerProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString scheduledpurgeName;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray scheduledpurgeModelIds;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger scheduledpurgeDaysold;
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

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

 /**
   * Get scheduledpurgeWorkflowStatus
   * @return scheduledpurgeWorkflowStatus
  **/
  @JsonProperty("scheduledpurge.workflowStatus")
  public ConfigNodePropertyDropDown getScheduledpurgeWorkflowStatus() {
    return scheduledpurgeWorkflowStatus;
  }

  public void setScheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
    return this;
  }

 /**
   * Get scheduledpurgeModelIds
   * @return scheduledpurgeModelIds
  **/
  @JsonProperty("scheduledpurge.modelIds")
  public ConfigNodePropertyArray getScheduledpurgeModelIds() {
    return scheduledpurgeModelIds;
  }

  public void setScheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
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

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

