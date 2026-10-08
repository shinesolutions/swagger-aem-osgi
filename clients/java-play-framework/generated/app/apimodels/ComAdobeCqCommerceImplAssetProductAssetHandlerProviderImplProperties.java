package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties   {
  @JsonProperty("cq.commerce.asset.handler.fallback")
  @Valid

  private ConfigNodePropertyString cqCommerceAssetHandlerFallback;

  public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties cqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    return this;
  }

   /**
   * Get cqCommerceAssetHandlerFallback
   * @return cqCommerceAssetHandlerFallback
  **/
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
    return Objects.equals(cqCommerceAssetHandlerFallback, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.cqCommerceAssetHandlerFallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceAssetHandlerFallback);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

