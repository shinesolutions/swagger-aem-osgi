@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(
    @field:JsonProperty("nuiEnabled")
    val nuiEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("nuiServiceUrl")
    val nuiServiceUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("nuiApiKey")
    val nuiApiKey: ConfigNodePropertyString? = null,

)
