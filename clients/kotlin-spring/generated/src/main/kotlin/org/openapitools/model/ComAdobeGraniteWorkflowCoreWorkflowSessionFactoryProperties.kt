package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param graniteWorkflowinboxSortPropertyName 
 * @param graniteWorkflowinboxSortOrder 
 * @param cqWorkflowJobRetry 
 * @param cqWorkflowSuperuser 
 * @param graniteWorkflowInboxQuerySize 
 * @param graniteWorkflowAdminUserGroupFilter 
 * @param graniteWorkflowEnforceWorkitemAssigneePermissions 
 * @param graniteWorkflowEnforceWorkflowInitiatorPermissions 
 * @param graniteWorkflowInjectTenantIdInJobTopics 
 * @param graniteWorkflowMaxPurgeSaveThreshold 
 * @param graniteWorkflowMaxPurgeQueryCount 
 */
data class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflowinbox.sort.propertyName")
    @get:JsonProperty("granite.workflowinbox.sort.propertyName") val graniteWorkflowinboxSortPropertyName: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflowinbox.sort.order")
    @get:JsonProperty("granite.workflowinbox.sort.order") val graniteWorkflowinboxSortOrder: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.workflow.job.retry")
    @get:JsonProperty("cq.workflow.job.retry") val cqWorkflowJobRetry: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.workflow.superuser")
    @get:JsonProperty("cq.workflow.superuser") val cqWorkflowSuperuser: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.inboxQuerySize")
    @get:JsonProperty("granite.workflow.inboxQuerySize") val graniteWorkflowInboxQuerySize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.adminUserGroupFilter")
    @get:JsonProperty("granite.workflow.adminUserGroupFilter") val graniteWorkflowAdminUserGroupFilter: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions")
    @get:JsonProperty("granite.workflow.enforceWorkitemAssigneePermissions") val graniteWorkflowEnforceWorkitemAssigneePermissions: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions")
    @get:JsonProperty("granite.workflow.enforceWorkflowInitiatorPermissions") val graniteWorkflowEnforceWorkflowInitiatorPermissions: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.injectTenantIdInJobTopics")
    @get:JsonProperty("granite.workflow.injectTenantIdInJobTopics") val graniteWorkflowInjectTenantIdInJobTopics: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.maxPurgeSaveThreshold")
    @get:JsonProperty("granite.workflow.maxPurgeSaveThreshold") val graniteWorkflowMaxPurgeSaveThreshold: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granite.workflow.maxPurgeQueryCount")
    @get:JsonProperty("granite.workflow.maxPurgeQueryCount") val graniteWorkflowMaxPurgeQueryCount: ConfigNodePropertyInteger? = null
) {

}

