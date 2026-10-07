package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
