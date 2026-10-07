package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
 */

@JsonTypeName("comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString adapterCondition;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray taskmanagerAdmingroups;

  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties adapterCondition(@Nullable ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

  /**
   * Get adapterCondition
   * @return adapterCondition
   */
  @Valid 
  @Schema(name = "adapter.condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adapter.condition")
  public @Nullable ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  @JsonProperty("adapter.condition")
  public void setAdapterCondition(@Nullable ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties taskmanagerAdmingroups(@Nullable ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
    return this;
  }

  /**
   * Get taskmanagerAdmingroups
   * @return taskmanagerAdmingroups
   */
  @Valid 
  @Schema(name = "taskmanager.admingroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskmanager.admingroups")
  public @Nullable ConfigNodePropertyArray getTaskmanagerAdmingroups() {
    return taskmanagerAdmingroups;
  }

  @JsonProperty("taskmanager.admingroups")
  public void setTaskmanagerAdmingroups(@Nullable ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties = (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties) o;
    return Objects.equals(this.adapterCondition, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.adapterCondition) &&
        Objects.equals(this.taskmanagerAdmingroups, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.taskmanagerAdmingroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterCondition, taskmanagerAdmingroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {\n");
    sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
    sb.append("    taskmanagerAdmingroups: ").append(toIndentedString(taskmanagerAdmingroups)).append("\n");
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

