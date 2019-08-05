package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties   {
  
  private ConfigNodePropertyBoolean cqDamAllowAllMime = null;
  private ConfigNodePropertyArray cqDamAllowedAssetMimes = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.allow.all.mime")
  public ConfigNodePropertyBoolean getCqDamAllowAllMime() {
    return cqDamAllowAllMime;
  }
  public void setCqDamAllowAllMime(ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.allowed.asset.mimes")
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
    return Objects.equals(cqDamAllowAllMime, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowAllMime) &&
        Objects.equals(cqDamAllowedAssetMimes, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowedAssetMimes);
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

