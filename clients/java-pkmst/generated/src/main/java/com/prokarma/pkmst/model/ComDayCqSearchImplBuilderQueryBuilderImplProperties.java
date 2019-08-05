package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqSearchImplBuilderQueryBuilderImplProperties   {
  @JsonProperty("excerpt.properties")
  private ConfigNodePropertyArray excerptProperties = null;

  @JsonProperty("cache.max.entries")
  private ConfigNodePropertyInteger cacheMaxEntries = null;

  @JsonProperty("cache.entry.lifetime")
  private ConfigNodePropertyInteger cacheEntryLifetime = null;

  @JsonProperty("xpath.union")
  private ConfigNodePropertyBoolean xpathUnion = null;

  public ComDayCqSearchImplBuilderQueryBuilderImplProperties excerptProperties(ConfigNodePropertyArray excerptProperties) {
    this.excerptProperties = excerptProperties;
    return this;
  }

   /**
   * Get excerptProperties
   * @return excerptProperties
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.excerptProperties, comDayCqSearchImplBuilderQueryBuilderImplProperties.excerptProperties) &&
        Objects.equals(this.cacheMaxEntries, comDayCqSearchImplBuilderQueryBuilderImplProperties.cacheMaxEntries) &&
        Objects.equals(this.cacheEntryLifetime, comDayCqSearchImplBuilderQueryBuilderImplProperties.cacheEntryLifetime) &&
        Objects.equals(this.xpathUnion, comDayCqSearchImplBuilderQueryBuilderImplProperties.xpathUnion);
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

