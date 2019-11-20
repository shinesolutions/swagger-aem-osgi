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

import org.openapitools.client.model.ConfigNodePropertyInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqExtwidgetServletsImageSpriteServletProperties {
  
  @SerializedName("maxWidth")
  private ConfigNodePropertyInteger maxWidth = null;
  @SerializedName("maxHeight")
  private ConfigNodePropertyInteger maxHeight = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqExtwidgetServletsImageSpriteServletProperties comDayCqExtwidgetServletsImageSpriteServletProperties = (ComDayCqExtwidgetServletsImageSpriteServletProperties) o;
    return (this.maxWidth == null ? comDayCqExtwidgetServletsImageSpriteServletProperties.maxWidth == null : this.maxWidth.equals(comDayCqExtwidgetServletsImageSpriteServletProperties.maxWidth)) &&
        (this.maxHeight == null ? comDayCqExtwidgetServletsImageSpriteServletProperties.maxHeight == null : this.maxHeight.equals(comDayCqExtwidgetServletsImageSpriteServletProperties.maxHeight));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.maxWidth == null ? 0: this.maxWidth.hashCode());
    result = 31 * result + (this.maxHeight == null ? 0: this.maxHeight.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqExtwidgetServletsImageSpriteServletProperties {\n");
    
    sb.append("  maxWidth: ").append(maxWidth).append("\n");
    sb.append("  maxHeight: ").append(maxHeight).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}