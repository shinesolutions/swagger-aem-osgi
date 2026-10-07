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
 * @param eventFilter 
 * @param rolloutmgrExcludedpropsDefault 
 * @param rolloutmgrExcludedparagraphpropsDefault 
 * @param rolloutmgrExcludednodetypesDefault 
 * @param rolloutmgrThreadpoolMaxsize 
 * @param rolloutmgrThreadpoolMaxshutdowntime 
 * @param rolloutmgrThreadpoolPriority 
 * @param rolloutmgrCommitSize 
 * @param rolloutmgrConflicthandlingEnabled 
 */
data class ComDayCqWcmMsmImplRolloutManagerImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event.filter")
    @get:JsonProperty("event.filter") val eventFilter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.excludedprops.default")
    @get:JsonProperty("rolloutmgr.excludedprops.default") val rolloutmgrExcludedpropsDefault: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.excludedparagraphprops.default")
    @get:JsonProperty("rolloutmgr.excludedparagraphprops.default") val rolloutmgrExcludedparagraphpropsDefault: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.excludednodetypes.default")
    @get:JsonProperty("rolloutmgr.excludednodetypes.default") val rolloutmgrExcludednodetypesDefault: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.threadpool.maxsize")
    @get:JsonProperty("rolloutmgr.threadpool.maxsize") val rolloutmgrThreadpoolMaxsize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
    @get:JsonProperty("rolloutmgr.threadpool.maxshutdowntime") val rolloutmgrThreadpoolMaxshutdowntime: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.threadpool.priority")
    @get:JsonProperty("rolloutmgr.threadpool.priority") val rolloutmgrThreadpoolPriority: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.commit.size")
    @get:JsonProperty("rolloutmgr.commit.size") val rolloutmgrCommitSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rolloutmgr.conflicthandling.enabled")
    @get:JsonProperty("rolloutmgr.conflicthandling.enabled") val rolloutmgrConflicthandlingEnabled: ConfigNodePropertyBoolean? = null
) {

}

