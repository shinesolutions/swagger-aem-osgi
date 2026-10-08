package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties   {
  private ConfigNodePropertyBoolean purgeCompleted;
  private ConfigNodePropertyInteger completedAge;
  private ConfigNodePropertyBoolean purgeActive;
  private ConfigNodePropertyInteger activeAge;
  private ConfigNodePropertyInteger saveThreshold;

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties() {
  }

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("purgeCompleted")
  @Valid public ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }

  @JsonProperty("purgeCompleted")
  public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties completedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("completedAge")
  @Valid public ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }

  @JsonProperty("completedAge")
  public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("purgeActive")
  @Valid public ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }

  @JsonProperty("purgeActive")
  public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties activeAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("activeAge")
  @Valid public ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }

  @JsonProperty("activeAge")
  public void setActiveAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("saveThreshold")
  @Valid public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  @JsonProperty("saveThreshold")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
