@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqCommercePimImplPageEventListenerProperties(
    @field:JsonProperty("cq.commerce.pageeventlistener.enabled")
    val cqCommercePageeventlistenerEnabled: ConfigNodePropertyBoolean? = null,

)
