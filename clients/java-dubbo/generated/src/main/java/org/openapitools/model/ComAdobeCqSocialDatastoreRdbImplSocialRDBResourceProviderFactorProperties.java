package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

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
   * 
   * @return solrZkTimeout
   */
  public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }

  public void setSolrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

  /**
   * 
   * @return solrCommit
   */
  public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }

  public void setSolrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

  /**
   * 
   * @return cacheOn
   */
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  /**
   * 
   * @return concurrencyLevel
   */
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  /**
   * 
   * @return cacheStartSize
   */
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  /**
   * 
   * @return cacheTtl
   */
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  /**
   * 
   * @return cacheSize
   */
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
