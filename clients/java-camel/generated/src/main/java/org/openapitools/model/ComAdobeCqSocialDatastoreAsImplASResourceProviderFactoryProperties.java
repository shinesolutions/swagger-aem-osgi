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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {

  private ConfigNodePropertyString versionId;

  private ConfigNodePropertyBoolean cacheOn;

  private ConfigNodePropertyInteger concurrencyLevel;

  private ConfigNodePropertyInteger cacheStartSize;

  private ConfigNodePropertyInteger cacheTtl;

  private ConfigNodePropertyInteger cacheSize;

  private ConfigNodePropertyInteger timeLimit;

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties versionId(ConfigNodePropertyString versionId) {
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
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }

  public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
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
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
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
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
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
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
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
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
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
  public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties timeLimit(ConfigNodePropertyInteger timeLimit) {
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
  public ConfigNodePropertyInteger getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(ConfigNodePropertyInteger timeLimit) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

