package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
 */

@JsonTypeName("comAdobeCqDamS7imagingImplPsPlatformServerServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cacheEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cacheRootPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheMaxSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheMaxEntries;

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheEnable(@Nullable ConfigNodePropertyBoolean cacheEnable) {
    this.cacheEnable = cacheEnable;
    return this;
  }

  /**
   * Get cacheEnable
   * @return cacheEnable
   */
  @Valid 
  @Schema(name = "cache.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.enable")
  public @Nullable ConfigNodePropertyBoolean getCacheEnable() {
    return cacheEnable;
  }

  @JsonProperty("cache.enable")
  public void setCacheEnable(@Nullable ConfigNodePropertyBoolean cacheEnable) {
    this.cacheEnable = cacheEnable;
  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheRootPaths(@Nullable ConfigNodePropertyArray cacheRootPaths) {
    this.cacheRootPaths = cacheRootPaths;
    return this;
  }

  /**
   * Get cacheRootPaths
   * @return cacheRootPaths
   */
  @Valid 
  @Schema(name = "cache.rootPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.rootPaths")
  public @Nullable ConfigNodePropertyArray getCacheRootPaths() {
    return cacheRootPaths;
  }

  @JsonProperty("cache.rootPaths")
  public void setCacheRootPaths(@Nullable ConfigNodePropertyArray cacheRootPaths) {
    this.cacheRootPaths = cacheRootPaths;
  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheMaxSize(@Nullable ConfigNodePropertyInteger cacheMaxSize) {
    this.cacheMaxSize = cacheMaxSize;
    return this;
  }

  /**
   * Get cacheMaxSize
   * @return cacheMaxSize
   */
  @Valid 
  @Schema(name = "cache.maxSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.maxSize")
  public @Nullable ConfigNodePropertyInteger getCacheMaxSize() {
    return cacheMaxSize;
  }

  @JsonProperty("cache.maxSize")
  public void setCacheMaxSize(@Nullable ConfigNodePropertyInteger cacheMaxSize) {
    this.cacheMaxSize = cacheMaxSize;
  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheMaxEntries(@Nullable ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
    return this;
  }

  /**
   * Get cacheMaxEntries
   * @return cacheMaxEntries
   */
  @Valid 
  @Schema(name = "cache.maxEntries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.maxEntries")
  public @Nullable ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }

  @JsonProperty("cache.maxEntries")
  public void setCacheMaxEntries(@Nullable ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties comAdobeCqDamS7imagingImplPsPlatformServerServletProperties = (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties) o;
    return Objects.equals(this.cacheEnable, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheEnable) &&
        Objects.equals(this.cacheRootPaths, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheRootPaths) &&
        Objects.equals(this.cacheMaxSize, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheMaxSize) &&
        Objects.equals(this.cacheMaxEntries, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheMaxEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheEnable, cacheRootPaths, cacheMaxSize, cacheMaxEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {\n");
    sb.append("    cacheEnable: ").append(toIndentedString(cacheEnable)).append("\n");
    sb.append("    cacheRootPaths: ").append(toIndentedString(cacheRootPaths)).append("\n");
    sb.append("    cacheMaxSize: ").append(toIndentedString(cacheMaxSize)).append("\n");
    sb.append("    cacheMaxEntries: ").append(toIndentedString(cacheMaxEntries)).append("\n");
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

