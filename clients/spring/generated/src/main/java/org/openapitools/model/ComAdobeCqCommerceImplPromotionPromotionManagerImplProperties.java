package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties
 */

@JsonTypeName("comAdobeCqCommerceImplPromotionPromotionManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqCommercePromotionRoot;

  public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties cqCommercePromotionRoot(@Nullable ConfigNodePropertyString cqCommercePromotionRoot) {
    this.cqCommercePromotionRoot = cqCommercePromotionRoot;
    return this;
  }

  /**
   * Get cqCommercePromotionRoot
   * @return cqCommercePromotionRoot
   */
  @Valid 
  @Schema(name = "cq.commerce.promotion.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.commerce.promotion.root")
  public @Nullable ConfigNodePropertyString getCqCommercePromotionRoot() {
    return cqCommercePromotionRoot;
  }

  @JsonProperty("cq.commerce.promotion.root")
  public void setCqCommercePromotionRoot(@Nullable ConfigNodePropertyString cqCommercePromotionRoot) {
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
    return Objects.equals(this.cqCommercePromotionRoot, comAdobeCqCommerceImplPromotionPromotionManagerImplProperties.cqCommercePromotionRoot);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

