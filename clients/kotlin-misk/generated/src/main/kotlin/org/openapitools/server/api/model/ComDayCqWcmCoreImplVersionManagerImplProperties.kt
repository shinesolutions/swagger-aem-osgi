package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplVersionManagerImplProperties(
    val versionmanagerCreateVersionOnActivation: ConfigNodePropertyBoolean? = null,
    val versionmanagerPurgingEnabled: ConfigNodePropertyBoolean? = null,
    val versionmanagerPurgePaths: ConfigNodePropertyArray? = null,
    val versionmanagerIvPaths: ConfigNodePropertyArray? = null,
    val versionmanagerMaxAgeDays: ConfigNodePropertyInteger? = null,
    val versionmanagerMaxNumberVersions: ConfigNodePropertyInteger? = null,
    val versionmanagerMinNumberVersions: ConfigNodePropertyInteger? = null
)
