package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties   {
  @JsonProperty("cq.dam.allow.all.mime")
  private ConfigNodePropertyBoolean cqDamAllowAllMime = null;

  @JsonProperty("cq.dam.allowed.asset.mimes")
  private ConfigNodePropertyArray cqDamAllowedAssetMimes = null;

  public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties cqDamAllowAllMime(ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
    return this;
  }

  /**
   * Get cqDamAllowAllMime
   * @return cqDamAllowAllMime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCqDamAllowAllMime() {
    return cqDamAllowAllMime;
  }

  public void setCqDamAllowAllMime(ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
  }

  public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties cqDamAllowedAssetMimes(ConfigNodePropertyArray cqDamAllowedAssetMimes) {
    this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
    return this;
  }

  /**
   * Get cqDamAllowedAssetMimes
   * @return cqDamAllowedAssetMimes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getCqDamAllowedAssetMimes() {
    return cqDamAllowedAssetMimes;
  }

  public void setCqDamAllowedAssetMimes(ConfigNodePropertyArray cqDamAllowedAssetMimes) {
    this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

