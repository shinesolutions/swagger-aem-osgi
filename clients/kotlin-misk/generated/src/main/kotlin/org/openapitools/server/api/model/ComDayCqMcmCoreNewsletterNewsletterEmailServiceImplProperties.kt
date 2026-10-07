package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(
    val fromAddress: ConfigNodePropertyString? = null,
    val senderHost: ConfigNodePropertyString? = null,
    val maxBounceCount: ConfigNodePropertyString? = null
)
