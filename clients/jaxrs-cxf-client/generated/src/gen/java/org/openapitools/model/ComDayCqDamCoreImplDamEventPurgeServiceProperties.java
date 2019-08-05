package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplDamEventPurgeServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString schedulerExpression = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxSavedActivities = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger saveInterval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean enableActivityPurge = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown eventTypes = null;
 /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

 /**
   * Get maxSavedActivities
   * @return maxSavedActivities
  **/
  @JsonProperty("maxSavedActivities")
  public ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }

  public void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties maxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
    return this;
  }

 /**
   * Get saveInterval
   * @return saveInterval
  **/
  @JsonProperty("saveInterval")
  public ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }

  public void setSaveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties saveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
    return this;
  }

 /**
   * Get enableActivityPurge
   * @return enableActivityPurge
  **/
  @JsonProperty("enableActivityPurge")
  public ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }

  public void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties enableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
    return this;
  }

 /**
   * Get eventTypes
   * @return eventTypes
  **/
  @JsonProperty("eventTypes")
  public ConfigNodePropertyDropDown getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties eventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

