@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqPollingImporterImplPollingImporterImplProperties(
    @field:JsonProperty("importer.min.interval")
    val importerMinInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("importer.user")
    val importerUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("exclude.paths")
    val excludePaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("include.paths")
    val includePaths: ConfigNodePropertyArray? = null,

)
