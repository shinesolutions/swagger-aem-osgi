package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingI18nImplI18NFilterProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingI18nImplI18NFilterInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingI18nImplI18NFilterProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
