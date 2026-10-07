package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties   {
  @JsonProperty("group.listing.pagination.enable")
  @Valid

  private ConfigNodePropertyBoolean groupListingPaginationEnable;

  @JsonProperty("group.listing.lazyloading.enable")
  @Valid

  private ConfigNodePropertyBoolean groupListingLazyloadingEnable;

  @JsonProperty("page.size")
  @Valid

  private ConfigNodePropertyInteger pageSize;

  @JsonProperty("priority")
  @Valid

  private ConfigNodePropertyInteger priority;

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
    return this;
  }

   /**
   * Get groupListingPaginationEnable
   * @return groupListingPaginationEnable
  **/
  public ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
    return groupListingPaginationEnable;
  }

  public void setGroupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
    this.groupListingPaginationEnable = groupListingPaginationEnable;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties groupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
    return this;
  }

   /**
   * Get groupListingLazyloadingEnable
   * @return groupListingLazyloadingEnable
  **/
  public ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
    return groupListingLazyloadingEnable;
  }

  public void setGroupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
    this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties pageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public ConfigNodePropertyInteger getPageSize() {
    return pageSize;
  }

  public void setPageSize(ConfigNodePropertyInteger pageSize) {
    this.pageSize = pageSize;
  }

  public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
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
    return Objects.equals(groupListingPaginationEnable, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.groupListingPaginationEnable) &&
        Objects.equals(groupListingLazyloadingEnable, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.groupListingLazyloadingEnable) &&
        Objects.equals(pageSize, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.pageSize) &&
        Objects.equals(priority, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupListingPaginationEnable, groupListingLazyloadingEnable, pageSize, priority);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

