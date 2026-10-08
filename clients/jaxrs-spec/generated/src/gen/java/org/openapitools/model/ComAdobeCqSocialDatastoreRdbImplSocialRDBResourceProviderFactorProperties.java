package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties   {
  private ConfigNodePropertyString solrZkTimeout;
  private ConfigNodePropertyString solrCommit;
  private ConfigNodePropertyBoolean cacheOn;
  private ConfigNodePropertyInteger concurrencyLevel;
  private ConfigNodePropertyInteger cacheStartSize;
  private ConfigNodePropertyInteger cacheTtl;
  private ConfigNodePropertyInteger cacheSize;

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties solrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.zk.timeout")
  @Valid public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }

  @JsonProperty("solr.zk.timeout")
  public void setSolrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties solrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.commit")
  @Valid public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }

  @JsonProperty("solr.commit")
  public void setSolrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.on")
  @Valid public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  @JsonProperty("cache.on")
  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("concurrency.level")
  @Valid public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  @JsonProperty("concurrency.level")
  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.start.size")
  @Valid public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  @JsonProperty("cache.start.size")
  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.ttl")
  @Valid public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  @JsonProperty("cache.ttl")
  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.size")
  @Valid public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  @JsonProperty("cache.size")
  public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
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
    ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties = (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties) o;
    return Objects.equals(this.solrZkTimeout, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.solrZkTimeout) &&
        Objects.equals(this.solrCommit, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.solrCommit) &&
        Objects.equals(this.cacheOn, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheOn) &&
        Objects.equals(this.concurrencyLevel, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.concurrencyLevel) &&
        Objects.equals(this.cacheStartSize, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheStartSize) &&
        Objects.equals(this.cacheTtl, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheTtl) &&
        Objects.equals(this.cacheSize, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solrZkTimeout, solrCommit, cacheOn, concurrencyLevel, cacheStartSize, cacheTtl, cacheSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
