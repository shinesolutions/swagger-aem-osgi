@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(
    @field:JsonProperty("auth.ims.client.secret")
    val authImsClientSecret: ConfigNodePropertyString? = null,

    @field:JsonProperty("customizer.type")
    val customizerType: ConfigNodePropertyString? = null,

)
