package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger largeFileMin;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean cacheApply;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray mimeTypes;
 /**
   * Get largeFileMin
   * @return largeFileMin
  **/
  @JsonProperty("large.file.min")
  public ConfigNodePropertyInteger getLargeFileMin() {
    return largeFileMin;
  }

  public void setLargeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties largeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
    return this;
  }

 /**
   * Get cacheApply
   * @return cacheApply
  **/
  @JsonProperty("cache.apply")
  public ConfigNodePropertyBoolean getCacheApply() {
    return cacheApply;
  }

  public void setCacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties cacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
    return this;
  }

 /**
   * Get mimeTypes
   * @return mimeTypes
  **/
  @JsonProperty("mime.types")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

