package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties   {
  
  private ConfigNodePropertyString hcName = null;
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyString hcMbeanName = null;
  private ConfigNodePropertyArray filterTags = null;
  private ConfigNodePropertyBoolean filterCombineTagsWithOr = null;

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties () {

  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties (ConfigNodePropertyString hcName, ConfigNodePropertyArray hcTags, ConfigNodePropertyString hcMbeanName, ConfigNodePropertyArray filterTags, ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.hcName = hcName;
    this.hcTags = hcTags;
    this.hcMbeanName = hcMbeanName;
    this.filterTags = filterTags;
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
  }

    
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

    
  @JsonProperty("filter.tags")
  public ConfigNodePropertyArray getFilterTags() {
    return filterTags;
  }
  public void setFilterTags(ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
  }

    
  @JsonProperty("filter.combineTagsWithOr")
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
    return Objects.equals(hcName, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.hcName) &&
        Objects.equals(hcTags, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.hcTags) &&
        Objects.equals(hcMbeanName, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.hcMbeanName) &&
        Objects.equals(filterTags, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.filterTags) &&
        Objects.equals(filterCombineTagsWithOr, orgApacheSlingHcCoreImplCompositeHealthCheckProperties.filterCombineTagsWithOr);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
