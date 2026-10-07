package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {
    
    ConfigNodePropertyDropDown graniteWorkflowinboxSortPropertyName
    
    ConfigNodePropertyString graniteWorkflowinboxSortOrder
    
    ConfigNodePropertyInteger cqWorkflowJobRetry
    
    ConfigNodePropertyArray cqWorkflowSuperuser
    
    ConfigNodePropertyInteger graniteWorkflowInboxQuerySize
    
    ConfigNodePropertyBoolean graniteWorkflowAdminUserGroupFilter
    
    ConfigNodePropertyBoolean graniteWorkflowEnforceWorkitemAssigneePermissions
    
    ConfigNodePropertyBoolean graniteWorkflowEnforceWorkflowInitiatorPermissions
    
    ConfigNodePropertyBoolean graniteWorkflowInjectTenantIdInJobTopics
    
    ConfigNodePropertyInteger graniteWorkflowMaxPurgeSaveThreshold
    
    ConfigNodePropertyInteger graniteWorkflowMaxPurgeQueryCount
}
