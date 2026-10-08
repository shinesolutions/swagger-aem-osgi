@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("username")
    val username: ConfigNodePropertyString? = null,

    @field:JsonProperty("encryptedPassword")
    val encryptedPassword: ConfigNodePropertyString? = null,

)
