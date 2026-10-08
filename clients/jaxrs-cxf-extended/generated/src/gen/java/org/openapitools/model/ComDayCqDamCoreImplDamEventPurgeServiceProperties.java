package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplDamEventPurgeServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString schedulerExpression;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxSavedActivities;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger saveInterval;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableActivityPurge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown eventTypes;
 /**
  * Get schedulerExpression
  * @return schedulerExpression
  */
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  /**
   * Sets the <code>schedulerExpression</code> property.
   */
 public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   * Sets the <code>schedulerExpression</code> property.
   */
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

 /**
  * Get maxSavedActivities
  * @return maxSavedActivities
  */
  @JsonProperty("maxSavedActivities")
  public ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }

  /**
   * Sets the <code>maxSavedActivities</code> property.
   */
 public void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
  }

  /**
   * Sets the <code>maxSavedActivities</code> property.
   */
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties maxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
    return this;
  }

 /**
  * Get saveInterval
  * @return saveInterval
  */
  @JsonProperty("saveInterval")
  public ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }

  /**
   * Sets the <code>saveInterval</code> property.
   */
 public void setSaveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
  }

  /**
   * Sets the <code>saveInterval</code> property.
   */
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties saveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
    return this;
  }

 /**
  * Get enableActivityPurge
  * @return enableActivityPurge
  */
  @JsonProperty("enableActivityPurge")
  public ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }

  /**
   * Sets the <code>enableActivityPurge</code> property.
   */
 public void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
  }

  /**
   * Sets the <code>enableActivityPurge</code> property.
   */
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties enableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
    return this;
  }

 /**
  * Get eventTypes
  * @return eventTypes
  */
  @JsonProperty("eventTypes")
  public ConfigNodePropertyDropDown getEventTypes() {
    return eventTypes;
  }

  /**
   * Sets the <code>eventTypes</code> property.
   */
 public void setEventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
  }

  /**
   * Sets the <code>eventTypes</code> property.
   */
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties eventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
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
    ComDayCqDamCoreImplDamEventPurgeServiceProperties comDayCqDamCoreImplDamEventPurgeServiceProperties = (ComDayCqDamCoreImplDamEventPurgeServiceProperties) o;
    return Objects.equals(this.schedulerExpression, comDayCqDamCoreImplDamEventPurgeServiceProperties.schedulerExpression) &&
        Objects.equals(this.maxSavedActivities, comDayCqDamCoreImplDamEventPurgeServiceProperties.maxSavedActivities) &&
        Objects.equals(this.saveInterval, comDayCqDamCoreImplDamEventPurgeServiceProperties.saveInterval) &&
        Objects.equals(this.enableActivityPurge, comDayCqDamCoreImplDamEventPurgeServiceProperties.enableActivityPurge) &&
        Objects.equals(this.eventTypes, comDayCqDamCoreImplDamEventPurgeServiceProperties.eventTypes);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

