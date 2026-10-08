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

public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("version.id")
  private ConfigNodePropertyString versionId;

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

  @JsonProperty("time.limit")
  private ConfigNodePropertyInteger timeLimit;

  /**
   * 
   * @return versionId
   */
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }

  public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
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

  /**
   * 
   * @return timeLimit
   */
  public ConfigNodePropertyInteger getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
