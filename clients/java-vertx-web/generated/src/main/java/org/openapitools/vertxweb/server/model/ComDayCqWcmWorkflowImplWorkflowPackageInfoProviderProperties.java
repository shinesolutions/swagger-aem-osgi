package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties   {
  
  private ConfigNodePropertyArray workflowpackageinfoproviderFilter;
  private ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath;

  public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties () {

  }

  public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties (ConfigNodePropertyArray workflowpackageinfoproviderFilter, ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath) {
    this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
    this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
  }

    
  @JsonProperty("workflowpackageinfoprovider.filter")
  public ConfigNodePropertyArray getWorkflowpackageinfoproviderFilter() {
    return workflowpackageinfoproviderFilter;
  }
  public void setWorkflowpackageinfoproviderFilter(ConfigNodePropertyArray workflowpackageinfoproviderFilter) {
    this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
  }

    
  @JsonProperty("workflowpackageinfoprovider.filter.rootpath")
  public ConfigNodePropertyString getWorkflowpackageinfoproviderFilterRootpath() {
    return workflowpackageinfoproviderFilterRootpath;
  }
  public void setWorkflowpackageinfoproviderFilterRootpath(ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath) {
    this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties = (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties) o;
    return Objects.equals(workflowpackageinfoproviderFilter, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.workflowpackageinfoproviderFilter) &&
        Objects.equals(workflowpackageinfoproviderFilterRootpath, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.workflowpackageinfoproviderFilterRootpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowpackageinfoproviderFilter, workflowpackageinfoproviderFilterRootpath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {\n");
    
    sb.append("    workflowpackageinfoproviderFilter: ").append(toIndentedString(workflowpackageinfoproviderFilter)).append("\n");
    sb.append("    workflowpackageinfoproviderFilterRootpath: ").append(toIndentedString(workflowpackageinfoproviderFilterRootpath)).append("\n");
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
