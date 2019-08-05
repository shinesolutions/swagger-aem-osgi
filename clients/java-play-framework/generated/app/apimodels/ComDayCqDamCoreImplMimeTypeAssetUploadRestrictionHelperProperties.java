package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    return Objects.equals(cqDamAllowAllMime, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowAllMime) &&
        Objects.equals(cqDamAllowedAssetMimes, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowedAssetMimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamAllowAllMime, cqDamAllowedAssetMimes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

