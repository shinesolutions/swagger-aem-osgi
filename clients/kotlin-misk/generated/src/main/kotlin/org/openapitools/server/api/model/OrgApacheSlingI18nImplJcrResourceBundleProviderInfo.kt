package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingI18nImplJcrResourceBundleProviderProperties? = null,
    val additionalProperties: kotlin.String? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
