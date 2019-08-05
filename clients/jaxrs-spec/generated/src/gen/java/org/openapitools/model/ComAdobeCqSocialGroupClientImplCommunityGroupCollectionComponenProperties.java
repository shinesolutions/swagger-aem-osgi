package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties   {
  
  private @Valid ConfigNodePropertyBoolean groupListingPaginationEnable = null;
  private @Valid ConfigNodePropertyBoolean groupListingLazyloadingEnable = null;
  private @Valid ConfigNodePropertyInteger pageSize = null;
  private @Valid ConfigNodePropertyInteger priority = null;

  /**
   **/
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.listing.pagination.enable")
  public ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
    return groupListingPaginationEnable;
  }
  public void setGroupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
  }

  /**
   **/
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.listing.lazyloading.enable")
  public ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
    return groupListingLazyloadingEnable;
  }
  public void setGroupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
  }

  /**
   **/
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties pageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("page.size")
  public ConfigNodePropertyInteger getPageSize() {
    return pageSize;
  }
  public void setPageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }
  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties = (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties) o;
    return Objects.equals(groupListingPaginationEnable, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.groupListingPaginationEnable) &&
        Objects.equals(groupListingLazyloadingEnable, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.groupListingLazyloadingEnable) &&
        Objects.equals(pageSize, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.pageSize) &&
        Objects.equals(priority, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.priority);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

