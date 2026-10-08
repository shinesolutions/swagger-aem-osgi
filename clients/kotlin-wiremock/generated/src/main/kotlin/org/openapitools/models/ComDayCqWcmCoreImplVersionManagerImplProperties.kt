@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplVersionManagerImplProperties(
    @field:JsonProperty("versionmanager.createVersionOnActivation")
    val versionmanagerCreateVersionOnActivation: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("versionmanager.purgingEnabled")
    val versionmanagerPurgingEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("versionmanager.purgePaths")
    val versionmanagerPurgePaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("versionmanager.ivPaths")
    val versionmanagerIvPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("versionmanager.maxAgeDays")
    val versionmanagerMaxAgeDays: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("versionmanager.maxNumberVersions")
    val versionmanagerMaxNumberVersions: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("versionmanager.minNumberVersions")
    val versionmanagerMinNumberVersions: ConfigNodePropertyInteger? = null,

)
