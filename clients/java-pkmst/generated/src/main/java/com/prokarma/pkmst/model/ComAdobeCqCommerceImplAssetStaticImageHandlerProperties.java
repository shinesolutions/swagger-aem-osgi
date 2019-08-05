package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqCommerceImplAssetStaticImageHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties   {
  @JsonProperty("cq.commerce.asset.handler.active")
  private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive = null;

  @JsonProperty("cq.commerce.asset.handler.name")
  private ConfigNodePropertyString cqCommerceAssetHandlerName = null;

  public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties cqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
    return this;
  }

   /**
   * Get cqCommerceAssetHandlerActive
   * @return cqCommerceAssetHandlerActive
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
    return cqCommerceAssetHandlerActive;
  }

  public void setCqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
  }

  public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties cqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
    return this;
  }

   /**
   * Get cqCommerceAssetHandlerName
   * @return cqCommerceAssetHandlerName
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.cqCommerceAssetHandlerActive, comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerActive) &&
        Objects.equals(this.cqCommerceAssetHandlerName, comAdobeCqCommerceImplAssetStaticImageHandlerProperties.cqCommerceAssetHandlerName);
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

