package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties   {
  
  private ConfigNodePropertyString solrZkTimeout = null;
  private ConfigNodePropertyString solrCommit = null;
  private ConfigNodePropertyBoolean cacheOn = null;
  private ConfigNodePropertyInteger concurrencyLevel = null;
  private ConfigNodePropertyInteger cacheStartSize = null;
  private ConfigNodePropertyInteger cacheTtl = null;
  private ConfigNodePropertyInteger cacheSize = null;

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties () {

  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties (ConfigNodePropertyString solrZkTimeout, ConfigNodePropertyString solrCommit, ConfigNodePropertyBoolean cacheOn, ConfigNodePropertyInteger concurrencyLevel, ConfigNodePropertyInteger cacheStartSize, ConfigNodePropertyInteger cacheTtl, ConfigNodePropertyInteger cacheSize) {
    this.solrZkTimeout = solrZkTimeout;
    this.solrCommit = solrCommit;
    this.cacheOn = cacheOn;
    this.concurrencyLevel = concurrencyLevel;
    this.cacheStartSize = cacheStartSize;
    this.cacheTtl = cacheTtl;
    this.cacheSize = cacheSize;
  }

    
  @JsonProperty("solr.zk.timeout")
  public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }
  public void setSolrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

    
  @JsonProperty("solr.commit")
  public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }
  public void setSolrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

    
  @JsonProperty("cache.on")
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }
  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

    
  @JsonProperty("concurrency.level")
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }
  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

    
  @JsonProperty("cache.start.size")
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }
  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

    
  @JsonProperty("cache.ttl")
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }
  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
