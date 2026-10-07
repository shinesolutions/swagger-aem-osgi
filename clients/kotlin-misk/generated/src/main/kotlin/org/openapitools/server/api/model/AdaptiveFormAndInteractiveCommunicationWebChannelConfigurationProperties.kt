package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(
    val showPlaceholder: ConfigNodePropertyBoolean? = null,
    val maximumCacheEntries: ConfigNodePropertyInteger? = null,
    val afScriptingCompatversion: ConfigNodePropertyDropDown? = null,
    val makeFileNameUnique: ConfigNodePropertyBoolean? = null,
    val generatingCompliantData: ConfigNodePropertyBoolean? = null
)
