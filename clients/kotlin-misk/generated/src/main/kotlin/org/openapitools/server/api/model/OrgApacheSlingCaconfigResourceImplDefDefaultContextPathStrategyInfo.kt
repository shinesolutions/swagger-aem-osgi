package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
