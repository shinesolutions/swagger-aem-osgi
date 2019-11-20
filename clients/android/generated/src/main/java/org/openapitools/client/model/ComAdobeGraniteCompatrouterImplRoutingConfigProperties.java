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

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {
  
  @SerializedName("id")
  private ConfigNodePropertyString id = null;
  @SerializedName("compatPath")
  private ConfigNodePropertyString compatPath = null;
  @SerializedName("newPath")
  private ConfigNodePropertyString newPath = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getId() {
    return id;
  }
  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }
  public void setCompatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getNewPath() {
    return newPath;
  }
  public void setNewPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties comAdobeGraniteCompatrouterImplRoutingConfigProperties = (ComAdobeGraniteCompatrouterImplRoutingConfigProperties) o;
    return (this.id == null ? comAdobeGraniteCompatrouterImplRoutingConfigProperties.id == null : this.id.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties.id)) &&
        (this.compatPath == null ? comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath == null : this.compatPath.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath)) &&
        (this.newPath == null ? comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath == null : this.newPath.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.compatPath == null ? 0: this.compatPath.hashCode());
    result = 31 * result + (this.newPath == null ? 0: this.newPath.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  compatPath: ").append(compatPath).append("\n");
    sb.append("  newPath: ").append(newPath).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}