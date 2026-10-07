@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplVersionPurgeTaskProperties(
    @field:JsonProperty("versionpurge.paths")
    val versionpurgePaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("versionpurge.recursive")
    val versionpurgeRecursive: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("versionpurge.maxVersions")
    val versionpurgeMaxVersions: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("versionpurge.minVersions")
    val versionpurgeMinVersions: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("versionpurge.maxAgeDays")
    val versionpurgeMaxAgeDays: ConfigNodePropertyInteger? = null,

)
