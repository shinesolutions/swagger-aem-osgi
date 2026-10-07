package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties? = null
)
