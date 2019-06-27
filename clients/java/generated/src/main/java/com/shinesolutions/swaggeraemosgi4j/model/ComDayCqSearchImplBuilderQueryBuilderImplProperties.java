/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqSearchImplBuilderQueryBuilderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class ComDayCqSearchImplBuilderQueryBuilderImplProperties {
  public static final String SERIALIZED_NAME_EXCERPT_PROPERTIES = "excerpt.properties";
  @SerializedName(SERIALIZED_NAME_EXCERPT_PROPERTIES)
  private ConfigNodePropertyArray excerptProperties = null;

  public static final String SERIALIZED_NAME_CACHE_MAX_ENTRIES = "cache.max.entries";
  @SerializedName(SERIALIZED_NAME_CACHE_MAX_ENTRIES)
  private ConfigNodePropertyInteger cacheMaxEntries = null;

  public static final String SERIALIZED_NAME_CACHE_ENTRY_LIFETIME = "cache.entry.lifetime";
  @SerializedName(SERIALIZED_NAME_CACHE_ENTRY_LIFETIME)
  private ConfigNodePropertyInteger cacheEntryLifetime = null;

  public static final String SERIALIZED_NAME_XPATH_UNION = "xpath.union";
  @SerializedName(SERIALIZED_NAME_XPATH_UNION)
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

