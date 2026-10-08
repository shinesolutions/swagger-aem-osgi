@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(
    @field:JsonProperty("granite.workflowinbox.sort.propertyName")
    val graniteWorkflowinboxSortPropertyName: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("granite.workflowinbox.sort.order")
    val graniteWorkflowinboxSortOrder: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.workflow.job.retry")
    val cqWorkflowJobRetry: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.workflow.superuser")
    val cqWorkflowSuperuser: ConfigNodePropertyArray? = null,

    @field:JsonProperty("granite.workflow.inboxQuerySize")
    val graniteWorkflowInboxQuerySize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("granite.workflow.adminUserGroupFilter")
    val graniteWorkflowAdminUserGroupFilter: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions")
    val graniteWorkflowEnforceWorkitemAssigneePermissions: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions")
    val graniteWorkflowEnforceWorkflowInitiatorPermissions: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.workflow.injectTenantIdInJobTopics")
    val graniteWorkflowInjectTenantIdInJobTopics: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("granite.workflow.maxPurgeSaveThreshold")
    val graniteWorkflowMaxPurgeSaveThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("granite.workflow.maxPurgeQueryCount")
    val graniteWorkflowMaxPurgeQueryCount: ConfigNodePropertyInteger? = null,

)
