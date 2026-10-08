package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
 */

@JsonTypeName("orgApacheSlingHcCoreImplCompositeHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hcName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hcMbeanName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray filterTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean filterCombineTagsWithOr;

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcName(@Nullable ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  /**
   * Get hcName
   * @return hcName
   */
  @Valid 
  @Schema(name = "hc.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.name")
  public @Nullable ConfigNodePropertyString getHcName() {
    return hcName;
  }

  @JsonProperty("hc.name")
  public void setHcName(@Nullable ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public @Nullable ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  @JsonProperty("hc.tags")
  public void setHcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties hcMbeanName(@Nullable ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

  /**
   * Get hcMbeanName
   * @return hcMbeanName
   */
  @Valid 
  @Schema(name = "hc.mbean.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.mbean.name")
  public @Nullable ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  @JsonProperty("hc.mbean.name")
  public void setHcMbeanName(@Nullable ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterTags(@Nullable ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
    return this;
  }

  /**
   * Get filterTags
   * @return filterTags
   */
  @Valid 
  @Schema(name = "filter.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.tags")
  public @Nullable ConfigNodePropertyArray getFilterTags() {
    return filterTags;
  }

  @JsonProperty("filter.tags")
  public void setFilterTags(@Nullable ConfigNodePropertyArray filterTags) {
    this.filterTags = filterTags;
  }

  public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties filterCombineTagsWithOr(@Nullable ConfigNodePropertyBoolean filterCombineTagsWithOr) {
    this.filterCombineTagsWithOr = filterCombineTagsWithOr;
    return this;
  }

  /**
   * Get filterCombineTagsWithOr
   * @return filterCombineTagsWithOr
   */
  @Valid 
  @Schema(name = "filter.combineTagsWithOr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.combineTagsWithOr")
  public @Nullable ConfigNodePropertyBoolean getFilterCombineTagsWithOr() {
    return filterCombineTagsWithOr;
  }

  @JsonProperty("filter.combineTagsWithOr")
  public void setFilterCombineTagsWithOr(@Nullable ConfigNodePropertyBoolean filterCombineTagsWithOr) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

