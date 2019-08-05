package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties   {
  
  private ConfigNodePropertyString adapterCondition = null;
  private ConfigNodePropertyArray taskmanagerAdmingroups = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("adapter.condition")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }
  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("taskmanager.admingroups")
  public ConfigNodePropertyArray getTaskmanagerAdmingroups() {
    return taskmanagerAdmingroups;
  }
  public void setTaskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties = (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties) o;
    return Objects.equals(adapterCondition, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.adapterCondition) &&
        Objects.equals(taskmanagerAdmingroups, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.taskmanagerAdmingroups);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

