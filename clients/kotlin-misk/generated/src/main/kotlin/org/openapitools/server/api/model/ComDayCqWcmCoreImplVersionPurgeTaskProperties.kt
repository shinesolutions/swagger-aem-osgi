package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplVersionPurgeTaskProperties(
    val versionpurgePaths: ConfigNodePropertyArray? = null,
    val versionpurgeRecursive: ConfigNodePropertyBoolean? = null,
    val versionpurgeMaxVersions: ConfigNodePropertyInteger? = null,
    val versionpurgeMinVersions: ConfigNodePropertyInteger? = null,
    val versionpurgeMaxAgeDays: ConfigNodePropertyInteger? = null
)
