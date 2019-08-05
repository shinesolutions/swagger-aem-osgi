package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties   {
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

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
    return this;
  }

  /**
   * Get solrZkTimeout
   * @return solrZkTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }

  public void setSolrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
    return this;
  }

  /**
   * Get solrCommit
   * @return solrCommit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }

  public void setSolrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

  /**
   * Get cacheOn
   * @return cacheOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

  /**
   * Get concurrencyLevel
   * @return concurrencyLevel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

  /**
   * Get cacheStartSize
   * @return cacheStartSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

  /**
   * Get cacheTtl
   * @return cacheTtl
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

  /**
   * Get cacheSize
   * @return cacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

