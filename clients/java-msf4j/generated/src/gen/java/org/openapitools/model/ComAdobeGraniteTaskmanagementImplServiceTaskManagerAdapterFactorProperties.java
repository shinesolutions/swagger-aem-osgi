package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties   {
  @JsonProperty("adapter.condition")
  private ConfigNodePropertyString adapterCondition;

  @JsonProperty("taskmanager.admingroups")
  private ConfigNodePropertyArray taskmanagerAdmingroups;

  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

   /**
   * Get adapterCondition
   * @return adapterCondition
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties taskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
    return this;
  }

   /**
   * Get taskmanagerAdmingroups
   * @return taskmanagerAdmingroups
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTaskmanagerAdmingroups() {
    return taskmanagerAdmingroups;
  }

  public void setTaskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

