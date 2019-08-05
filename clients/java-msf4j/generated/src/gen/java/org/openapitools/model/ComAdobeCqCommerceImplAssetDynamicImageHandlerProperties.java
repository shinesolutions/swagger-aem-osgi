package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties   {
  @JsonProperty("cq.commerce.asset.handler.active")
  private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive = null;

  @JsonProperty("cq.commerce.asset.handler.name")
  private ConfigNodePropertyString cqCommerceAssetHandlerName = null;

  public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties cqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
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

  public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties cqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
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
    ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties comAdobeCqCommerceImplAssetDynamicImageHandlerProperties = (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties) o;
    return Objects.equals(this.cqCommerceAssetHandlerActive, comAdobeCqCommerceImplAssetDynamicImageHandlerProperties.cqCommerceAssetHandlerActive) &&
        Objects.equals(this.cqCommerceAssetHandlerName, comAdobeCqCommerceImplAssetDynamicImageHandlerProperties.cqCommerceAssetHandlerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceAssetHandlerActive, cqCommerceAssetHandlerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties {\n");
    
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

