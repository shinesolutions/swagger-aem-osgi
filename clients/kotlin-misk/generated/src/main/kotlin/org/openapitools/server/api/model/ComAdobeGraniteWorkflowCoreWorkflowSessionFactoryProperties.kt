package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(
    val graniteWorkflowinboxSortPropertyName: ConfigNodePropertyDropDown? = null,
    val graniteWorkflowinboxSortOrder: ConfigNodePropertyString? = null,
    val cqWorkflowJobRetry: ConfigNodePropertyInteger? = null,
    val cqWorkflowSuperuser: ConfigNodePropertyArray? = null,
    val graniteWorkflowInboxQuerySize: ConfigNodePropertyInteger? = null,
    val graniteWorkflowAdminUserGroupFilter: ConfigNodePropertyBoolean? = null,
    val graniteWorkflowEnforceWorkitemAssigneePermissions: ConfigNodePropertyBoolean? = null,
    val graniteWorkflowEnforceWorkflowInitiatorPermissions: ConfigNodePropertyBoolean? = null,
    val graniteWorkflowInjectTenantIdInJobTopics: ConfigNodePropertyBoolean? = null,
    val graniteWorkflowMaxPurgeSaveThreshold: ConfigNodePropertyInteger? = null,
    val graniteWorkflowMaxPurgeQueryCount: ConfigNodePropertyInteger? = null
)
