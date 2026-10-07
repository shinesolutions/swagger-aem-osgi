package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties   {
  @JsonProperty("workflowpackageinfoprovider.filter")
  private ConfigNodePropertyArray workflowpackageinfoproviderFilter;

  @JsonProperty("workflowpackageinfoprovider.filter.rootpath")
  private ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath;

  public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties workflowpackageinfoproviderFilter(ConfigNodePropertyArray workflowpackageinfoproviderFilter) {
    this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
    return this;
  }

  /**
   * Get workflowpackageinfoproviderFilter
   * @return workflowpackageinfoproviderFilter
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getWorkflowpackageinfoproviderFilter() {
    return workflowpackageinfoproviderFilter;
  }

  public void setWorkflowpackageinfoproviderFilter(ConfigNodePropertyArray workflowpackageinfoproviderFilter) {
    this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
  }

  public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties workflowpackageinfoproviderFilterRootpath(ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath) {
    this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
    return this;
  }

  /**
   * Get workflowpackageinfoproviderFilterRootpath
   * @return workflowpackageinfoproviderFilterRootpath
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.workflowpackageinfoproviderFilter, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.workflowpackageinfoproviderFilter) &&
        Objects.equals(this.workflowpackageinfoproviderFilterRootpath, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.workflowpackageinfoproviderFilterRootpath);
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

