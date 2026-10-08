package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(
    val authImsClientSecret: ConfigNodePropertyString? = null,
    val customizerType: ConfigNodePropertyString? = null
)
