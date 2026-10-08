package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(
    val oauthConfigmanagerImsConfigid: ConfigNodePropertyString? = null,
    val imsOwningEntity: ConfigNodePropertyString? = null,
    val aemInstanceId: ConfigNodePropertyString? = null,
    val imsServiceCode: ConfigNodePropertyString? = null
)
