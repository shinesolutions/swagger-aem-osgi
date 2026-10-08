package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplDamEventRecorderImplProperties(
    val eventFilter: ConfigNodePropertyString? = null,
    val eventQueueLength: ConfigNodePropertyInteger? = null,
    val eventrecorderEnabled: ConfigNodePropertyBoolean? = null,
    val eventrecorderBlacklist: ConfigNodePropertyArray? = null,
    val eventrecorderEventtypes: ConfigNodePropertyDropDown? = null
)
