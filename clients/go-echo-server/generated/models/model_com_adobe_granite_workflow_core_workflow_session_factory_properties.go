package models

type ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties struct {

	GraniteWorkflowinboxSortPropertyName ConfigNodePropertyDropDown `json:"granite.workflowinbox.sort.propertyName,omitempty"`

	GraniteWorkflowinboxSortOrder ConfigNodePropertyString `json:"granite.workflowinbox.sort.order,omitempty"`

	CqWorkflowJobRetry ConfigNodePropertyInteger `json:"cq.workflow.job.retry,omitempty"`

	CqWorkflowSuperuser ConfigNodePropertyArray `json:"cq.workflow.superuser,omitempty"`

	GraniteWorkflowInboxQuerySize ConfigNodePropertyInteger `json:"granite.workflow.inboxQuerySize,omitempty"`

	GraniteWorkflowAdminUserGroupFilter ConfigNodePropertyBoolean `json:"granite.workflow.adminUserGroupFilter,omitempty"`

	GraniteWorkflowEnforceWorkitemAssigneePermissions ConfigNodePropertyBoolean `json:"granite.workflow.enforceWorkitemAssigneePermissions,omitempty"`

	GraniteWorkflowEnforceWorkflowInitiatorPermissions ConfigNodePropertyBoolean `json:"granite.workflow.enforceWorkflowInitiatorPermissions,omitempty"`

	GraniteWorkflowInjectTenantIdInJobTopics ConfigNodePropertyBoolean `json:"granite.workflow.injectTenantIdInJobTopics,omitempty"`

	GraniteWorkflowMaxPurgeSaveThreshold ConfigNodePropertyInteger `json:"granite.workflow.maxPurgeSaveThreshold,omitempty"`

	GraniteWorkflowMaxPurgeQueryCount ConfigNodePropertyInteger `json:"granite.workflow.maxPurgeQueryCount,omitempty"`
}
