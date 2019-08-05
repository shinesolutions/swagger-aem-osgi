package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean xmpFilterApplyWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray xmpFilterWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean xmpFilterApplyBlacklist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray xmpFilterBlacklist = null;
 /**
   * Get xmpFilterApplyWhitelist
   * @return xmpFilterApplyWhitelist
  **/
  @JsonProperty("xmp.filter.apply_whitelist")
  public ConfigNodePropertyBoolean getXmpFilterApplyWhitelist() {
    return xmpFilterApplyWhitelist;
  }

  public void setXmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
    return this;
  }

 /**
   * Get xmpFilterWhitelist
   * @return xmpFilterWhitelist
  **/
  @JsonProperty("xmp.filter.whitelist")
  public ConfigNodePropertyArray getXmpFilterWhitelist() {
    return xmpFilterWhitelist;
  }

  public void setXmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
    return this;
  }

 /**
   * Get xmpFilterApplyBlacklist
   * @return xmpFilterApplyBlacklist
  **/
  @JsonProperty("xmp.filter.apply_blacklist")
  public ConfigNodePropertyBoolean getXmpFilterApplyBlacklist() {
    return xmpFilterApplyBlacklist;
  }

  public void setXmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
    return this;
  }

 /**
   * Get xmpFilterBlacklist
   * @return xmpFilterBlacklist
  **/
  @JsonProperty("xmp.filter.blacklist")
  public ConfigNodePropertyArray getXmpFilterBlacklist() {
    return xmpFilterBlacklist;
  }

  public void setXmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {\n");
    
    sb.append("    xmpFilterApplyWhitelist: ").append(toIndentedString(xmpFilterApplyWhitelist)).append("\n");
    sb.append("    xmpFilterWhitelist: ").append(toIndentedString(xmpFilterWhitelist)).append("\n");
    sb.append("    xmpFilterApplyBlacklist: ").append(toIndentedString(xmpFilterApplyBlacklist)).append("\n");
    sb.append("    xmpFilterBlacklist: ").append(toIndentedString(xmpFilterBlacklist)).append("\n");
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

