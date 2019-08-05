package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean purgeCompleted = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger completedAge = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean purgeActive = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger activeAge = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger saveThreshold = null;
 /**
   * Get purgeCompleted
   * @return purgeCompleted
  **/
  @JsonProperty("purgeCompleted")
  public ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }

  public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
    return this;
  }

 /**
   * Get completedAge
   * @return completedAge
  **/
  @JsonProperty("completedAge")
  public ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }

  public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties completedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
    return this;
  }

 /**
   * Get purgeActive
   * @return purgeActive
  **/
  @JsonProperty("purgeActive")
  public ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }

  public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
    return this;
  }

 /**
   * Get activeAge
   * @return activeAge
  **/
  @JsonProperty("activeAge")
  public ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }

  public void setActiveAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties activeAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
    return this;
  }

 /**
   * Get saveThreshold
   * @return saveThreshold
  **/
  @JsonProperty("saveThreshold")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

