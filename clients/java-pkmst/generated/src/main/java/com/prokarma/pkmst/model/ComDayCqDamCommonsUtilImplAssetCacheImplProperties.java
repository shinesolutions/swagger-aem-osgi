package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamCommonsUtilImplAssetCacheImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties   {
  @JsonProperty("large.file.min")
  private ConfigNodePropertyInteger largeFileMin;

  @JsonProperty("cache.apply")
  private ConfigNodePropertyBoolean cacheApply;

  @JsonProperty("mime.types")
  private ConfigNodePropertyArray mimeTypes;

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties largeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
    return this;
  }

  /**
   * Get largeFileMin
   * @return largeFileMin
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getLargeFileMin() {
    return largeFileMin;
  }

  public void setLargeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties cacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
    return this;
  }

  /**
   * Get cacheApply
   * @return cacheApply
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCacheApply() {
    return cacheApply;
  }

  public void setCacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  /**
   * Get mimeTypes
   * @return mimeTypes
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties comDayCqDamCommonsUtilImplAssetCacheImplProperties = (ComDayCqDamCommonsUtilImplAssetCacheImplProperties) o;
    return Objects.equals(this.largeFileMin, comDayCqDamCommonsUtilImplAssetCacheImplProperties.largeFileMin) &&
        Objects.equals(this.cacheApply, comDayCqDamCommonsUtilImplAssetCacheImplProperties.cacheApply) &&
        Objects.equals(this.mimeTypes, comDayCqDamCommonsUtilImplAssetCacheImplProperties.mimeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeFileMin, cacheApply, mimeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {\n");
    
    sb.append("    largeFileMin: ").append(toIndentedString(largeFileMin)).append("\n");
    sb.append("    cacheApply: ").append(toIndentedString(cacheApply)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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

