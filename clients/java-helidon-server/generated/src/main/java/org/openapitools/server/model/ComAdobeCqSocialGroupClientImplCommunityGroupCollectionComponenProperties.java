package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties   {

    private ConfigNodePropertyBoolean groupListingPaginationEnable;
    private ConfigNodePropertyBoolean groupListingLazyloadingEnable;
    private ConfigNodePropertyInteger pageSize;
    private ConfigNodePropertyInteger priority;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
     *
     * @param groupListingPaginationEnable groupListingPaginationEnable
     * @param groupListingLazyloadingEnable groupListingLazyloadingEnable
     * @param pageSize pageSize
     * @param priority priority
     */
    public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(
        ConfigNodePropertyBoolean groupListingPaginationEnable, 
        ConfigNodePropertyBoolean groupListingLazyloadingEnable, 
        ConfigNodePropertyInteger pageSize, 
        ConfigNodePropertyInteger priority
    ) {
        this.groupListingPaginationEnable = groupListingPaginationEnable;
        this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
        this.pageSize = pageSize;
        this.priority = priority;
    }



    /**
     * Get groupListingPaginationEnable
     * @return groupListingPaginationEnable
     */
    public ConfigNodePropertyBoolean getGroupListingPaginationEnable() {
        return groupListingPaginationEnable;
    }

    public void setGroupListingPaginationEnable(ConfigNodePropertyBoolean groupListingPaginationEnable) {
        this.groupListingPaginationEnable = groupListingPaginationEnable;
    }

    /**
     * Get groupListingLazyloadingEnable
     * @return groupListingLazyloadingEnable
     */
    public ConfigNodePropertyBoolean getGroupListingLazyloadingEnable() {
        return groupListingLazyloadingEnable;
    }

    public void setGroupListingLazyloadingEnable(ConfigNodePropertyBoolean groupListingLazyloadingEnable) {
        this.groupListingLazyloadingEnable = groupListingLazyloadingEnable;
    }

    /**
     * Get pageSize
     * @return pageSize
     */
    public ConfigNodePropertyInteger getPageSize() {
        return pageSize;
    }

    public void setPageSize(ConfigNodePropertyInteger pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Get priority
     * @return priority
     */
    public ConfigNodePropertyInteger getPriority() {
        return priority;
    }

    public void setPriority(ConfigNodePropertyInteger priority) {
        this.priority = priority;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

