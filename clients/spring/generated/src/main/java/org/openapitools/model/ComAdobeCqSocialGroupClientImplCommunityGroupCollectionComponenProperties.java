package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
 */

@JsonTypeName("comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean groupListingPaginationEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean groupListingLazyloadingEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger pageSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingPaginationEnable(@Nullable ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
    return this;
  }

  /**
   * Get groupListingPaginationEnable
   * @return groupListingPaginationEnable
   */
  @Valid 
  @Schema(name = "group.listing.pagination.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.listing.pagination.enable")
  public @Nullable ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
    return groupListingPaginationEnable;
  }

  @JsonProperty("group.listing.pagination.enable")
  public void setGroupListingPaginationEnable(@Nullable ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingLazyloadingEnable(@Nullable ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
    return this;
  }

  /**
   * Get groupListingLazyloadingEnable
   * @return groupListingLazyloadingEnable
   */
  @Valid 
  @Schema(name = "group.listing.lazyloading.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.listing.lazyloading.enable")
  public @Nullable ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
    return groupListingLazyloadingEnable;
  }

  @JsonProperty("group.listing.lazyloading.enable")
  public void setGroupListingLazyloadingEnable(@Nullable ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties pageSize(@Nullable ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @Valid 
  @Schema(name = "page.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page.size")
  public @Nullable ConfigNodePropertyInteger getPageSize() {
    return pageSize;
  }

  @JsonProperty("page.size")
  public void setPageSize(@Nullable ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties priority(@Nullable ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public @Nullable ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  @JsonProperty("priority")
  public void setPriority(@Nullable ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties = (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties) o;
    return Objects.equals(this.groupListingPaginationEnable, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.groupListingPaginationEnable) &&
        Objects.equals(this.groupListingLazyloadingEnable, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.groupListingLazyloadingEnable) &&
        Objects.equals(this.pageSize, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.pageSize) &&
        Objects.equals(this.priority, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupListingPaginationEnable, groupListingLazyloadingEnable, pageSize, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {\n");
    sb.append("    groupListingPaginationEnable: ").append(toIndentedString(groupListingPaginationEnable)).append("\n");
    sb.append("    groupListingLazyloadingEnable: ").append(toIndentedString(groupListingLazyloadingEnable)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

