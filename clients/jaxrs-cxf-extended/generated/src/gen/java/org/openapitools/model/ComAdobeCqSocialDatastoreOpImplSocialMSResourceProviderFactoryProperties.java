package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrZkTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrCommit;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cacheOn;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger concurrencyLevel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cacheStartSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cacheTtl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cacheSize;
 /**
  * Get solrZkTimeout
  * @return solrZkTimeout
  */
  @JsonProperty("solr.zk.timeout")
  public ConfigNodePropertyString getSolrZkTimeout() {
    return solrZkTimeout;
  }

  /**
   * Sets the <code>solrZkTimeout</code> property.
   */
 public void setSolrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
  }

  /**
   * Sets the <code>solrZkTimeout</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrZkTimeout(ConfigNodePropertyString solrZkTimeout) {
    this.solrZkTimeout = solrZkTimeout;
    return this;
  }

 /**
  * Get solrCommit
  * @return solrCommit
  */
  @JsonProperty("solr.commit")
  public ConfigNodePropertyString getSolrCommit() {
    return solrCommit;
  }

  /**
   * Sets the <code>solrCommit</code> property.
   */
 public void setSolrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
  }

  /**
   * Sets the <code>solrCommit</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties solrCommit(ConfigNodePropertyString solrCommit) {
    this.solrCommit = solrCommit;
    return this;
  }

 /**
  * Get cacheOn
  * @return cacheOn
  */
  @JsonProperty("cache.on")
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  /**
   * Sets the <code>cacheOn</code> property.
   */
 public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  /**
   * Sets the <code>cacheOn</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

 /**
  * Get concurrencyLevel
  * @return concurrencyLevel
  */
  @JsonProperty("concurrency.level")
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  /**
   * Sets the <code>concurrencyLevel</code> property.
   */
 public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  /**
   * Sets the <code>concurrencyLevel</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

 /**
  * Get cacheStartSize
  * @return cacheStartSize
  */
  @JsonProperty("cache.start.size")
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  /**
   * Sets the <code>cacheStartSize</code> property.
   */
 public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  /**
   * Sets the <code>cacheStartSize</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

 /**
  * Get cacheTtl
  * @return cacheTtl
  */
  @JsonProperty("cache.ttl")
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  /**
   * Sets the <code>cacheTtl</code> property.
   */
 public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  /**
   * Sets the <code>cacheTtl</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

 /**
  * Get cacheSize
  * @return cacheSize
  */
  @JsonProperty("cache.size")
  public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  /**
   * Sets the <code>cacheSize</code> property.
   */
 public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
  }

  /**
   * Sets the <code>cacheSize</code> property.
   */
  public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

