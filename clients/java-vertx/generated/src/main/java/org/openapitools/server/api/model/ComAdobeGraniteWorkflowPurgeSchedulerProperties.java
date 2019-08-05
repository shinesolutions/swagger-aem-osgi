package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteWorkflowPurgeSchedulerProperties   {
  
  private ConfigNodePropertyString scheduledpurgeName = null;
  private ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus = null;
  private ConfigNodePropertyArray scheduledpurgeModelIds = null;
  private ConfigNodePropertyInteger scheduledpurgeDaysold = null;

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties () {

  }

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties (ConfigNodePropertyString scheduledpurgeName, ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus, ConfigNodePropertyArray scheduledpurgeModelIds, ConfigNodePropertyInteger scheduledpurgeDaysold) {
    this.scheduledpurgeName = scheduledpurgeName;
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
    this.scheduledpurgeDaysold = scheduledpurgeDaysold;
  }

    
  @JsonProperty("scheduledpurge.name")
  public ConfigNodePropertyString getScheduledpurgeName() {
    return scheduledpurgeName;
  }
  public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
  }

    
  @JsonProperty("scheduledpurge.workflowStatus")
  public ConfigNodePropertyDropDown getScheduledpurgeWorkflowStatus() {
    return scheduledpurgeWorkflowStatus;
  }
  public void setScheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
    this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
  }

    
  @JsonProperty("scheduledpurge.modelIds")
  public ConfigNodePropertyArray getScheduledpurgeModelIds() {
    return scheduledpurgeModelIds;
  }
  public void setScheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
    this.scheduledpurgeModelIds = scheduledpurgeModelIds;
  }

    
  @JsonProperty("scheduledpurge.daysold")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
