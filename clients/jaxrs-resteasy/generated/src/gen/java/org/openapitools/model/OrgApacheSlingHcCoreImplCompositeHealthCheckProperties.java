package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties   {
  
  private ConfigNodePropertyString hcName;
  private ConfigNodePropertyArray hcTags;
  private ConfigNodePropertyString hcMbeanName;
  private ConfigNodePropertyArray filterTags;
  private ConfigNodePropertyBoolean filterCombineTagsWithOr;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.name")
  @Valid
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  @Valid
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.mbean.name")
  @Valid
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.tags")
  @Valid
  public ConfigNodePropertyArray getFilterTags() {
    return filterTags;
  }
  public void setFilterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.combineTagsWithOr")
  @Valid
  public ConfigNodePropertyBoolean getFilterCombineTagsWithOr() {
    return filterCombineTagsWithOr;
  }
  public void setFilterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

