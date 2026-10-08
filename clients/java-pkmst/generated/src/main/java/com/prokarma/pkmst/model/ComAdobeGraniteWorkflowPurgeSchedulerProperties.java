package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowPurgeSchedulerProperties   {
  @JsonProperty("scheduledpurge.name")
  private ConfigNodePropertyString scheduledpurgeName;

  @JsonProperty("scheduledpurge.workflowStatus")
  private ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus;

  @JsonProperty("scheduledpurge.modelIds")
  private ConfigNodePropertyArray scheduledpurgeModelIds;

  @JsonProperty("scheduledpurge.daysold")
  private ConfigNodePropertyInteger scheduledpurgeDaysold;

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

  /**
   * Get scheduledpurgeName
   * @return scheduledpurgeName
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }

  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
    return this;
  }

  /**
   * Get scheduledpurgeWorkflowStatus
   * @return scheduledpurgeWorkflowStatus
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getScheduledpurgeWorkflowStatus() {
    return scheduledpurgeWorkflowStatus;
  }

  public void setScheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
    return this;
  }

  /**
   * Get scheduledpurgeModelIds
   * @return scheduledpurgeModelIds
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getScheduledpurgeModelIds() {
    return scheduledpurgeModelIds;
  }

  public void setScheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    return this;
  }

  /**
   * Get scheduledpurgeDaysold
   * @return scheduledpurgeDaysold
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }

  public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

