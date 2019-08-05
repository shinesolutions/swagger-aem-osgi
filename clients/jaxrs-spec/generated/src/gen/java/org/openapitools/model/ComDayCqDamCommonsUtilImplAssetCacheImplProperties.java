package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties   {
  
  private @Valid ConfigNodePropertyInteger largeFileMin = null;
  private @Valid ConfigNodePropertyBoolean cacheApply = null;
  private @Valid ConfigNodePropertyArray mimeTypes = null;

  /**
   **/
  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties largeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("large.file.min")
  public ConfigNodePropertyInteger getLargeFileMin() {
    return largeFileMin;
  }
  public void setLargeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
  }

  /**
   **/
  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties cacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.apply")
  public ConfigNodePropertyBoolean getCacheApply() {
    return cacheApply;
  }
  public void setCacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
  }

  /**
   **/
  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mime.types")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }
  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties comDayCqDamCommonsUtilImplAssetCacheImplProperties = (ComDayCqDamCommonsUtilImplAssetCacheImplProperties) o;
    return Objects.equals(largeFileMin, comDayCqDamCommonsUtilImplAssetCacheImplProperties.largeFileMin) &&
        Objects.equals(cacheApply, comDayCqDamCommonsUtilImplAssetCacheImplProperties.cacheApply) &&
        Objects.equals(mimeTypes, comDayCqDamCommonsUtilImplAssetCacheImplProperties.mimeTypes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

