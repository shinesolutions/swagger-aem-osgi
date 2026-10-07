package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamIdsImplIDSPoolManagerImplProperties(
    val maxErrorsToBlacklist: ConfigNodePropertyInteger? = null,
    val retryIntervalToWhitelist: ConfigNodePropertyInteger? = null,
    val connectTimeout: ConfigNodePropertyInteger? = null,
    val socketTimeout: ConfigNodePropertyInteger? = null,
    val processLabel: ConfigNodePropertyString? = null,
    val connectionUseMax: ConfigNodePropertyInteger? = null
)
