@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(
    @field:JsonProperty("cq.mime.type.blacklist")
    val cqMimeTypeBlacklist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.empty.mime")
    val cqDamEmptyMime: ConfigNodePropertyBoolean? = null,

)
