package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingScriptingCoreImplScriptCacheImplProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingScriptingCoreImplScriptCacheImplProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
