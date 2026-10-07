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
 * @param cqWcmUndoEnabled 
 * @param cqWcmUndoPath 
 * @param cqWcmUndoValidity 
 * @param cqWcmUndoSteps 
 * @param cqWcmUndoPersistence 
 * @param cqWcmUndoPersistenceMode 
 * @param cqWcmUndoMarkermode 
 * @param cqWcmUndoWhitelist 
 * @param cqWcmUndoBlacklist 
 */
data class ComDayCqWcmUndoUndoConfigProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.enabled")
    @get:JsonProperty("cq.wcm.undo.enabled") val cqWcmUndoEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.path")
    @get:JsonProperty("cq.wcm.undo.path") val cqWcmUndoPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.validity")
    @get:JsonProperty("cq.wcm.undo.validity") val cqWcmUndoValidity: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.steps")
    @get:JsonProperty("cq.wcm.undo.steps") val cqWcmUndoSteps: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.persistence")
    @get:JsonProperty("cq.wcm.undo.persistence") val cqWcmUndoPersistence: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.persistence.mode")
    @get:JsonProperty("cq.wcm.undo.persistence.mode") val cqWcmUndoPersistenceMode: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.markermode")
    @get:JsonProperty("cq.wcm.undo.markermode") val cqWcmUndoMarkermode: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.whitelist")
    @get:JsonProperty("cq.wcm.undo.whitelist") val cqWcmUndoWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.wcm.undo.blacklist")
    @get:JsonProperty("cq.wcm.undo.blacklist") val cqWcmUndoBlacklist: ConfigNodePropertyArray? = null
) {

}

