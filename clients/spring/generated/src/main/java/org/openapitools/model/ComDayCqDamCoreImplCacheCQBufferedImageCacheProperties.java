package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
 */

@JsonTypeName("comDayCqDamCoreImplCacheCQBufferedImageCacheProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamImageCacheMaxMemory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamImageCacheMaxAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamImageCacheMaxDimension;

  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxMemory(@Nullable ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
    return this;
  }

  /**
   * Get cqDamImageCacheMaxMemory
   * @return cqDamImageCacheMaxMemory
   */
  @Valid 
  @Schema(name = "cq.dam.image.cache.max.memory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.image.cache.max.memory")
  public @Nullable ConfigNodePropertyInteger getCqDamImageCacheMaxMemory() {
    return cqDamImageCacheMaxMemory;
  }

  @JsonProperty("cq.dam.image.cache.max.memory")
  public void setCqDamImageCacheMaxMemory(@Nullable ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
  }

  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxAge(@Nullable ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
    return this;
  }

  /**
   * Get cqDamImageCacheMaxAge
   * @return cqDamImageCacheMaxAge
   */
  @Valid 
  @Schema(name = "cq.dam.image.cache.max.age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.image.cache.max.age")
  public @Nullable ConfigNodePropertyInteger getCqDamImageCacheMaxAge() {
    return cqDamImageCacheMaxAge;
  }

  @JsonProperty("cq.dam.image.cache.max.age")
  public void setCqDamImageCacheMaxAge(@Nullable ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
  }

  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxDimension(@Nullable ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
    return this;
  }

  /**
   * Get cqDamImageCacheMaxDimension
   * @return cqDamImageCacheMaxDimension
   */
  @Valid 
  @Schema(name = "cq.dam.image.cache.max.dimension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.image.cache.max.dimension")
  public @Nullable ConfigNodePropertyString getCqDamImageCacheMaxDimension() {
    return cqDamImageCacheMaxDimension;
  }

  @JsonProperty("cq.dam.image.cache.max.dimension")
  public void setCqDamImageCacheMaxDimension(@Nullable ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties comDayCqDamCoreImplCacheCQBufferedImageCacheProperties = (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties) o;
    return Objects.equals(this.cqDamImageCacheMaxMemory, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxMemory) &&
        Objects.equals(this.cqDamImageCacheMaxAge, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxAge) &&
        Objects.equals(this.cqDamImageCacheMaxDimension, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxDimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamImageCacheMaxMemory, cqDamImageCacheMaxAge, cqDamImageCacheMaxDimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {\n");
    sb.append("    cqDamImageCacheMaxMemory: ").append(toIndentedString(cqDamImageCacheMaxMemory)).append("\n");
    sb.append("    cqDamImageCacheMaxAge: ").append(toIndentedString(cqDamImageCacheMaxAge)).append("\n");
    sb.append("    cqDamImageCacheMaxDimension: ").append(toIndentedString(cqDamImageCacheMaxDimension)).append("\n");
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

