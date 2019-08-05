package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties   {
  
  private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive = null;

  private ConfigNodePropertyString cqCommerceAssetHandlerName = null;


  /**
   **/
  public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties cqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.asset.handler.active")
  public ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
    return cqCommerceAssetHandlerActive;
  }
  public void setCqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
  }


  /**
   **/
  public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties cqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.asset.handler.name")
  public ConfigNodePropertyString getCqCommerceAssetHandlerName() {
    return cqCommerceAssetHandlerName;
  }
  public void setCqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties comAdobeCqCommerceImplAssetStaticImageHandlerProperties = (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties) o;
    return Objects.equals(cqCommerceAssetHandlerActive, comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerActive) &&
        Objects.equals(cqCommerceAssetHandlerName, comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceAssetHandlerActive, cqCommerceAssetHandlerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {\n");
    
    sb.append("    cqCommerceAssetHandlerActive: ").append(toIndentedString(cqCommerceAssetHandlerActive)).append("\n");
    sb.append("    cqCommerceAssetHandlerName: ").append(toIndentedString(cqCommerceAssetHandlerName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

