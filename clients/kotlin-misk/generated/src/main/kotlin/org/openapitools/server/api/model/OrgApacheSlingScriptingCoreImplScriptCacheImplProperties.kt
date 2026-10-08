package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(
    val orgApacheSlingScriptingCacheSize: ConfigNodePropertyInteger? = null,
    val orgApacheSlingScriptingCacheAdditionalExtensions: ConfigNodePropertyArray? = null
)
