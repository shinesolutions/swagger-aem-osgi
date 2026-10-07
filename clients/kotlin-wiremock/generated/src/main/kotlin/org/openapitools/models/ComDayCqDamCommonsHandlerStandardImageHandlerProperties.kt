@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCommonsHandlerStandardImageHandlerProperties(
    @field:JsonProperty("large_file_threshold")
    val largeFileThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("large_comment_threshold")
    val largeCommentThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.enable.ext.meta.extraction")
    val cqDamEnableExtMetaExtraction: ConfigNodePropertyBoolean? = null,

)
