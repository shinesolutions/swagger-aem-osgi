package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.commerce.asset.handler.fallback")
  private ConfigNodePropertyString cqCommerceAssetHandlerFallback;

  /**
   * 
   * @return cqCommerceAssetHandlerFallback
   */
  public ConfigNodePropertyString getCqCommerceAssetHandlerFallback() {
    return cqCommerceAssetHandlerFallback;
  }

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
