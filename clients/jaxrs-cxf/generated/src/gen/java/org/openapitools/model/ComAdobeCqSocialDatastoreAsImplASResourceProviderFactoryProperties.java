package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString versionId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cacheOn = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger concurrencyLevel = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cacheStartSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cacheTtl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeLimit = null;
 /**
   * Get versionId
   * @return versionId
  **/
  @JsonProperty("version.id")
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }

  public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties versionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
    return this;
  }

 /**
   * Get cacheOn
   * @return cacheOn
  **/
  @JsonProperty("cache.on")
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

 /**
   * Get concurrencyLevel
   * @return concurrencyLevel
  **/
  @JsonProperty("concurrency.level")
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

 /**
   * Get cacheStartSize
   * @return cacheStartSize
  **/
  @JsonProperty("cache.start.size")
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

 /**
   * Get cacheTtl
   * @return cacheTtl
  **/
  @JsonProperty("cache.ttl")
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

 /**
   * Get cacheSize
   * @return cacheSize
  **/
  @JsonProperty("cache.size")
  public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

 /**
   * Get timeLimit
   * @return timeLimit
  **/
  @JsonProperty("time.limit")
  public ConfigNodePropertyInteger getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties timeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

