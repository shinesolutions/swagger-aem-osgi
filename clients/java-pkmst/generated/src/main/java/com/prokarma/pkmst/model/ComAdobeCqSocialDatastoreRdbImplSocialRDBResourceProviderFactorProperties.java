package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties   {
  @JsonProperty("solr.zk.timeout")
  private ConfigNodePropertyString solrZkTimeout = null;

  @JsonProperty("solr.commit")
  private ConfigNodePropertyString solrCommit = null;

  @JsonProperty("cache.on")
  private ConfigNodePropertyBoolean cacheOn = null;

  @JsonProperty("concurrency.level")
  private ConfigNodePropertyInteger concurrencyLevel = null;

  @JsonProperty("cache.start.size")
  private ConfigNodePropertyInteger cacheStartSize = null;

  @JsonProperty("cache.ttl")
  private ConfigNodePropertyInteger cacheTtl = null;

  @JsonProperty("cache.size")
  private ConfigNodePropertyInteger cacheSize = null;

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties solrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
    return this;
  }

   /**
   * Get solrZkTimeout
   * @return solrZkTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }

  public void setSolrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties solrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
    return this;
  }

   /**
   * Get solrCommit
   * @return solrCommit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }

  public void setSolrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

   /**
   * Get cacheOn
   * @return cacheOn
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

   /**
   * Get concurrencyLevel
   * @return concurrencyLevel
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

   /**
   * Get cacheStartSize
   * @return cacheStartSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

   /**
   * Get cacheTtl
   * @return cacheTtl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

   /**
   * Get cacheSize
   * @return cacheSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

