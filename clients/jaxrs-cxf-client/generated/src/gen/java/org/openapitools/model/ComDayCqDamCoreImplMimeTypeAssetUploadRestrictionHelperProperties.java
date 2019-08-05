package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqDamAllowAllMime = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cqDamAllowedAssetMimes = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

