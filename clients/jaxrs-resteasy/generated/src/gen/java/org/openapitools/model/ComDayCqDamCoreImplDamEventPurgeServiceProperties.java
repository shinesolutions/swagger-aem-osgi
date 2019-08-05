package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplDamEventPurgeServiceProperties   {
  
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyInteger maxSavedActivities = null;
  private ConfigNodePropertyInteger saveInterval = null;
  private ConfigNodePropertyBoolean enableActivityPurge = null;
  private ConfigNodePropertyDropDown eventTypes = null;

  /**
   **/
  
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

