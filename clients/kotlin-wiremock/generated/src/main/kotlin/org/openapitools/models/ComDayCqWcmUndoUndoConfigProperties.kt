@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmUndoUndoConfigProperties(
    @field:JsonProperty("cq.wcm.undo.enabled")
    val cqWcmUndoEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.wcm.undo.path")
    val cqWcmUndoPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.wcm.undo.validity")
    val cqWcmUndoValidity: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.wcm.undo.steps")
    val cqWcmUndoSteps: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.wcm.undo.persistence")
    val cqWcmUndoPersistence: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.wcm.undo.persistence.mode")
    val cqWcmUndoPersistenceMode: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.wcm.undo.markermode")
    val cqWcmUndoMarkermode: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.wcm.undo.whitelist")
    val cqWcmUndoWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.wcm.undo.blacklist")
    val cqWcmUndoBlacklist: ConfigNodePropertyArray? = null,

)
