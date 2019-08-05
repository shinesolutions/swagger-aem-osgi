package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqSearchImplBuilderQueryBuilderImplProperties   {
  @JsonProperty("excerpt.properties")
  private ConfigNodePropertyArray excerptProperties = null;

  @JsonProperty("cache.max.entries")
  private ConfigNodePropertyInteger cacheMaxEntries = null;

  @JsonProperty("cache.entry.lifetime")
  private ConfigNodePropertyInteger cacheEntryLifetime = null;

  @JsonProperty("xpath.union")
  private ConfigNodePropertyBoolean xpathUnion = null;

  /**
   **/
  public ComDayCqSearchImplBuilderQueryBuilderImplProperties excerptProperties(ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("excerpt.properties")
  public ConfigNodePropertyArray getExcerptProperties() {
    return excerptProperties;
  }
  public void setExcerptProperties(ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
  }

  /**
   **/
  public ComDayCqSearchImplBuilderQueryBuilderImplProperties cacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.max.entries")
  public ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }
  public void setCacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }

  /**
   **/
  public ComDayCqSearchImplBuilderQueryBuilderImplProperties cacheEntryLifetime(ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.entry.lifetime")
  public ConfigNodePropertyInteger getCacheEntryLifetime() {
    return cacheEntryLifetime;
  }
  public void setCacheEntryLifetime(ConfigNodePropertyInteger cacheEntryLifetime) {
    this.cacheEntryLifetime = cacheEntryLifetime;
  }

  /**
   **/
  public ComDayCqSearchImplBuilderQueryBuilderImplProperties xpathUnion(ConfigNodePropertyBoolean xpathUnion) {
    this.xpathUnion = xpathUnion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xpath.union")
  public ConfigNodePropertyBoolean getXpathUnion() {
    return xpathUnion;
  }
  public void setXpathUnion(ConfigNodePropertyBoolean xpathUnion) {
    this.xpathUnion = xpathUnion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

