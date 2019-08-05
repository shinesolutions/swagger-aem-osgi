package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties   {
  @JsonProperty("cq.commerce.asset.handler.fallback")
  private ConfigNodePropertyString cqCommerceAssetHandlerFallback = null;

  public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties cqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    return this;
  }

  /**
   * Get cqCommerceAssetHandlerFallback
   * @return cqCommerceAssetHandlerFallback
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqCommerceAssetHandlerFallback() {
    return cqCommerceAssetHandlerFallback;
  }

  public void setCqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties = (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties) o;
    return Objects.equals(this.cqCommerceAssetHandlerFallback, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.cqCommerceAssetHandlerFallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceAssetHandlerFallback);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

