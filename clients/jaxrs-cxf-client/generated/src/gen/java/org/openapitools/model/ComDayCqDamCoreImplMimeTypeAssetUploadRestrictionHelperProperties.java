package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean cqDamAllowAllMime;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray cqDamAllowedAssetMimes;
 /**
   * Get cqDamAllowAllMime
   * @return cqDamAllowAllMime
  **/
  @JsonProperty("cq.dam.allow.all.mime")
  public ConfigNodePropertyBoolean getCqDamAllowAllMime() {
    return cqDamAllowAllMime;
  }

  public void setCqDamAllowAllMime(ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
  }

  public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties cqDamAllowAllMime(ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
    return this;
  }

 /**
   * Get cqDamAllowedAssetMimes
   * @return cqDamAllowedAssetMimes
  **/
  @JsonProperty("cq.dam.allowed.asset.mimes")
  public ConfigNodePropertyArray getCqDamAllowedAssetMimes() {
    return cqDamAllowedAssetMimes;
  }

  public void setCqDamAllowedAssetMimes(ConfigNodePropertyArray cqDamAllowedAssetMimes) {
    this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
  }

  public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties cqDamAllowedAssetMimes(ConfigNodePropertyArray cqDamAllowedAssetMimes) {
    this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
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
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties = (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties) o;
    return Objects.equals(this.cqDamAllowAllMime, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowAllMime) &&
        Objects.equals(this.cqDamAllowedAssetMimes, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowedAssetMimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamAllowAllMime, cqDamAllowedAssetMimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {\n");
    
    sb.append("    cqDamAllowAllMime: ").append(toIndentedString(cqDamAllowAllMime)).append("\n");
    sb.append("    cqDamAllowedAssetMimes: ").append(toIndentedString(cqDamAllowedAssetMimes)).append("\n");
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

