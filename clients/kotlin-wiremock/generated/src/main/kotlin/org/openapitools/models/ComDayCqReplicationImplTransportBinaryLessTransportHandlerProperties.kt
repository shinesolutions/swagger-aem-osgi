@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(
    @field:JsonProperty("disabled.cipher.suites")
    val disabledCipherSuites: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enabled.cipher.suites")
    val enabledCipherSuites: ConfigNodePropertyArray? = null,

)
