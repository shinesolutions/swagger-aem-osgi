@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("token.required.attr")
    val tokenRequiredAttr: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("token.alternate.url")
    val tokenAlternateUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("token.encapsulated")
    val tokenEncapsulated: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("skip.token.refresh")
    val skipTokenRefresh: ConfigNodePropertyArray? = null,

)
