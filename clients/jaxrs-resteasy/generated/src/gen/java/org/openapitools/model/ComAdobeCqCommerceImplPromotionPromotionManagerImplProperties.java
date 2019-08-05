package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties   {
  
  private ConfigNodePropertyString cqCommercePromotionRoot = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.promotion.root")
  public ConfigNodePropertyString getCqCommercePromotionRoot() {
    return cqCommercePromotionRoot;
  }
  public void setCqCommercePromotionRoot(ConfigNodePropertyString cqCommercePromotionRoot) {
    this.cqCommercePromotionRoot = cqCommercePromotionRoot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties comAdobeCqCommerceImplPromotionPromotionManagerImplProperties = (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties) o;
    return Objects.equals(cqCommercePromotionRoot, comAdobeCqCommerceImplPromotionPromotionManagerImplProperties.cqCommercePromotionRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommercePromotionRoot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties {\n");
    
    sb.append("    cqCommercePromotionRoot: ").append(toIndentedString(cqCommercePromotionRoot)).append("\n");
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

