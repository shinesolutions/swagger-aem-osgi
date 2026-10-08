package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmMsmImplRolloutManagerImplProperties(
    val eventFilter: ConfigNodePropertyString? = null,
    val rolloutmgrExcludedpropsDefault: ConfigNodePropertyArray? = null,
    val rolloutmgrExcludedparagraphpropsDefault: ConfigNodePropertyArray? = null,
    val rolloutmgrExcludednodetypesDefault: ConfigNodePropertyArray? = null,
    val rolloutmgrThreadpoolMaxsize: ConfigNodePropertyInteger? = null,
    val rolloutmgrThreadpoolMaxshutdowntime: ConfigNodePropertyInteger? = null,
    val rolloutmgrThreadpoolPriority: ConfigNodePropertyDropDown? = null,
    val rolloutmgrCommitSize: ConfigNodePropertyInteger? = null,
    val rolloutmgrConflicthandlingEnabled: ConfigNodePropertyBoolean? = null
)
