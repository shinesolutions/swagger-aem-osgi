package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
 */

@JsonTypeName("comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString versionId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cacheOn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger concurrencyLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheStartSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheTtl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger timeLimit;

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties versionId(@Nullable ConfigNodePropertyString versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId
   * @return versionId
   */
  @Valid 
  @Schema(name = "version.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version.id")
  public @Nullable ConfigNodePropertyString getVersionId() {
    return versionId;
  }

  @JsonProperty("version.id")
  public void setVersionId(@Nullable ConfigNodePropertyString versionId) {
    this.versionId = versionId;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheOn(@Nullable ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

  /**
   * Get cacheOn
   * @return cacheOn
   */
  @Valid 
  @Schema(name = "cache.on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.on")
  public @Nullable ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  @JsonProperty("cache.on")
  public void setCacheOn(@Nullable ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties concurrencyLevel(@Nullable ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

  /**
   * Get concurrencyLevel
   * @return concurrencyLevel
   */
  @Valid 
  @Schema(name = "concurrency.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("concurrency.level")
  public @Nullable ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  @JsonProperty("concurrency.level")
  public void setConcurrencyLevel(@Nullable ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheStartSize(@Nullable ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

  /**
   * Get cacheStartSize
   * @return cacheStartSize
   */
  @Valid 
  @Schema(name = "cache.start.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.start.size")
  public @Nullable ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  @JsonProperty("cache.start.size")
  public void setCacheStartSize(@Nullable ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheTtl(@Nullable ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

  /**
   * Get cacheTtl
   * @return cacheTtl
   */
  @Valid 
  @Schema(name = "cache.ttl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.ttl")
  public @Nullable ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  @JsonProperty("cache.ttl")
  public void setCacheTtl(@Nullable ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheSize(@Nullable ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

  /**
   * Get cacheSize
   * @return cacheSize
   */
  @Valid 
  @Schema(name = "cache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cache.size")
  public @Nullable ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  @JsonProperty("cache.size")
  public void setCacheSize(@Nullable ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties timeLimit(@Nullable ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

  /**
   * Get timeLimit
   * @return timeLimit
   */
  @Valid 
  @Schema(name = "time.limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time.limit")
  public @Nullable ConfigNodePropertyInteger getTimeLimit() {
    return timeLimit;
  }

  @JsonProperty("time.limit")
  public void setTimeLimit(@Nullable ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties) o;
    return Objects.equals(this.versionId, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.versionId) &&
        Objects.equals(this.cacheOn, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheOn) &&
        Objects.equals(this.concurrencyLevel, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.concurrencyLevel) &&
        Objects.equals(this.cacheStartSize, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheStartSize) &&
        Objects.equals(this.cacheTtl, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheTtl) &&
        Objects.equals(this.cacheSize, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheSize) &&
        Objects.equals(this.timeLimit, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.timeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, cacheOn, concurrencyLevel, cacheStartSize, cacheTtl, cacheSize, timeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    cacheOn: ").append(toIndentedString(cacheOn)).append("\n");
    sb.append("    concurrencyLevel: ").append(toIndentedString(concurrencyLevel)).append("\n");
    sb.append("    cacheStartSize: ").append(toIndentedString(cacheStartSize)).append("\n");
    sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
    sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
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

