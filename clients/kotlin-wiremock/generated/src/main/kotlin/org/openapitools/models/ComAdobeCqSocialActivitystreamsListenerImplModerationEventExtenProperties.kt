@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(
    @field:JsonProperty("accepted")
    val accepted: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ranked")
    val ranked: ConfigNodePropertyInteger? = null,

)
