package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties   {

    private ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName;
    private ConfigNodePropertyString graniteWorkflowinboxSortOrder;
    private ConfigNodePropertyInteger cqWorkflowJobRetry;
    private ConfigNodePropertyArray cqWorkflowSuperuser;
    private ConfigNodePropertyInteger graniteWorkflowInboxQuerySize;
    private ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter;
    private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions;
    private ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions;
    private ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics;
    private ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold;
    private ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
     *
     * @param graniteWorkflowinboxSortPropertyName graniteWorkflowinboxSortPropertyName
     * @param graniteWorkflowinboxSortOrder graniteWorkflowinboxSortOrder
     * @param cqWorkflowJobRetry cqWorkflowJobRetry
     * @param cqWorkflowSuperuser cqWorkflowSuperuser
     * @param graniteWorkflowInboxQuerySize graniteWorkflowInboxQuerySize
     * @param graniteWorkflowAdminUserGroupFilter graniteWorkflowAdminUserGroupFilter
     * @param graniteWorkflowEnforceWorkitemAssigneePermissions graniteWorkflowEnforceWorkitemAssigneePermissions
     * @param graniteWorkflowEnforceWorkflowInitiatorPermissions graniteWorkflowEnforceWorkflowInitiatorPermissions
     * @param graniteWorkflowInjectTenantIdInJobTopics graniteWorkflowInjectTenantIdInJobTopics
     * @param graniteWorkflowMaxPurgeSaveThreshold graniteWorkflowMaxPurgeSaveThreshold
     * @param graniteWorkflowMaxPurgeQueryCount graniteWorkflowMaxPurgeQueryCount
     */
    public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(
        ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName, 
        ConfigNodePropertyString graniteWorkflowinboxSortOrder, 
        ConfigNodePropertyInteger cqWorkflowJobRetry, 
        ConfigNodePropertyArray cqWorkflowSuperuser, 
        ConfigNodePropertyInteger graniteWorkflowInboxQuerySize, 
        ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter, 
        ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions, 
        ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions, 
        ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics, 
        ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold, 
        ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount
    ) {
        this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
        this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
        this.cqWorkflowJobRetry = cqWorkflowJobRetry;
        this.cqWorkflowSuperuser = cqWorkflowSuperuser;
        this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
        this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
        this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
        this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
        this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
        this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
        this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
    }



    /**
     * Get graniteWorkflowinboxSortPropertyName
     * @return graniteWorkflowinboxSortPropertyName
     */
    public ConfigNodePropertyDropDown getGraniteWorkflowinboxSortPropertyName() {
        return graniteWorkflowinboxSortPropertyName;
    }

    public void setGraniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName) {
        this.graniteWorkflowinboxSortPropertyName = graniteWorkflowinboxSortPropertyName;
    }

    /**
     * Get graniteWorkflowinboxSortOrder
     * @return graniteWorkflowinboxSortOrder
     */
    public ConfigNodePropertyString getGraniteWorkflowinboxSortOrder() {
        return graniteWorkflowinboxSortOrder;
    }

    public void setGraniteWorkflowinboxSortOrder(ConfigNodePropertyString graniteWorkflowinboxSortOrder) {
        this.graniteWorkflowinboxSortOrder = graniteWorkflowinboxSortOrder;
    }

    /**
     * Get cqWorkflowJobRetry
     * @return cqWorkflowJobRetry
     */
    public ConfigNodePropertyInteger getCqWorkflowJobRetry() {
        return cqWorkflowJobRetry;
    }

    public void setCqWorkflowJobRetry(ConfigNodePropertyInteger cqWorkflowJobRetry) {
        this.cqWorkflowJobRetry = cqWorkflowJobRetry;
    }

    /**
     * Get cqWorkflowSuperuser
     * @return cqWorkflowSuperuser
     */
    public ConfigNodePropertyArray getCqWorkflowSuperuser() {
        return cqWorkflowSuperuser;
    }

    public void setCqWorkflowSuperuser(ConfigNodePropertyArray cqWorkflowSuperuser) {
        this.cqWorkflowSuperuser = cqWorkflowSuperuser;
    }

    /**
     * Get graniteWorkflowInboxQuerySize
     * @return graniteWorkflowInboxQuerySize
     */
    public ConfigNodePropertyInteger getGraniteWorkflowInboxQuerySize() {
        return graniteWorkflowInboxQuerySize;
    }

    public void setGraniteWorkflowInboxQuerySize(ConfigNodePropertyInteger graniteWorkflowInboxQuerySize) {
        this.graniteWorkflowInboxQuerySize = graniteWorkflowInboxQuerySize;
    }

    /**
     * Get graniteWorkflowAdminUserGroupFilter
     * @return graniteWorkflowAdminUserGroupFilter
     */
    public ConfigNodePropertyBoolean getGraniteWorkflowAdminUserGroupFilter() {
        return graniteWorkflowAdminUserGroupFilter;
    }

    public void setGraniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter) {
        this.graniteWorkflowAdminUserGroupFilter = graniteWorkflowAdminUserGroupFilter;
    }

    /**
     * Get graniteWorkflowEnforceWorkitemAssigneePermissions
     * @return graniteWorkflowEnforceWorkitemAssigneePermissions
     */
    public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkitemAssigneePermissions() {
        return graniteWorkflowEnforceWorkitemAssigneePermissions;
    }

    public void setGraniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions) {
        this.graniteWorkflowEnforceWorkitemAssigneePermissions = graniteWorkflowEnforceWorkitemAssigneePermissions;
    }

    /**
     * Get graniteWorkflowEnforceWorkflowInitiatorPermissions
     * @return graniteWorkflowEnforceWorkflowInitiatorPermissions
     */
    public ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkflowInitiatorPermissions() {
        return graniteWorkflowEnforceWorkflowInitiatorPermissions;
    }

    public void setGraniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions) {
        this.graniteWorkflowEnforceWorkflowInitiatorPermissions = graniteWorkflowEnforceWorkflowInitiatorPermissions;
    }

    /**
     * Get graniteWorkflowInjectTenantIdInJobTopics
     * @return graniteWorkflowInjectTenantIdInJobTopics
     */
    public ConfigNodePropertyBoolean getGraniteWorkflowInjectTenantIdInJobTopics() {
        return graniteWorkflowInjectTenantIdInJobTopics;
    }

    public void setGraniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics) {
        this.graniteWorkflowInjectTenantIdInJobTopics = graniteWorkflowInjectTenantIdInJobTopics;
    }

    /**
     * Get graniteWorkflowMaxPurgeSaveThreshold
     * @return graniteWorkflowMaxPurgeSaveThreshold
     */
    public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeSaveThreshold() {
        return graniteWorkflowMaxPurgeSaveThreshold;
    }

    public void setGraniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold) {
        this.graniteWorkflowMaxPurgeSaveThreshold = graniteWorkflowMaxPurgeSaveThreshold;
    }

    /**
     * Get graniteWorkflowMaxPurgeQueryCount
     * @return graniteWorkflowMaxPurgeQueryCount
     */
    public ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeQueryCount() {
        return graniteWorkflowMaxPurgeQueryCount;
    }

    public void setGraniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount) {
        this.graniteWorkflowMaxPurgeQueryCount = graniteWorkflowMaxPurgeQueryCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {\n");
        
        sb.append("    graniteWorkflowinboxSortPropertyName: ").append(toIndentedString(graniteWorkflowinboxSortPropertyName)).append("\n");
        sb.append("    graniteWorkflowinboxSortOrder: ").append(toIndentedString(graniteWorkflowinboxSortOrder)).append("\n");
        sb.append("    cqWorkflowJobRetry: ").append(toIndentedString(cqWorkflowJobRetry)).append("\n");
        sb.append("    cqWorkflowSuperuser: ").append(toIndentedString(cqWorkflowSuperuser)).append("\n");
        sb.append("    graniteWorkflowInboxQuerySize: ").append(toIndentedString(graniteWorkflowInboxQuerySize)).append("\n");
        sb.append("    graniteWorkflowAdminUserGroupFilter: ").append(toIndentedString(graniteWorkflowAdminUserGroupFilter)).append("\n");
        sb.append("    graniteWorkflowEnforceWorkitemAssigneePermissions: ").append(toIndentedString(graniteWorkflowEnforceWorkitemAssigneePermissions)).append("\n");
        sb.append("    graniteWorkflowEnforceWorkflowInitiatorPermissions: ").append(toIndentedString(graniteWorkflowEnforceWorkflowInitiatorPermissions)).append("\n");
        sb.append("    graniteWorkflowInjectTenantIdInJobTopics: ").append(toIndentedString(graniteWorkflowInjectTenantIdInJobTopics)).append("\n");
        sb.append("    graniteWorkflowMaxPurgeSaveThreshold: ").append(toIndentedString(graniteWorkflowMaxPurgeSaveThreshold)).append("\n");
        sb.append("    graniteWorkflowMaxPurgeQueryCount: ").append(toIndentedString(graniteWorkflowMaxPurgeQueryCount)).append("\n");
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

