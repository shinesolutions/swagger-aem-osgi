package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * OrgApacheSlingServletsResolverSlingServletResolverProperties
 */

@JsonTypeName("orgApacheSlingServletsResolverSlingServletResolverProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsResolverSlingServletResolverProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString servletresolverServletRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger servletresolverCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray servletresolverPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray servletresolverDefaultExtensions;

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverServletRoot(@Nullable ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
    return this;
  }

  /**
   * Get servletresolverServletRoot
   * @return servletresolverServletRoot
   */
  @Valid 
  @Schema(name = "servletresolver.servletRoot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servletresolver.servletRoot")
  public @Nullable ConfigNodePropertyString getServletresolverServletRoot() {
    return servletresolverServletRoot;
  }

  @JsonProperty("servletresolver.servletRoot")
  public void setServletresolverServletRoot(@Nullable ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverCacheSize(@Nullable ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
    return this;
  }

  /**
   * Get servletresolverCacheSize
   * @return servletresolverCacheSize
   */
  @Valid 
  @Schema(name = "servletresolver.cacheSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servletresolver.cacheSize")
  public @Nullable ConfigNodePropertyInteger getServletresolverCacheSize() {
    return servletresolverCacheSize;
  }

  @JsonProperty("servletresolver.cacheSize")
  public void setServletresolverCacheSize(@Nullable ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverPaths(@Nullable ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
    return this;
  }

  /**
   * Get servletresolverPaths
   * @return servletresolverPaths
   */
  @Valid 
  @Schema(name = "servletresolver.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servletresolver.paths")
  public @Nullable ConfigNodePropertyArray getServletresolverPaths() {
    return servletresolverPaths;
  }

  @JsonProperty("servletresolver.paths")
  public void setServletresolverPaths(@Nullable ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverDefaultExtensions(@Nullable ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
    return this;
  }

  /**
   * Get servletresolverDefaultExtensions
   * @return servletresolverDefaultExtensions
   */
  @Valid 
  @Schema(name = "servletresolver.defaultExtensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servletresolver.defaultExtensions")
  public @Nullable ConfigNodePropertyArray getServletresolverDefaultExtensions() {
    return servletresolverDefaultExtensions;
  }

  @JsonProperty("servletresolver.defaultExtensions")
  public void setServletresolverDefaultExtensions(@Nullable ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsResolverSlingServletResolverProperties orgApacheSlingServletsResolverSlingServletResolverProperties = (OrgApacheSlingServletsResolverSlingServletResolverProperties) o;
    return Objects.equals(this.servletresolverServletRoot, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverServletRoot) &&
        Objects.equals(this.servletresolverCacheSize, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverCacheSize) &&
        Objects.equals(this.servletresolverPaths, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverPaths) &&
        Objects.equals(this.servletresolverDefaultExtensions, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverDefaultExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servletresolverServletRoot, servletresolverCacheSize, servletresolverPaths, servletresolverDefaultExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsResolverSlingServletResolverProperties {\n");
    sb.append("    servletresolverServletRoot: ").append(toIndentedString(servletresolverServletRoot)).append("\n");
    sb.append("    servletresolverCacheSize: ").append(toIndentedString(servletresolverCacheSize)).append("\n");
    sb.append("    servletresolverPaths: ").append(toIndentedString(servletresolverPaths)).append("\n");
    sb.append("    servletresolverDefaultExtensions: ").append(toIndentedString(servletresolverDefaultExtensions)).append("\n");
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

