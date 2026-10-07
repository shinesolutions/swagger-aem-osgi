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
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties
 */

@JsonTypeName("comDayCqSearchImplBuilderQueryBuilderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqSearchImplBuilderQueryBuilderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray excerptProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheMaxEntries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheEntryLifetime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean xpathUnion;

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties excerptProperties(@Nullable ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
    return this;
  }

  /**
   * Get excerptProperties
   * @return excerptProperties
   */
  @Valid 
  @Schema(name = "excerpt.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excerpt.properties")
  public @Nullable ConfigNodePropertyArray getExcerptProperties() {
    return excerptProperties;
  }

  @JsonProperty("excerpt.properties")
  public void setExcerptProperties(@Nullable ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties cacheMaxEntries(@Nullable ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
    return this;
  }

  /**
   * Get cacheMaxEntries
   * @return cacheMaxEntries
   */
  @Valid 
  @Schema(name = "cache.max.entries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.max.entries")
  public @Nullable ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }

  @JsonProperty("cache.max.entries")
  public void setCacheMaxEntries(@Nullable ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties cacheEntryLifetime(@Nullable ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
    return this;
  }

  /**
   * Get cacheEntryLifetime
   * @return cacheEntryLifetime
   */
  @Valid 
  @Schema(name = "cache.entry.lifetime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.entry.lifetime")
  public @Nullable ConfigNodePropertyInteger getCacheEntryLifetime() {
    return cacheEntryLifetime;
  }

  @JsonProperty("cache.entry.lifetime")
  public void setCacheEntryLifetime(@Nullable ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties xpathUnion(@Nullable ConfigNodePropertyBoolean xpathUnion) {
    this.xpathUnion = xpathUnion;
    return this;
  }

  /**
   * Get xpathUnion
   * @return xpathUnion
   */
  @Valid 
  @Schema(name = "xpath.union", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("xpath.union")
  public @Nullable ConfigNodePropertyBoolean getXpathUnion() {
    return xpathUnion;
  }

  @JsonProperty("xpath.union")
  public void setXpathUnion(@Nullable ConfigNodePropertyBoolean xpathUnion) {
    this.xpathUnion = xpathUnion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSearchImplBuilderQueryBuilderImplProperties comDayCqSearchImplBuilderQueryBuilderImplProperties = (ComDayCqSearchImplBuilderQueryBuilderImplProperties) o;
    return Objects.equals(this.excerptProperties, comDayCqSearchImplBuilderQueryBuilderImplProperties.excerptProperties) &&
        Objects.equals(this.cacheMaxEntries, comDayCqSearchImplBuilderQueryBuilderImplProperties.cacheMaxEntries) &&
        Objects.equals(this.cacheEntryLifetime, comDayCqSearchImplBuilderQueryBuilderImplProperties.cacheEntryLifetime) &&
        Objects.equals(this.xpathUnion, comDayCqSearchImplBuilderQueryBuilderImplProperties.xpathUnion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excerptProperties, cacheMaxEntries, cacheEntryLifetime, xpathUnion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchImplBuilderQueryBuilderImplProperties {\n");
    sb.append("    excerptProperties: ").append(toIndentedString(excerptProperties)).append("\n");
    sb.append("    cacheMaxEntries: ").append(toIndentedString(cacheMaxEntries)).append("\n");
    sb.append("    cacheEntryLifetime: ").append(toIndentedString(cacheEntryLifetime)).append("\n");
    sb.append("    xpathUnion: ").append(toIndentedString(xpathUnion)).append("\n");
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

