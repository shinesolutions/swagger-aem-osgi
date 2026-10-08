package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties   {
  @JsonProperty("solr.zk.timeout")
  private ConfigNodePropertyString solrZkTimeout;

  @JsonProperty("solr.commit")
  private ConfigNodePropertyString solrCommit;

  @JsonProperty("cache.on")
  private ConfigNodePropertyBoolean cacheOn;

  @JsonProperty("concurrency.level")
  private ConfigNodePropertyInteger concurrencyLevel;

  @JsonProperty("cache.start.size")
  private ConfigNodePropertyInteger cacheStartSize;

  @JsonProperty("cache.ttl")
  private ConfigNodePropertyInteger cacheTtl;

  @JsonProperty("cache.size")
  private ConfigNodePropertyInteger cacheSize;

  /**
   **/
  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties solrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.zk.timeout")
  public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }
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
  public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }
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
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }
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
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }
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
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }
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
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }
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
  public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }
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
    return Objects.equals(solrZkTimeout, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.solrZkTimeout) &&
        Objects.equals(solrCommit, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.solrCommit) &&
        Objects.equals(cacheOn, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheOn) &&
        Objects.equals(concurrencyLevel, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.concurrencyLevel) &&
        Objects.equals(cacheStartSize, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheStartSize) &&
        Objects.equals(cacheTtl, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheTtl) &&
        Objects.equals(cacheSize, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.cacheSize);
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

