package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeGraniteWorkflowPurgeSchedulerProperties   {
  @JsonProperty("scheduledpurge.name")
  private ConfigNodePropertyString scheduledpurgeName = null;

  @JsonProperty("scheduledpurge.workflowStatus")
  private ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus = null;

  @JsonProperty("scheduledpurge.modelIds")
  private ConfigNodePropertyArray scheduledpurgeModelIds = null;

  @JsonProperty("scheduledpurge.daysold")
  private ConfigNodePropertyInteger scheduledpurgeDaysold = null;

  /**
   **/
  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledpurge.name")
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }
  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledpurge.workflowStatus")
  public ConfigNodePropertyDropDown getScheduledpurgeWorkflowStatus() {
    return scheduledpurgeWorkflowStatus;
  }
  public void setScheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledpurge.modelIds")
  public ConfigNodePropertyArray getScheduledpurgeModelIds() {
    return scheduledpurgeModelIds;
  }
  public void setScheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledpurge.daysold")
  public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
    return scheduledpurgeDaysold;
  }
  public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowPurgeSchedulerProperties comAdobeGraniteWorkflowPurgeSchedulerProperties = (ComAdobeGraniteWorkflowPurgeSchedulerProperties) o;
    return Objects.equals(scheduledpurgeName, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeName) &&
        Objects.equals(scheduledpurgeWorkflowStatus, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeWorkflowStatus) &&
        Objects.equals(scheduledpurgeModelIds, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeModelIds) &&
        Objects.equals(scheduledpurgeDaysold, comAdobeGraniteWorkflowPurgeSchedulerProperties.scheduledpurgeDaysold);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

