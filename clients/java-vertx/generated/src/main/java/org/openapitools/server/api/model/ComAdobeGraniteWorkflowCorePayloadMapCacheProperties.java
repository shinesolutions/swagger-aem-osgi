package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties   {
  
  private ConfigNodePropertyArray getSystemWorkflowModels = null;
  private ConfigNodePropertyString getPackageRootPath = null;

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties () {

  }

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties (ConfigNodePropertyArray getSystemWorkflowModels, ConfigNodePropertyString getPackageRootPath) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
    this.getPackageRootPath = getPackageRootPath;
  }

    
  @JsonProperty("getSystemWorkflowModels")
  public ConfigNodePropertyArray getGetSystemWorkflowModels() {
    return getSystemWorkflowModels;
  }
  public void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
  }

    
  @JsonProperty("getPackageRootPath")
  public ConfigNodePropertyString getGetPackageRootPath() {
    return getPackageRootPath;
  }
  public void setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
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
    return Objects.equals(getSystemWorkflowModels, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getSystemWorkflowModels) &&
        Objects.equals(getPackageRootPath, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getPackageRootPath);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
