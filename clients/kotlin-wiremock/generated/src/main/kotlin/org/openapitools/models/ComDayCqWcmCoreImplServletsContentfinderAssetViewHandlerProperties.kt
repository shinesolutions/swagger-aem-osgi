@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(
    @field:JsonProperty("dam.showexpired")
    val damShowexpired: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("dam.showhidden")
    val damShowhidden: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("tagTitleSearch")
    val tagTitleSearch: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("guessTotal")
    val guessTotal: ConfigNodePropertyString? = null,

    @field:JsonProperty("dam.expiryProperty")
    val damExpiryProperty: ConfigNodePropertyString? = null,

)
