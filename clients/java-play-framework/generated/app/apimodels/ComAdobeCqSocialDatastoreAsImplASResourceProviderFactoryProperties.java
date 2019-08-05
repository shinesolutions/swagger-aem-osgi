package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties   {
  @JsonProperty("version.id")
  private ConfigNodePropertyString versionId = null;

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

  @JsonProperty("time.limit")
  private ConfigNodePropertyInteger timeLimit = null;

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties versionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @Valid
  public ConfigNodePropertyString getVersionId() {
    return versionId;
  }

  public void setVersionId(ConfigNodePropertyString versionId) {
    this.versionId = versionId;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
    return this;
  }

   /**
   * Get cacheOn
   * @return cacheOn
  **/
  @Valid
  public ConfigNodePropertyBoolean getCacheOn() {
    return cacheOn;
  }

  public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
    this.cacheOn = cacheOn;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties concurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
    return this;
  }

   /**
   * Get concurrencyLevel
   * @return concurrencyLevel
  **/
  @Valid
  public ConfigNodePropertyInteger getConcurrencyLevel() {
    return concurrencyLevel;
  }

  public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
    this.concurrencyLevel = concurrencyLevel;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
    return this;
  }

   /**
   * Get cacheStartSize
   * @return cacheStartSize
  **/
  @Valid
  public ConfigNodePropertyInteger getCacheStartSize() {
    return cacheStartSize;
  }

  public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
    this.cacheStartSize = cacheStartSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

   /**
   * Get cacheTtl
   * @return cacheTtl
  **/
  @Valid
  public ConfigNodePropertyInteger getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
    this.cacheTtl = cacheTtl;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties cacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

   /**
   * Get cacheSize
   * @return cacheSize
  **/
  @Valid
  public ConfigNodePropertyInteger getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
    this.cacheSize = cacheSize;
  }

  public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties timeLimit(ConfigNodePropertyInteger timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

   /**
   * Get timeLimit
   * @return timeLimit
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

