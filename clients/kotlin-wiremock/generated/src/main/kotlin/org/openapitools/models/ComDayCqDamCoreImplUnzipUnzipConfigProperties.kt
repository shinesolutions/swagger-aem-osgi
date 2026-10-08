@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplUnzipUnzipConfigProperties(
    @field:JsonProperty("cq.dam.config.unzip.maxuncompressedsize")
    val cqDamConfigUnzipMaxuncompressedsize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.unzip.encoding")
    val cqDamConfigUnzipEncoding: ConfigNodePropertyString? = null,

)
