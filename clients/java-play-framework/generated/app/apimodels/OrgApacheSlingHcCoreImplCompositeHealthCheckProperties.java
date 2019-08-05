package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

