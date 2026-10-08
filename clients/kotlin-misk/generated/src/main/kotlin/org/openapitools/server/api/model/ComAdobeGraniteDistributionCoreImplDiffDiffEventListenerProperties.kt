package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(
    val diffPath: ConfigNodePropertyString? = null,
    val serviceName: ConfigNodePropertyString? = null,
    val serviceUserTarget: ConfigNodePropertyString? = null
)
