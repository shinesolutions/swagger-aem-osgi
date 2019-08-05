package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties   {
  
  private ConfigNodePropertyString versionId = null;
  private ConfigNodePropertyBoolean cacheOn = null;
  private ConfigNodePropertyInteger concurrencyLevel = null;
  private ConfigNodePropertyInteger cacheStartSize = null;
  private ConfigNodePropertyInteger cacheTtl = null;
  private ConfigNodePropertyInteger cacheSize = null;
  private ConfigNodePropertyInteger timeLimit = null;

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties () {

  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties (ConfigNodePropertyString versionId, ConfigNodePropertyBoolean cacheOn, ConfigNodePropertyInteger concurrencyLevel, ConfigNodePropertyInteger cacheStartSize, ConfigNodePropertyInteger cacheTtl, ConfigNodePropertyInteger cacheSize, ConfigNodePropertyInteger timeLimit) {
    this.versionId = versionId;
    this.cacheOn = cacheOn;
    this.concurrencyLevel = concurrencyLevel;
    this.cacheStartSize = cacheStartSize;
    this.cacheTtl = cacheTtl;
    this.cacheSize = cacheSize;
    this.timeLimit = timeLimit;
  }

    
  @JsonProperty("version.id")
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }
  public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
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

    
  @JsonProperty("time.limit")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
