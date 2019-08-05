package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString hcName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray hcTags = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString hcMbeanName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray filterTags = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean filterCombineTagsWithOr = null;
 /**
   * Get hcName
   * @return hcName
  **/
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

 /**
   * Get filterTags
   * @return filterTags
  **/
  @JsonProperty("filter.tags")
  public ConfigNodePropertyArray getFilterTags() {
    return filterTags;
  }

  public void setFilterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
    return this;
  }

 /**
   * Get filterCombineTagsWithOr
   * @return filterCombineTagsWithOr
  **/
  @JsonProperty("filter.combineTagsWithOr")
  public ConfigNodePropertyBoolean getFilterCombineTagsWithOr() {
    return filterCombineTagsWithOr;
  }

  public void setFilterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

