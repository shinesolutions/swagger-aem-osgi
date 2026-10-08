package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
 */

@JsonTypeName("comAdobeCqCommerceImplAssetDynamicImageHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqCommerceAssetHandlerActive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqCommerceAssetHandlerName;

  public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties cqCommerceAssetHandlerActive(@Nullable ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
    return this;
  }

  /**
   * Get cqCommerceAssetHandlerActive
   * @return cqCommerceAssetHandlerActive
   */
  @Valid 
  @Schema(name = "cq.commerce.asset.handler.active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.commerce.asset.handler.active")
  public @Nullable ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
    return cqCommerceAssetHandlerActive;
  }

  @JsonProperty("cq.commerce.asset.handler.active")
  public void setCqCommerceAssetHandlerActive(@Nullable ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
    this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
  }

  public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties cqCommerceAssetHandlerName(@Nullable ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
    return this;
  }

  /**
   * Get cqCommerceAssetHandlerName
   * @return cqCommerceAssetHandlerName
   */
  @Valid 
  @Schema(name = "cq.commerce.asset.handler.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.commerce.asset.handler.name")
  public @Nullable ConfigNodePropertyString getCqCommerceAssetHandlerName() {
    return cqCommerceAssetHandlerName;
  }

  @JsonProperty("cq.commerce.asset.handler.name")
  public void setCqCommerceAssetHandlerName(@Nullable ConfigNodePropertyString cqCommerceAssetHandlerName) {
    this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

