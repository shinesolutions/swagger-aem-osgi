package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties   {
  
  private ConfigNodePropertyString solrZkTimeout = null;
  private ConfigNodePropertyString solrCommit = null;
  private ConfigNodePropertyBoolean cacheOn = null;
  private ConfigNodePropertyInteger concurrencyLevel = null;
  private ConfigNodePropertyInteger cacheStartSize = null;
  private ConfigNodePropertyInteger cacheTtl = null;
  private ConfigNodePropertyInteger cacheSize = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.size")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

