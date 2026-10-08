package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingServletsResolverSlingServletResolverProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingServletsResolverSlingServletResolverInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingServletsResolverSlingServletResolverProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
