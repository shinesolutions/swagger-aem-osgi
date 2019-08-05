package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplDamEventPurgeServiceProperties   {
  
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyInteger maxSavedActivities = null;
  private ConfigNodePropertyInteger saveInterval = null;
  private ConfigNodePropertyBoolean enableActivityPurge = null;
  private ConfigNodePropertyDropDown eventTypes = null;

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties () {

  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties (ConfigNodePropertyString schedulerExpression, ConfigNodePropertyInteger maxSavedActivities, ConfigNodePropertyInteger saveInterval, ConfigNodePropertyBoolean enableActivityPurge, ConfigNodePropertyDropDown eventTypes) {
    this.schedulerExpression = schedulerExpression;
    this.maxSavedActivities = maxSavedActivities;
    this.saveInterval = saveInterval;
    this.enableActivityPurge = enableActivityPurge;
    this.eventTypes = eventTypes;
  }

    
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

    
  @JsonProperty("maxSavedActivities")
  public ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }
  public void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
  }

    
  @JsonProperty("saveInterval")
  public ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }
  public void setSaveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
  }

    
  @JsonProperty("enableActivityPurge")
  public ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }
  public void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
  }

    
  @JsonProperty("eventTypes")
  public ConfigNodePropertyDropDown getEventTypes() {
    return eventTypes;
  }
  public void setEventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
