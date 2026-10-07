@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(
    @field:JsonProperty("osgi.http.whiteboard.context.select")
    val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null,

    @field:JsonProperty("osgi.http.whiteboard.listener")
    val osgiHttpWhiteboardListener: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.sudo.cookie")
    val authSudoCookie: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.sudo.parameter")
    val authSudoParameter: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.annonymous")
    val authAnnonymous: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("sling.auth.requirements")
    val slingAuthRequirements: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.auth.anonymous.user")
    val slingAuthAnonymousUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.auth.anonymous.password")
    val slingAuthAnonymousPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.http")
    val authHttp: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("auth.http.realm")
    val authHttpRealm: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.uri.suffix")
    val authUriSuffix: ConfigNodePropertyArray? = null,

)
