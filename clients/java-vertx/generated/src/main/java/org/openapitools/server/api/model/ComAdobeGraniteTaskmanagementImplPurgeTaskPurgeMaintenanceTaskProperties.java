package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties   {
  
  private ConfigNodePropertyBoolean purgeCompleted = null;
  private ConfigNodePropertyInteger completedAge = null;
  private ConfigNodePropertyBoolean purgeActive = null;
  private ConfigNodePropertyInteger activeAge = null;
  private ConfigNodePropertyInteger saveThreshold = null;

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties () {

  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties (ConfigNodePropertyBoolean purgeCompleted, ConfigNodePropertyInteger completedAge, ConfigNodePropertyBoolean purgeActive, ConfigNodePropertyInteger activeAge, ConfigNodePropertyInteger saveThreshold) {
    this.purgeCompleted = purgeCompleted;
    this.completedAge = completedAge;
    this.purgeActive = purgeActive;
    this.activeAge = activeAge;
    this.saveThreshold = saveThreshold;
  }

    
  @JsonProperty("purgeCompleted")
  public ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }
  public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

    
  @JsonProperty("completedAge")
  public ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }
  public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

    
  @JsonProperty("purgeActive")
  public ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }
  public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

    
  @JsonProperty("activeAge")
  public ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }
  public void setActiveAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

    
  @JsonProperty("saveThreshold")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }
  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties = (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties) o;
    return Objects.equals(purgeCompleted, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.purgeCompleted) &&
        Objects.equals(completedAge, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.completedAge) &&
        Objects.equals(purgeActive, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.purgeActive) &&
        Objects.equals(activeAge, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.activeAge) &&
        Objects.equals(saveThreshold, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.saveThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purgeCompleted, completedAge, purgeActive, activeAge, saveThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {\n");
    
    sb.append("    purgeCompleted: ").append(toIndentedString(purgeCompleted)).append("\n");
    sb.append("    completedAge: ").append(toIndentedString(completedAge)).append("\n");
    sb.append("    purgeActive: ").append(toIndentedString(purgeActive)).append("\n");
    sb.append("    activeAge: ").append(toIndentedString(activeAge)).append("\n");
    sb.append("    saveThreshold: ").append(toIndentedString(saveThreshold)).append("\n");
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
