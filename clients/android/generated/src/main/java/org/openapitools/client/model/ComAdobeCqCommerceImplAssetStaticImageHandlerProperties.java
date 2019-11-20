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

import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {
  
  @SerializedName("cq.commerce.asset.handler.active")
  private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive = null;
  @SerializedName("cq.commerce.asset.handler.name")
  private ConfigNodePropertyString cqCommerceAssetHandlerName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
    return cqCommerceAssetHandlerActive;
  }
  public void setCqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCqCommerceAssetHandlerName() {
    return cqCommerceAssetHandlerName;
  }
  public void setCqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties comAdobeCqCommerceImplAssetStaticImageHandlerProperties = (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties) o;
    return (this.cqCommerceAssetHandlerActive == null ? comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerActive == null : this.cqCommerceAssetHandlerActive.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerActive)) &&
        (this.cqCommerceAssetHandlerName == null ? comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerName == null : this.cqCommerceAssetHandlerName.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cqCommerceAssetHandlerActive == null ? 0: this.cqCommerceAssetHandlerActive.hashCode());
    result = 31 * result + (this.cqCommerceAssetHandlerName == null ? 0: this.cqCommerceAssetHandlerName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {\n");
    
    sb.append("  cqCommerceAssetHandlerActive: ").append(cqCommerceAssetHandlerActive).append("\n");
    sb.append("  cqCommerceAssetHandlerName: ").append(cqCommerceAssetHandlerName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}