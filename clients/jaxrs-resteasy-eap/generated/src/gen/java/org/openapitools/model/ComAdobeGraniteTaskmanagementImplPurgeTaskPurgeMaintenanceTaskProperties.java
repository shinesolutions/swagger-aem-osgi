package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties   {
  

  private ConfigNodePropertyBoolean purgeCompleted = null;

  private ConfigNodePropertyInteger completedAge = null;

  private ConfigNodePropertyBoolean purgeActive = null;

  private ConfigNodePropertyInteger activeAge = null;

  private ConfigNodePropertyInteger saveThreshold = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purgeCompleted")
  public ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }
  public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completedAge")
  public ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }
  public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purgeActive")
  public ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }
  public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activeAge")
  public ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }
  public void setActiveAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

