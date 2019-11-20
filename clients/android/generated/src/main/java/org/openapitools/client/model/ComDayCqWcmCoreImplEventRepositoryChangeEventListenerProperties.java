/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {
  
  @SerializedName("paths")
  private ConfigNodePropertyArray paths = null;
  @SerializedName("excludedPaths")
  private ConfigNodePropertyArray excludedPaths = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPaths() {
    return paths;
  }
  public void setPaths(ConfigNodePropertyArray paths) {
    this.paths = paths;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExcludedPaths() {
    return excludedPaths;
  }
  public void setExcludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties = (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties) o;
    return (this.paths == null ? comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.paths == null : this.paths.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.paths)) &&
        (this.excludedPaths == null ? comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.excludedPaths == null : this.excludedPaths.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.excludedPaths));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.paths == null ? 0: this.paths.hashCode());
    result = 31 * result + (this.excludedPaths == null ? 0: this.excludedPaths.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {\n");
    
    sb.append("  paths: ").append(paths).append("\n");
    sb.append("  excludedPaths: ").append(excludedPaths).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}