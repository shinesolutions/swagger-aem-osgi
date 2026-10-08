package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean groupListingPaginationEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean groupListingLazyloadingEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger pageSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger priority;
 /**
  * Get groupListingPaginationEnable
  * @return groupListingPaginationEnable
  */
  @JsonProperty("group.listing.pagination.enable")
  public ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
    return groupListingPaginationEnable;
  }

  /**
   * Sets the <code>groupListingPaginationEnable</code> property.
   */
 public void setGroupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
  }

  /**
   * Sets the <code>groupListingPaginationEnable</code> property.
   */
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
    return this;
  }

 /**
  * Get groupListingLazyloadingEnable
  * @return groupListingLazyloadingEnable
  */
  @JsonProperty("group.listing.lazyloading.enable")
  public ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
    return groupListingLazyloadingEnable;
  }

  /**
   * Sets the <code>groupListingLazyloadingEnable</code> property.
   */
 public void setGroupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
  }

  /**
   * Sets the <code>groupListingLazyloadingEnable</code> property.
   */
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
    return this;
  }

 /**
  * Get pageSize
  * @return pageSize
  */
  @JsonProperty("page.size")
  public ConfigNodePropertyInteger getPageSize() {
    return pageSize;
  }

  /**
   * Sets the <code>pageSize</code> property.
   */
 public void setPageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Sets the <code>pageSize</code> property.
   */
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties pageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
    return this;
  }

 /**
  * Get priority
  * @return priority
  */
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
 public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  /**
   * Sets the <code>priority</code> property.
   */
  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

