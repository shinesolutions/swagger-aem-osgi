package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hcName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hcMbeanName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray filterTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean filterCombineTagsWithOr;
 /**
  * Get hcName
  * @return hcName
  */
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  /**
   * Sets the <code>hcName</code> property.
   */
 public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   * Sets the <code>hcName</code> property.
   */
  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
  * Get hcTags
  * @return hcTags
  */
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
 public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get hcMbeanName
  * @return hcMbeanName
  */
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  /**
   * Sets the <code>hcMbeanName</code> property.
   */
 public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   * Sets the <code>hcMbeanName</code> property.
   */
  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

 /**
  * Get filterTags
  * @return filterTags
  */
  @JsonProperty("filter.tags")
  public ConfigNodePropertyArray getFilterTags() {
    return filterTags;
  }

  /**
   * Sets the <code>filterTags</code> property.
   */
 public void setFilterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
  }

  /**
   * Sets the <code>filterTags</code> property.
   */
  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
    return this;
  }

 /**
  * Get filterCombineTagsWithOr
  * @return filterCombineTagsWithOr
  */
  @JsonProperty("filter.combineTagsWithOr")
  public ConfigNodePropertyBoolean getFilterCombineTagsWithOr() {
    return filterCombineTagsWithOr;
  }

  /**
   * Sets the <code>filterCombineTagsWithOr</code> property.
   */
 public void setFilterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
  }

  /**
   * Sets the <code>filterCombineTagsWithOr</code> property.
   */
  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

