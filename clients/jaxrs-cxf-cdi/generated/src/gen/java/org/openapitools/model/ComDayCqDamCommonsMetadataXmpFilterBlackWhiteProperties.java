package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties   {
  
  private ConfigNodePropertyBoolean xmpFilterApplyWhitelist = null;

  private ConfigNodePropertyArray xmpFilterWhitelist = null;

  private ConfigNodePropertyBoolean xmpFilterApplyBlacklist = null;

  private ConfigNodePropertyArray xmpFilterBlacklist = null;


  /**
   **/
  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmp.filter.apply_whitelist")
  public ConfigNodePropertyBoolean getXmpFilterApplyWhitelist() {
    return xmpFilterApplyWhitelist;
  }
  public void setXmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
  }


  /**
   **/
  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmp.filter.whitelist")
  public ConfigNodePropertyArray getXmpFilterWhitelist() {
    return xmpFilterWhitelist;
  }
  public void setXmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
  }


  /**
   **/
  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmp.filter.apply_blacklist")
  public ConfigNodePropertyBoolean getXmpFilterApplyBlacklist() {
    return xmpFilterApplyBlacklist;
  }
  public void setXmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
  }


  /**
   **/
  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmp.filter.blacklist")
  public ConfigNodePropertyArray getXmpFilterBlacklist() {
    return xmpFilterBlacklist;
  }
  public void setXmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties = (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties) o;
    return Objects.equals(xmpFilterApplyWhitelist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterApplyWhitelist) &&
        Objects.equals(xmpFilterWhitelist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterWhitelist) &&
        Objects.equals(xmpFilterApplyBlacklist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterApplyBlacklist) &&
        Objects.equals(xmpFilterBlacklist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmpFilterApplyWhitelist, xmpFilterWhitelist, xmpFilterApplyBlacklist, xmpFilterBlacklist);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

