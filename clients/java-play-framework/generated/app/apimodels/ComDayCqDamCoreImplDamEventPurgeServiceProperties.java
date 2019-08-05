package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplDamEventPurgeServiceProperties   {
  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("maxSavedActivities")
  private ConfigNodePropertyInteger maxSavedActivities = null;

  @JsonProperty("saveInterval")
  private ConfigNodePropertyInteger saveInterval = null;

  @JsonProperty("enableActivityPurge")
  private ConfigNodePropertyBoolean enableActivityPurge = null;

  @JsonProperty("eventTypes")
  private ConfigNodePropertyDropDown eventTypes = null;

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

   /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @Valid
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties maxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
    return this;
  }

   /**
   * Get maxSavedActivities
   * @return maxSavedActivities
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxSavedActivities() {
    return maxSavedActivities;
  }

  public void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
    this.maxSavedActivities = maxSavedActivities;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties saveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
    return this;
  }

   /**
   * Get saveInterval
   * @return saveInterval
  **/
  @Valid
  public ConfigNodePropertyInteger getSaveInterval() {
    return saveInterval;
  }

  public void setSaveInterval(ConfigNodePropertyInteger saveInterval) {
    this.saveInterval = saveInterval;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties enableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
    return this;
  }

   /**
   * Get enableActivityPurge
   * @return enableActivityPurge
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableActivityPurge() {
    return enableActivityPurge;
  }

  public void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
    this.enableActivityPurge = enableActivityPurge;
  }

  public ComDayCqDamCoreImplDamEventPurgeServiceProperties eventTypes(ConfigNodePropertyDropDown eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

   /**
   * Get eventTypes
   * @return eventTypes
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

