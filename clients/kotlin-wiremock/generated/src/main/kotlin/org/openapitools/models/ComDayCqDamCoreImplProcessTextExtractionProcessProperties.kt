@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplProcessTextExtractionProcessProperties(
    @field:JsonProperty("mimeTypes")
    val mimeTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("maxExtract")
    val maxExtract: ConfigNodePropertyInteger? = null,

)
