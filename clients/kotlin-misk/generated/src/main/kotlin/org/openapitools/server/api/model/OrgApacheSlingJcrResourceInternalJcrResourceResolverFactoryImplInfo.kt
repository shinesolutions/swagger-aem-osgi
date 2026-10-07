package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
