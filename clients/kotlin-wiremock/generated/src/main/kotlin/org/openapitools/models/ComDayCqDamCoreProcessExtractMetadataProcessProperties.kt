@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreProcessExtractMetadataProcessProperties(
    @field:JsonProperty("process.label")
    val processLabel: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.enable.sha1")
    val cqDamEnableSha1: ConfigNodePropertyBoolean? = null,

)
