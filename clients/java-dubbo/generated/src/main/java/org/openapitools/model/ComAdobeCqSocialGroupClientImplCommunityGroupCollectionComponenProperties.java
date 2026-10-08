package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group.listing.pagination.enable")
  private ConfigNodePropertyBoolean groupListingPaginationEnable;

  @JsonProperty("group.listing.lazyloading.enable")
  private ConfigNodePropertyBoolean groupListingLazyloadingEnable;

  @JsonProperty("page.size")
  private ConfigNodePropertyInteger pageSize;

  @JsonProperty("priority")
  private ConfigNodePropertyInteger priority;

  /**
   * 
   * @return groupListingPaginationEnable
   */
  public ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
    return groupListingPaginationEnable;
  }

  public void setGroupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
  }

  /**
   * 
   * @return groupListingLazyloadingEnable
   */
  public ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
    return groupListingLazyloadingEnable;
  }

  public void setGroupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
  }

  /**
   * 
   * @return pageSize
   */
  public ConfigNodePropertyInteger getPageSize() {
    return pageSize;
  }

  public void setPageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * 
   * @return priority
   */
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
