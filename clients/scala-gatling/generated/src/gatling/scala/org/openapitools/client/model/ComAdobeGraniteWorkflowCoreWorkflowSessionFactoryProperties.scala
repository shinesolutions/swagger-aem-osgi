
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties (
    _graniteWorkflowinboxSortPropertyName: Option[ConfigNodePropertyDropDown],
    _graniteWorkflowinboxSortOrder: Option[ConfigNodePropertyString],
    _cqWorkflowJobRetry: Option[ConfigNodePropertyInteger],
    _cqWorkflowSuperuser: Option[ConfigNodePropertyArray],
    _graniteWorkflowInboxQuerySize: Option[ConfigNodePropertyInteger],
    _graniteWorkflowAdminUserGroupFilter: Option[ConfigNodePropertyBoolean],
    _graniteWorkflowEnforceWorkitemAssigneePermissions: Option[ConfigNodePropertyBoolean],
    _graniteWorkflowEnforceWorkflowInitiatorPermissions: Option[ConfigNodePropertyBoolean],
    _graniteWorkflowInjectTenantIdInJobTopics: Option[ConfigNodePropertyBoolean],
    _graniteWorkflowMaxPurgeSaveThreshold: Option[ConfigNodePropertyInteger],
    _graniteWorkflowMaxPurgeQueryCount: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {
    def toStringBody(var_graniteWorkflowinboxSortPropertyName: Object, var_graniteWorkflowinboxSortOrder: Object, var_cqWorkflowJobRetry: Object, var_cqWorkflowSuperuser: Object, var_graniteWorkflowInboxQuerySize: Object, var_graniteWorkflowAdminUserGroupFilter: Object, var_graniteWorkflowEnforceWorkitemAssigneePermissions: Object, var_graniteWorkflowEnforceWorkflowInitiatorPermissions: Object, var_graniteWorkflowInjectTenantIdInJobTopics: Object, var_graniteWorkflowMaxPurgeSaveThreshold: Object, var_graniteWorkflowMaxPurgeQueryCount: Object) =
        s"""
        | {
        | "graniteWorkflowinboxSortPropertyName":$var_graniteWorkflowinboxSortPropertyName,"graniteWorkflowinboxSortOrder":$var_graniteWorkflowinboxSortOrder,"cqWorkflowJobRetry":$var_cqWorkflowJobRetry,"cqWorkflowSuperuser":$var_cqWorkflowSuperuser,"graniteWorkflowInboxQuerySize":$var_graniteWorkflowInboxQuerySize,"graniteWorkflowAdminUserGroupFilter":$var_graniteWorkflowAdminUserGroupFilter,"graniteWorkflowEnforceWorkitemAssigneePermissions":$var_graniteWorkflowEnforceWorkitemAssigneePermissions,"graniteWorkflowEnforceWorkflowInitiatorPermissions":$var_graniteWorkflowEnforceWorkflowInitiatorPermissions,"graniteWorkflowInjectTenantIdInJobTopics":$var_graniteWorkflowInjectTenantIdInJobTopics,"graniteWorkflowMaxPurgeSaveThreshold":$var_graniteWorkflowMaxPurgeSaveThreshold,"graniteWorkflowMaxPurgeQueryCount":$var_graniteWorkflowMaxPurgeQueryCount
        | }
        """.stripMargin
}
