package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteWorkflowPurgeSchedulerProperties   {
  @JsonProperty("scheduledpurge.name")
  private ConfigNodePropertyString scheduledpurgeName = null;

  @JsonProperty("scheduledpurge.workflowStatus")
  private ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus = null;

  @JsonProperty("scheduledpurge.modelIds")
  private ConfigNodePropertyArray scheduledpurgeModelIds = null;

  @JsonProperty("scheduledpurge.daysold")
  private ConfigNodePropertyInteger scheduledpurgeDaysold = null;

  public ComAdobeGraniteWorkflowPurgeSchedulerProperties scheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
    this.scheduledpurgeName = scheduledpurgeName;
    return this;
  }

   /**
   * Get scheduledpurgeName
   * @return scheduledpurgeName
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

