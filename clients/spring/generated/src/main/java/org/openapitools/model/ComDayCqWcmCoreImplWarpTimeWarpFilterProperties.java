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
 * ComDayCqWcmCoreImplWarpTimeWarpFilterProperties
 */

@JsonTypeName("comDayCqWcmCoreImplWarpTimeWarpFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString filterOrder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString filterScope;

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterOrder(@Nullable ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
    return this;
  }

  /**
   * Get filterOrder
   * @return filterOrder
   */
  @Valid 
  @Schema(name = "filter.order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.order")
  public @Nullable ConfigNodePropertyString getFilterOrder() {
    return filterOrder;
  }

  @JsonProperty("filter.order")
  public void setFilterOrder(@Nullable ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
  }

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterScope(@Nullable ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
    return this;
  }

  /**
   * Get filterScope
   * @return filterScope
   */
  @Valid 
  @Schema(name = "filter.scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.scope")
  public @Nullable ConfigNodePropertyString getFilterScope() {
    return filterScope;
  }

  @JsonProperty("filter.scope")
  public void setFilterScope(@Nullable ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties comDayCqWcmCoreImplWarpTimeWarpFilterProperties = (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties) o;
    return Objects.equals(this.filterOrder, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterOrder) &&
        Objects.equals(this.filterScope, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterOrder, filterScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {\n");
    sb.append("    filterOrder: ").append(toIndentedString(filterOrder)).append("\n");
    sb.append("    filterScope: ").append(toIndentedString(filterScope)).append("\n");
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

