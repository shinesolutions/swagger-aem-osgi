package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqSearchImplBuilderQueryBuilderImplProperties   {
  @JsonProperty("excerpt.properties")
  @Valid

  private ConfigNodePropertyArray excerptProperties;

  @JsonProperty("cache.max.entries")
  @Valid

  private ConfigNodePropertyInteger cacheMaxEntries;

  @JsonProperty("cache.entry.lifetime")
  @Valid

  private ConfigNodePropertyInteger cacheEntryLifetime;

  @JsonProperty("xpath.union")
  @Valid

  private ConfigNodePropertyBoolean xpathUnion;

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties excerptProperties(ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
    return this;
  }

   /**
   * Get excerptProperties
   * @return excerptProperties
  **/
  public ConfigNodePropertyArray getExcerptProperties() {
    return excerptProperties;
  }

  public void setExcerptProperties(ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties cacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
    return this;
  }

   /**
   * Get cacheMaxEntries
   * @return cacheMaxEntries
  **/
  public ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }

  public void setCacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties cacheEntryLifetime(ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
    return this;
  }

   /**
   * Get cacheEntryLifetime
   * @return cacheEntryLifetime
  **/
  public ConfigNodePropertyInteger getCacheEntryLifetime() {
    return cacheEntryLifetime;
  }

  public void setCacheEntryLifetime(ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties xpathUnion(ConfigNodePropertyBoolean xpathUnion) {
    this.xpathUnion = xpathUnion;
    return this;
  }

   /**
   * Get xpathUnion
   * @return xpathUnion
  **/
  public ConfigNodePropertyBoolean getXpathUnion() {
    return xpathUnion;
  }

  public void setXpathUnion(ConfigNodePropertyBoolean xpathUnion) {
    this.xpathUnion = xpathUnion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSearchImplBuilderQueryBuilderImplProperties comDayCqSearchImplBuilderQueryBuilderImplProperties = (ComDayCqSearchImplBuilderQueryBuilderImplProperties) o;
    return Objects.equals(excerptProperties, comDayCqSearchImplBuilderQueryBuilderImplProperties.excerptProperties) &&
        Objects.equals(cacheMaxEntries, comDayCqSearchImplBuilderQueryBuilderImplProperties.cacheMaxEntries) &&
        Objects.equals(cacheEntryLifetime, comDayCqSearchImplBuilderQueryBuilderImplProperties.cacheEntryLifetime) &&
        Objects.equals(xpathUnion, comDayCqSearchImplBuilderQueryBuilderImplProperties.xpathUnion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excerptProperties, cacheMaxEntries, cacheEntryLifetime, xpathUnion);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchImplBuilderQueryBuilderImplProperties {\n");
    
    sb.append("    excerptProperties: ").append(toIndentedString(excerptProperties)).append("\n");
    sb.append("    cacheMaxEntries: ").append(toIndentedString(cacheMaxEntries)).append("\n");
    sb.append("    cacheEntryLifetime: ").append(toIndentedString(cacheEntryLifetime)).append("\n");
    sb.append("    xpathUnion: ").append(toIndentedString(xpathUnion)).append("\n");
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

