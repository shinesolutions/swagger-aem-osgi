package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param scheduledpurgeName 
 * @param scheduledpurgePurgeActive 
 * @param scheduledpurgeTemplates 
 * @param scheduledpurgePurgeGroups 
 * @param scheduledpurgePurgeAssets 
 * @param scheduledpurgeTerminateRunningWorkflows 
 * @param scheduledpurgeDaysold 
 * @param scheduledpurgeSaveThreshold 
 */
data class ComAdobeCqProjectsPurgeSchedulerProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.name")
    @get:JsonProperty("scheduledpurge.name") val scheduledpurgeName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.purgeActive")
    @get:JsonProperty("scheduledpurge.purgeActive") val scheduledpurgePurgeActive: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.templates")
    @get:JsonProperty("scheduledpurge.templates") val scheduledpurgeTemplates: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.purgeGroups")
    @get:JsonProperty("scheduledpurge.purgeGroups") val scheduledpurgePurgeGroups: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.purgeAssets")
    @get:JsonProperty("scheduledpurge.purgeAssets") val scheduledpurgePurgeAssets: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.terminateRunningWorkflows")
    @get:JsonProperty("scheduledpurge.terminateRunningWorkflows") val scheduledpurgeTerminateRunningWorkflows: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.daysold")
    @get:JsonProperty("scheduledpurge.daysold") val scheduledpurgeDaysold: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduledpurge.saveThreshold")
    @get:JsonProperty("scheduledpurge.saveThreshold") val scheduledpurgeSaveThreshold: ConfigNodePropertyInteger? = null
) {

}

