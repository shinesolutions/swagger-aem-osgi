package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties   {
  
  private ConfigNodePropertyString cqCommercePromotionRoot = null;

  public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties () {

  }

  public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties (ConfigNodePropertyString cqCommercePromotionRoot) {
    this.cqCommercePromotionRoot = cqCommercePromotionRoot;
  }

    
  @JsonProperty("cq.commerce.promotion.root")
  public ConfigNodePropertyString getCqCommercePromotionRoot() {
    return cqCommercePromotionRoot;
  }
  public void setCqCommercePromotionRoot(ConfigNodePropertyString cqCommercePromotionRoot) {
    this.cqCommercePromotionRoot = cqCommercePromotionRoot;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
