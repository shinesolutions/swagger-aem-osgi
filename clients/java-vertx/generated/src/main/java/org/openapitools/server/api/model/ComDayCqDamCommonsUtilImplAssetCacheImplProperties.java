package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties   {
  
  private ConfigNodePropertyInteger largeFileMin = null;
  private ConfigNodePropertyBoolean cacheApply = null;
  private ConfigNodePropertyArray mimeTypes = null;

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties () {

  }

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties (ConfigNodePropertyInteger largeFileMin, ConfigNodePropertyBoolean cacheApply, ConfigNodePropertyArray mimeTypes) {
    this.largeFileMin = largeFileMin;
    this.cacheApply = cacheApply;
    this.mimeTypes = mimeTypes;
  }

    
  @JsonProperty("large.file.min")
  public ConfigNodePropertyInteger getLargeFileMin() {
    return largeFileMin;
  }
  public void setLargeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
  }

    
  @JsonProperty("cache.apply")
  public ConfigNodePropertyBoolean getCacheApply() {
    return cacheApply;
  }
  public void setCacheApply(ConfigNodePropertyBoolean cacheApply) {
    this.cacheApply = cacheApply;
  }

    
  @JsonProperty("mime.types")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
