package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties   {
  
  private ConfigNodePropertyString solrZkTimeout = null;
  private ConfigNodePropertyString solrCommit = null;
  private ConfigNodePropertyBoolean cacheOn = null;
  private ConfigNodePropertyInteger concurrencyLevel = null;
  private ConfigNodePropertyInteger cacheStartSize = null;
  private ConfigNodePropertyInteger cacheTtl = null;
  private ConfigNodePropertyInteger cacheSize = null;

  /**
   **/
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
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
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrCommit(ConfigNodePropertyString solrCommit) {
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
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
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
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
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
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
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
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
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
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties = (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties) o;
    return Objects.equals(solrZkTimeout, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.solrZkTimeout) &&
        Objects.equals(solrCommit, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.solrCommit) &&
        Objects.equals(cacheOn, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheOn) &&
        Objects.equals(concurrencyLevel, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.concurrencyLevel) &&
        Objects.equals(cacheStartSize, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheStartSize) &&
        Objects.equals(cacheTtl, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheTtl) &&
        Objects.equals(cacheSize, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.cacheSize);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

