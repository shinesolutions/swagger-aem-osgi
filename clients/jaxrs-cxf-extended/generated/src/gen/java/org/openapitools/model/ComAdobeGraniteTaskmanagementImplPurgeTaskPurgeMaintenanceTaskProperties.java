package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean purgeCompleted;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger completedAge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean purgeActive;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger activeAge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger saveThreshold;
 /**
  * Get purgeCompleted
  * @return purgeCompleted
  */
  @JsonProperty("purgeCompleted")
  public ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }

  /**
   * Sets the <code>purgeCompleted</code> property.
   */
 public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

  /**
   * Sets the <code>purgeCompleted</code> property.
   */
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
    return this;
  }

 /**
  * Get completedAge
  * @return completedAge
  */
  @JsonProperty("completedAge")
  public ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }

  /**
   * Sets the <code>completedAge</code> property.
   */
 public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

  /**
   * Sets the <code>completedAge</code> property.
   */
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties completedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
    return this;
  }

 /**
  * Get purgeActive
  * @return purgeActive
  */
  @JsonProperty("purgeActive")
  public ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }

  /**
   * Sets the <code>purgeActive</code> property.
   */
 public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

  /**
   * Sets the <code>purgeActive</code> property.
   */
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
    return this;
  }

 /**
  * Get activeAge
  * @return activeAge
  */
  @JsonProperty("activeAge")
  public ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }

  /**
   * Sets the <code>activeAge</code> property.
   */
 public void setActiveAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

  /**
   * Sets the <code>activeAge</code> property.
   */
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties activeAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
    return this;
  }

 /**
  * Get saveThreshold
  * @return saveThreshold
  */
  @JsonProperty("saveThreshold")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  /**
   * Sets the <code>saveThreshold</code> property.
   */
 public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  /**
   * Sets the <code>saveThreshold</code> property.
   */
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
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
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties = (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties) o;
    return Objects.equals(this.purgeCompleted, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.purgeCompleted) &&
        Objects.equals(this.completedAge, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.completedAge) &&
        Objects.equals(this.purgeActive, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.purgeActive) &&
        Objects.equals(this.activeAge, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.activeAge) &&
        Objects.equals(this.saveThreshold, comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.saveThreshold);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

