package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties   {
  @JsonProperty("xmp.filter.apply_whitelist")
  private ConfigNodePropertyBoolean xmpFilterApplyWhitelist;

  @JsonProperty("xmp.filter.whitelist")
  private ConfigNodePropertyArray xmpFilterWhitelist;

  @JsonProperty("xmp.filter.apply_blacklist")
  private ConfigNodePropertyBoolean xmpFilterApplyBlacklist;

  @JsonProperty("xmp.filter.blacklist")
  private ConfigNodePropertyArray xmpFilterBlacklist;

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
    return this;
  }

  /**
   * Get xmpFilterApplyWhitelist
   * @return xmpFilterApplyWhitelist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getXmpFilterApplyWhitelist() {
    return xmpFilterApplyWhitelist;
  }

  public void setXmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
    return this;
  }

  /**
   * Get xmpFilterWhitelist
   * @return xmpFilterWhitelist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getXmpFilterWhitelist() {
    return xmpFilterWhitelist;
  }

  public void setXmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
    return this;
  }

  /**
   * Get xmpFilterApplyBlacklist
   * @return xmpFilterApplyBlacklist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getXmpFilterApplyBlacklist() {
    return xmpFilterApplyBlacklist;
  }

  public void setXmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
    return this;
  }

  /**
   * Get xmpFilterBlacklist
   * @return xmpFilterBlacklist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getXmpFilterBlacklist() {
    return xmpFilterBlacklist;
  }

  public void setXmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties = (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties) o;
    return Objects.equals(this.xmpFilterApplyWhitelist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterApplyWhitelist) &&
        Objects.equals(this.xmpFilterWhitelist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterWhitelist) &&
        Objects.equals(this.xmpFilterApplyBlacklist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterApplyBlacklist) &&
        Objects.equals(this.xmpFilterBlacklist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterBlacklist);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

