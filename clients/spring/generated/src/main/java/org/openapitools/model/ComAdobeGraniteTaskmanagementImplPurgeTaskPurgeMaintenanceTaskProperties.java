package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
 */

@JsonTypeName("comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean purgeCompleted;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger completedAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean purgeActive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger activeAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger saveThreshold;

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeCompleted(@Nullable ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
    return this;
  }

  /**
   * Get purgeCompleted
   * @return purgeCompleted
   */
  @Valid 
  @Schema(name = "purgeCompleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purgeCompleted")
  public @Nullable ConfigNodePropertyBoolean getPurgeCompleted() {
    return purgeCompleted;
  }

  @JsonProperty("purgeCompleted")
  public void setPurgeCompleted(@Nullable ConfigNodePropertyBoolean purgeCompleted) {
    this.purgeCompleted = purgeCompleted;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties completedAge(@Nullable ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
    return this;
  }

  /**
   * Get completedAge
   * @return completedAge
   */
  @Valid 
  @Schema(name = "completedAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAge")
  public @Nullable ConfigNodePropertyInteger getCompletedAge() {
    return completedAge;
  }

  @JsonProperty("completedAge")
  public void setCompletedAge(@Nullable ConfigNodePropertyInteger completedAge) {
    this.completedAge = completedAge;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties purgeActive(@Nullable ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
    return this;
  }

  /**
   * Get purgeActive
   * @return purgeActive
   */
  @Valid 
  @Schema(name = "purgeActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purgeActive")
  public @Nullable ConfigNodePropertyBoolean getPurgeActive() {
    return purgeActive;
  }

  @JsonProperty("purgeActive")
  public void setPurgeActive(@Nullable ConfigNodePropertyBoolean purgeActive) {
    this.purgeActive = purgeActive;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties activeAge(@Nullable ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
    return this;
  }

  /**
   * Get activeAge
   * @return activeAge
   */
  @Valid 
  @Schema(name = "activeAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeAge")
  public @Nullable ConfigNodePropertyInteger getActiveAge() {
    return activeAge;
  }

  @JsonProperty("activeAge")
  public void setActiveAge(@Nullable ConfigNodePropertyInteger activeAge) {
    this.activeAge = activeAge;
  }

  public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties saveThreshold(@Nullable ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

  /**
   * Get saveThreshold
   * @return saveThreshold
   */
  @Valid 
  @Schema(name = "saveThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("saveThreshold")
  public @Nullable ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  @JsonProperty("saveThreshold")
  public void setSaveThreshold(@Nullable ConfigNodePropertyInteger saveThreshold) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

