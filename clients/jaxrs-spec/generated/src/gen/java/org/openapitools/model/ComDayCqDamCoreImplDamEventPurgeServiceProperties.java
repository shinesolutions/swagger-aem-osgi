package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplDamEventPurgeServiceProperties   {
  
  private @Valid ConfigNodePropertyString schedulerExpression = null;
  private @Valid ConfigNodePropertyInteger maxSavedActivities = null;
  private @Valid ConfigNodePropertyInteger saveInterval = null;
  private @Valid ConfigNodePropertyBoolean enableActivityPurge = null;
  private @Valid ConfigNodePropertyDropDown eventTypes = null;

  /**
   **/
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties maxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxSavedActivities")
  public ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }
  public void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
  }

  /**
   **/
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties saveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("saveInterval")
  public ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }
  public void setSaveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
  }

  /**
   **/
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties enableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableActivityPurge")
  public ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }
  public void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
  }

  /**
   **/
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties eventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eventTypes")
  public ConfigNodePropertyDropDown getEventTypes() {
    return eventTypes;
  }
  public void setEventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplDamEventPurgeServiceProperties comDayCqDamCoreImplDamEventPurgeServiceProperties = (ComDayCqDamCoreImplDamEventPurgeServiceProperties) o;
    return Objects.equals(schedulerExpression, comDayCqDamCoreImplDamEventPurgeServiceProperties.schedulerExpression) &&
        Objects.equals(maxSavedActivities, comDayCqDamCoreImplDamEventPurgeServiceProperties.maxSavedActivities) &&
        Objects.equals(saveInterval, comDayCqDamCoreImplDamEventPurgeServiceProperties.saveInterval) &&
        Objects.equals(enableActivityPurge, comDayCqDamCoreImplDamEventPurgeServiceProperties.enableActivityPurge) &&
        Objects.equals(eventTypes, comDayCqDamCoreImplDamEventPurgeServiceProperties.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, maxSavedActivities, saveInterval, enableActivityPurge, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplDamEventPurgeServiceProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    maxSavedActivities: ").append(toIndentedString(maxSavedActivities)).append("\n");
    sb.append("    saveInterval: ").append(toIndentedString(saveInterval)).append("\n");
    sb.append("    enableActivityPurge: ").append(toIndentedString(enableActivityPurge)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

