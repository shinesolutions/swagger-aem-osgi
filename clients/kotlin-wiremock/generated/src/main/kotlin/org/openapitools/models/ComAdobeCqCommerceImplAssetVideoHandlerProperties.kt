@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqCommerceImplAssetVideoHandlerProperties(
    @field:JsonProperty("cq.commerce.asset.handler.active")
    val cqCommerceAssetHandlerActive: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.commerce.asset.handler.name")
    val cqCommerceAssetHandlerName: ConfigNodePropertyString? = null,

)
