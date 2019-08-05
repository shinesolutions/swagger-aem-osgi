package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties   {
  @JsonProperty("hc.name")
  private ConfigNodePropertyString hcName = null;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName = null;

  @JsonProperty("filter.tags")
  private ConfigNodePropertyArray filterTags = null;

  @JsonProperty("filter.combineTagsWithOr")
  private ConfigNodePropertyBoolean filterCombineTagsWithOr = null;

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

   /**
   * Get hcName
   * @return hcName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

   /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
    return this;
  }

   /**
   * Get filterTags
   * @return filterTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFilterTags() {
    return filterTags;
  }

  public void setFilterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
    return this;
  }

   /**
   * Get filterCombineTagsWithOr
   * @return filterCombineTagsWithOr
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getFilterCombineTagsWithOr() {
    return filterCombineTagsWithOr;
  }

  public void setFilterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplCompositeHealthCheckProperties orgApacheSlingHcCoreImplCompositeHealthCheckProperties = (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties) o;
    return Objects.equals(this.hcName, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.hcMbeanName) &&
        Objects.equals(this.filterTags, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.filterTags) &&
        Objects.equals(this.filterCombineTagsWithOr, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.filterCombineTagsWithOr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, filterTags, filterCombineTagsWithOr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    filterTags: ").append(toIndentedString(filterTags)).append("\n");
    sb.append("    filterCombineTagsWithOr: ").append(toIndentedString(filterCombineTagsWithOr)).append("\n");
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

