@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplRenditionMakerImplProperties(
    @field:JsonProperty("xmp.propagate")
    val xmpPropagate: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("xmp.excludes")
    val xmpExcludes: ConfigNodePropertyArray? = null,

)
