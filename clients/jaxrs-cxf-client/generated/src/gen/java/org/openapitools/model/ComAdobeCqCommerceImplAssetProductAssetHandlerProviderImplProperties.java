package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqCommerceAssetHandlerFallback = null;
 /**
   * Get cqCommerceAssetHandlerFallback
   * @return cqCommerceAssetHandlerFallback
  **/
  @JsonProperty("cq.commerce.asset.handler.fallback")
  public ConfigNodePropertyString getCqCommerceAssetHandlerFallback() {
    return cqCommerceAssetHandlerFallback;
  }

  public void setCqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
  }

  public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties cqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {\n");
    
    sb.append("    cqCommerceAssetHandlerFallback: ").append(toIndentedString(cqCommerceAssetHandlerFallback)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

