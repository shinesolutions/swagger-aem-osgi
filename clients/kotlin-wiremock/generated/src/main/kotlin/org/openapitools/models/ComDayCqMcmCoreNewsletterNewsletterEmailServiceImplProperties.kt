@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(
    @field:JsonProperty("from.address")
    val fromAddress: ConfigNodePropertyString? = null,

    @field:JsonProperty("sender.host")
    val senderHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("max.bounce.count")
    val maxBounceCount: ConfigNodePropertyString? = null,

)
