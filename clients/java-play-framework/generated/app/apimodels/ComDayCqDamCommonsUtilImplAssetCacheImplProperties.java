package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCommonsUtilImplAssetCacheImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties   {
  @JsonProperty("large.file.min")
  private ConfigNodePropertyInteger largeFileMin = null;

  @JsonProperty("cache.apply")
  private ConfigNodePropertyBoolean cacheApply = null;

  @JsonProperty("mime.types")
  private ConfigNodePropertyArray mimeTypes = null;

  public ComDayCqDamCommonsUtilImplAssetCacheImplProperties largeFileMin(ConfigNodePropertyInteger largeFileMin) {
    this.largeFileMin = largeFileMin;
    return this;
  }

   /**
   * Get largeFileMin
   * @return largeFileMin
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

