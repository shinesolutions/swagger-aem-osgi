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
 * ComDayCqDamCommonsUtilImplAssetCacheImplProperties
 */

@JsonTypeName("comDayCqDamCommonsUtilImplAssetCacheImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger largeFileMin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cacheApply;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray mimeTypes;

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties largeFileMin(@Nullable ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
    return this;
  }

  /**
   * Get largeFileMin
   * @return largeFileMin
   */
  @Valid 
  @Schema(name = "large.file.min", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large.file.min")
  public @Nullable ConfigNodePropertyInteger getLargeFileMin() {
    return largeFileMin;
  }

  @JsonProperty("large.file.min")
  public void setLargeFileMin(@Nullable ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties cacheApply(@Nullable ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
    return this;
  }

  /**
   * Get cacheApply
   * @return cacheApply
   */
  @Valid 
  @Schema(name = "cache.apply", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.apply")
  public @Nullable ConfigNodePropertyBoolean getCacheApply() {
    return cacheApply;
  }

  @JsonProperty("cache.apply")
  public void setCacheApply(@Nullable ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties mimeTypes(@Nullable ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  /**
   * Get mimeTypes
   * @return mimeTypes
   */
  @Valid 
  @Schema(name = "mime.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mime.types")
  public @Nullable ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  @JsonProperty("mime.types")
  public void setMimeTypes(@Nullable ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties comDayCqDamCommonsUtilImplAssetCacheImplProperties = (ComDayCqDamCommonsUtilImplAssetCacheImplProperties) o;
    return Objects.equals(this.largeFileMin, comDayCqDamCommonsUtilImplAssetCacheImplProperties.largeFileMin) &&
        Objects.equals(this.cacheApply, comDayCqDamCommonsUtilImplAssetCacheImplProperties.cacheApply) &&
        Objects.equals(this.mimeTypes, comDayCqDamCommonsUtilImplAssetCacheImplProperties.mimeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeFileMin, cacheApply, mimeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {\n");
    sb.append("    largeFileMin: ").append(toIndentedString(largeFileMin)).append("\n");
    sb.append("    cacheApply: ").append(toIndentedString(cacheApply)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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

