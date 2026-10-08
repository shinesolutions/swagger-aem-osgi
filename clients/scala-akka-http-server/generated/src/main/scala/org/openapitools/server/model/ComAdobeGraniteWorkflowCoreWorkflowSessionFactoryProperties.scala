package org.openapitools.server.model


/**
 * @param graniteWorkflowinboxSortPropertyName  for example: ''null''
 * @param graniteWorkflowinboxSortOrder  for example: ''null''
 * @param cqWorkflowJobRetry  for example: ''null''
 * @param cqWorkflowSuperuser  for example: ''null''
 * @param graniteWorkflowInboxQuerySize  for example: ''null''
 * @param graniteWorkflowAdminUserGroupFilter  for example: ''null''
 * @param graniteWorkflowEnforceWorkitemAssigneePermissions  for example: ''null''
 * @param graniteWorkflowEnforceWorkflowInitiatorPermissions  for example: ''null''
 * @param graniteWorkflowInjectTenantIdInJobTopics  for example: ''null''
 * @param graniteWorkflowMaxPurgeSaveThreshold  for example: ''null''
 * @param graniteWorkflowMaxPurgeQueryCount  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties (
  graniteWorkflowinboxSortPropertyName: Option[ConfigNodePropertyDropDown] = None,
  graniteWorkflowinboxSortOrder: Option[ConfigNodePropertyString] = None,
  cqWorkflowJobRetry: Option[ConfigNodePropertyInteger] = None,
  cqWorkflowSuperuser: Option[ConfigNodePropertyArray] = None,
  graniteWorkflowInboxQuerySize: Option[ConfigNodePropertyInteger] = None,
  graniteWorkflowAdminUserGroupFilter: Option[ConfigNodePropertyBoolean] = None,
  graniteWorkflowEnforceWorkitemAssigneePermissions: Option[ConfigNodePropertyBoolean] = None,
  graniteWorkflowEnforceWorkflowInitiatorPermissions: Option[ConfigNodePropertyBoolean] = None,
  graniteWorkflowInjectTenantIdInJobTopics: Option[ConfigNodePropertyBoolean] = None,
  graniteWorkflowMaxPurgeSaveThreshold: Option[ConfigNodePropertyInteger] = None,
  graniteWorkflowMaxPurgeQueryCount: Option[ConfigNodePropertyInteger] = None
)

