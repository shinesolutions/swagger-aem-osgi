package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixHttpSslfilterSslFilterProperties(
    val sslForwardHeader: ConfigNodePropertyString? = null,
    val sslForwardValue: ConfigNodePropertyString? = null,
    val sslForwardCertHeader: ConfigNodePropertyString? = null,
    val rewriteAbsoluteUrls: ConfigNodePropertyBoolean? = null
)
