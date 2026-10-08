/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties   {
  
  private ConfigNodePropertyArray getSystemWorkflowModels;
  private ConfigNodePropertyString getPackageRootPath;

  /**
   */
  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("getSystemWorkflowModels")
  public ConfigNodePropertyArray getGetSystemWorkflowModels() {
    return getSystemWorkflowModels;
  }
  public void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
  }

  /**
   */
  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

