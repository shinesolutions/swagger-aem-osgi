package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties   {
  private ConfigNodePropertyString cqCommerceAssetHandlerFallback;

  public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties() {
  }

  /**
   **/
  public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties cqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.asset.handler.fallback")
  @Valid public ConfigNodePropertyString getCqCommerceAssetHandlerFallback() {
    return cqCommerceAssetHandlerFallback;
  }

  @JsonProperty("cq.commerce.asset.handler.fallback")
  public void setCqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
