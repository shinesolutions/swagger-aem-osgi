package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties   {
  @JsonProperty("purgeCompleted")
  private ConfigNodePropertyBoolean purgeCompleted = null;

  @JsonProperty("completedAge")
  private ConfigNodePropertyInteger completedAge = null;

  @JsonProperty("purgeActive")
  private ConfigNodePropertyBoolean purgeActive = null;

  @JsonProperty("activeAge")
  private ConfigNodePropertyInteger activeAge = null;

  @JsonProperty("saveThreshold")
  private ConfigNodePropertyInteger saveThreshold = null;

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
    return this;
  }

   /**
   * Get purgeCompleted
   * @return purgeCompleted
  **/
  @Valid
  public ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }

  public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties completedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
    return this;
  }

   /**
   * Get completedAge
   * @return completedAge
  **/
  @Valid
  public ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }

  public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
    return this;
  }

   /**
   * Get purgeActive
   * @return purgeActive
  **/
  @Valid
  public ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }

  public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties activeAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
    return this;
  }

   /**
   * Get activeAge
   * @return activeAge
  **/
  @Valid
  public ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }

  public void setActiveAge(ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

   /**
   * Get saveThreshold
   * @return saveThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

