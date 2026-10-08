package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamCoreImplDamEventPurgeServiceProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplDamEventPurgeServiceProperties   {
  private ConfigNodePropertyString schedulerExpression;
  private ConfigNodePropertyInteger maxSavedActivities;
  private ConfigNodePropertyInteger saveInterval;
  private ConfigNodePropertyBoolean enableActivityPurge;
  private ConfigNodePropertyDropDown eventTypes;

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties() {
  }

  /**
   **/
  public ComDayCqDamCoreImplDamEventPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  @Valid public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  @JsonProperty("scheduler.expression")
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
  @Valid public ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }

  @JsonProperty("maxSavedActivities")
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
  @Valid public ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }

  @JsonProperty("saveInterval")
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
  @Valid public ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }

  @JsonProperty("enableActivityPurge")
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
  @Valid public ConfigNodePropertyDropDown getEventTypes() {
    return eventTypes;
  }

  @JsonProperty("eventTypes")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
