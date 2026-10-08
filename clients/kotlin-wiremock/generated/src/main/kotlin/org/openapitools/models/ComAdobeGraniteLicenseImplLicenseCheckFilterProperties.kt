@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(
    @field:JsonProperty("checkInternval")
    val checkInternval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("excludeIds")
    val excludeIds: ConfigNodePropertyArray? = null,

    @field:JsonProperty("encryptPing")
    val encryptPing: ConfigNodePropertyBoolean? = null,

)
