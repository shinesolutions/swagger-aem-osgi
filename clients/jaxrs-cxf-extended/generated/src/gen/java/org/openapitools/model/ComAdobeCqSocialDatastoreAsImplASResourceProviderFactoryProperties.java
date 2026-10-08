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


public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString versionId;

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

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeLimit;
 /**
  * Get versionId
  * @return versionId
  */
  @JsonProperty("version.id")
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }

  /**
   * Sets the <code>versionId</code> property.
   */
 public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
  }

  /**
   * Sets the <code>versionId</code> property.
   */
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties versionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
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
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

 /**
  * Get timeLimit
  * @return timeLimit
  */
  @JsonProperty("time.limit")
  public ConfigNodePropertyInteger getTimeLimit() {
    return timeLimit;
  }

  /**
   * Sets the <code>timeLimit</code> property.
   */
 public void setTimeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
  }

  /**
   * Sets the <code>timeLimit</code> property.
   */
  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties timeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
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
    ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties) o;
    return Objects.equals(this.versionId, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.versionId) &&
        Objects.equals(this.cacheOn, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheOn) &&
        Objects.equals(this.concurrencyLevel, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.concurrencyLevel) &&
        Objects.equals(this.cacheStartSize, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheStartSize) &&
        Objects.equals(this.cacheTtl, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheTtl) &&
        Objects.equals(this.cacheSize, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.cacheSize) &&
        Objects.equals(this.timeLimit, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.timeLimit);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

