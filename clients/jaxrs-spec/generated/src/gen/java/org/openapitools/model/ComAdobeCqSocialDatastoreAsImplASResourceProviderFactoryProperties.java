package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties   {
  
  private @Valid ConfigNodePropertyString versionId = null;
  private @Valid ConfigNodePropertyBoolean cacheOn = null;
  private @Valid ConfigNodePropertyInteger concurrencyLevel = null;
  private @Valid ConfigNodePropertyInteger cacheStartSize = null;
  private @Valid ConfigNodePropertyInteger cacheTtl = null;
  private @Valid ConfigNodePropertyInteger cacheSize = null;
  private @Valid ConfigNodePropertyInteger timeLimit = null;

  /**
   **/
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties versionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("version.id")
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }
  public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
  }

  /**
   **/
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
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

  /**
   **/
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties timeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("time.limit")
  public ConfigNodePropertyInteger getTimeLimit() {
    return timeLimit;
  }
  public void setTimeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties) o;
    return Objects.equals(versionId, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.versionId) &&
        Objects.equals(cacheOn, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheOn) &&
        Objects.equals(concurrencyLevel, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.concurrencyLevel) &&
        Objects.equals(cacheStartSize, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheStartSize) &&
        Objects.equals(cacheTtl, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheTtl) &&
        Objects.equals(cacheSize, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheSize) &&
        Objects.equals(timeLimit, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.timeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, cacheOn, concurrencyLevel, cacheStartSize, cacheTtl, cacheSize, timeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {\n");
    
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    cacheOn: ").append(toIndentedString(cacheOn)).append("\n");
    sb.append("    concurrencyLevel: ").append(toIndentedString(concurrencyLevel)).append("\n");
    sb.append("    cacheStartSize: ").append(toIndentedString(cacheStartSize)).append("\n");
    sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
    sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
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

