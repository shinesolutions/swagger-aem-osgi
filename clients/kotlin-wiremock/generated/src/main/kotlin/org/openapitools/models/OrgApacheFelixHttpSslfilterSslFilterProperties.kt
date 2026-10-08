@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixHttpSslfilterSslFilterProperties(
    @field:JsonProperty("ssl-forward.header")
    val sslForwardHeader: ConfigNodePropertyString? = null,

    @field:JsonProperty("ssl-forward.value")
    val sslForwardValue: ConfigNodePropertyString? = null,

    @field:JsonProperty("ssl-forward-cert.header")
    val sslForwardCertHeader: ConfigNodePropertyString? = null,

    @field:JsonProperty("rewrite.absolute.urls")
    val rewriteAbsoluteUrls: ConfigNodePropertyBoolean? = null,

)
