@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(
    @field:JsonProperty("oauth.configmanager.ims.configid")
    val oauthConfigmanagerImsConfigid: ConfigNodePropertyString? = null,

    @field:JsonProperty("ims.owningEntity")
    val imsOwningEntity: ConfigNodePropertyString? = null,

    @field:JsonProperty("aem.instanceId")
    val aemInstanceId: ConfigNodePropertyString? = null,

    @field:JsonProperty("ims.serviceCode")
    val imsServiceCode: ConfigNodePropertyString? = null,

)
