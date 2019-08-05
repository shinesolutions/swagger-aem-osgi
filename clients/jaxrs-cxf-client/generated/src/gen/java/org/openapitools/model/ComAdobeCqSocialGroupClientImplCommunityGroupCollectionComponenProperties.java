package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean groupListingPaginationEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean groupListingLazyloadingEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger pageSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger priority = null;
 /**
   * Get groupListingPaginationEnable
   * @return groupListingPaginationEnable
  **/
  @JsonProperty("group.listing.pagination.enable")
  public ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
    return groupListingPaginationEnable;
  }

  public void setGroupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
    return this;
  }

 /**
   * Get groupListingLazyloadingEnable
   * @return groupListingLazyloadingEnable
  **/
  @JsonProperty("group.listing.lazyloading.enable")
  public ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
    return groupListingLazyloadingEnable;
  }

  public void setGroupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
    return this;
  }

 /**
   * Get pageSize
   * @return pageSize
  **/
  @JsonProperty("page.size")
  public ConfigNodePropertyInteger getPageSize() {
    return pageSize;
  }

  public void setPageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties pageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
    return this;
  }

 /**
   * Get priority
   * @return priority
  **/
  @JsonProperty("priority")
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

