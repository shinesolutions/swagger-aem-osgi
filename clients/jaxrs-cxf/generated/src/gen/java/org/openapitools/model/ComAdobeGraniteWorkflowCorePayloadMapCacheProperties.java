package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray getSystemWorkflowModels;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString getPackageRootPath;
 /**
   * Get getSystemWorkflowModels
   * @return getSystemWorkflowModels
  **/
  @JsonProperty("getSystemWorkflowModels")
  public ConfigNodePropertyArray getGetSystemWorkflowModels() {
    return getSystemWorkflowModels;
  }

  public void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
  }

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
    return this;
  }

 /**
   * Get getPackageRootPath
   * @return getPackageRootPath
  **/
  @JsonProperty("getPackageRootPath")
  public ConfigNodePropertyString getGetPackageRootPath() {
    return getPackageRootPath;
  }

  public void setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
  }

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
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
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties comAdobeGraniteWorkflowCorePayloadMapCacheProperties = (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties) o;
    return Objects.equals(this.getSystemWorkflowModels, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getSystemWorkflowModels) &&
        Objects.equals(this.getPackageRootPath, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getPackageRootPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSystemWorkflowModels, getPackageRootPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {\n");
    
    sb.append("    getSystemWorkflowModels: ").append(toIndentedString(getSystemWorkflowModels)).append("\n");
    sb.append("    getPackageRootPath: ").append(toIndentedString(getPackageRootPath)).append("\n");
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

