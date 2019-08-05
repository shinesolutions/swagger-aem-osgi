package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqSearchImplBuilderQueryBuilderImplProperties   {
  
  private ConfigNodePropertyArray excerptProperties = null;
  private ConfigNodePropertyInteger cacheMaxEntries = null;
  private ConfigNodePropertyInteger cacheEntryLifetime = null;
  private ConfigNodePropertyBoolean xpathUnion = null;

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties () {

  }

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties (ConfigNodePropertyArray excerptProperties, ConfigNodePropertyInteger cacheMaxEntries, ConfigNodePropertyInteger cacheEntryLifetime, ConfigNodePropertyBoolean xpathUnion) {
    this.excerptProperties = excerptProperties;
    this.cacheMaxEntries = cacheMaxEntries;
    this.cacheEntryLifetime = cacheEntryLifetime;
    this.xpathUnion = xpathUnion;
  }

    
  @JsonProperty("excerpt.properties")
  public ConfigNodePropertyArray getExcerptProperties() {
    return excerptProperties;
  }
  public void setExcerptProperties(ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
  }

    
  @JsonProperty("cache.max.entries")
  public ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }
  public void setCacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }

    
  @JsonProperty("cache.entry.lifetime")
  public ConfigNodePropertyInteger getCacheEntryLifetime() {
    return cacheEntryLifetime;
  }
  public void setCacheEntryLifetime(ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
  }

    
  @JsonProperty("xpath.union")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
