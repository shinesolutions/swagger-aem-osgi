package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString adapterCondition;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray taskmanagerAdmingroups;
 /**
   * Get adapterCondition
   * @return adapterCondition
  **/
  @JsonProperty("adapter.condition")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

 /**
   * Get taskmanagerAdmingroups
   * @return taskmanagerAdmingroups
  **/
  @JsonProperty("taskmanager.admingroups")
  public ConfigNodePropertyArray getTaskmanagerAdmingroups() {
    return taskmanagerAdmingroups;
  }

  public void setTaskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
  }

  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties taskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

