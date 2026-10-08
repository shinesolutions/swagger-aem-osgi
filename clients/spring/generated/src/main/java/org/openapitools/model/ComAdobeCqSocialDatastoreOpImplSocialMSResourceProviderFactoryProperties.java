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
 * ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
 */

@JsonTypeName("comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrZkTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrCommit;

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

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrZkTimeout(@Nullable ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
    return this;
  }

  /**
   * Get solrZkTimeout
   * @return solrZkTimeout
   */
  @Valid 
  @Schema(name = "solr.zk.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.zk.timeout")
  public @Nullable ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }

  @JsonProperty("solr.zk.timeout")
  public void setSolrZkTimeout(@Nullable ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrCommit(@Nullable ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
    return this;
  }

  /**
   * Get solrCommit
   * @return solrCommit
   */
  @Valid 
  @Schema(name = "solr.commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.commit")
  public @Nullable ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }

  @JsonProperty("solr.commit")
  public void setSolrCommit(@Nullable ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheOn(@Nullable ConfigNodePropertyBoolean cacheOn) {
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

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties concurrencyLevel(@Nullable ConfigNodePropertyInteger concurrencyLevel) {
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

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheStartSize(@Nullable ConfigNodePropertyInteger cacheStartSize) {
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

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheTtl(@Nullable ConfigNodePropertyInteger cacheTtl) {
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

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheSize(@Nullable ConfigNodePropertyInteger cacheSize) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties = (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties) o;
    return Objects.equals(this.solrZkTimeout, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.solrZkTimeout) &&
        Objects.equals(this.solrCommit, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.solrCommit) &&
        Objects.equals(this.cacheOn, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheOn) &&
        Objects.equals(this.concurrencyLevel, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.concurrencyLevel) &&
        Objects.equals(this.cacheStartSize, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheStartSize) &&
        Objects.equals(this.cacheTtl, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheTtl) &&
        Objects.equals(this.cacheSize, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solrZkTimeout, solrCommit, cacheOn, concurrencyLevel, cacheStartSize, cacheTtl, cacheSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {\n");
    sb.append("    solrZkTimeout: ").append(toIndentedString(solrZkTimeout)).append("\n");
    sb.append("    solrCommit: ").append(toIndentedString(solrCommit)).append("\n");
    sb.append("    cacheOn: ").append(toIndentedString(cacheOn)).append("\n");
    sb.append("    concurrencyLevel: ").append(toIndentedString(concurrencyLevel)).append("\n");
    sb.append("    cacheStartSize: ").append(toIndentedString(cacheStartSize)).append("\n");
    sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
    sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
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

