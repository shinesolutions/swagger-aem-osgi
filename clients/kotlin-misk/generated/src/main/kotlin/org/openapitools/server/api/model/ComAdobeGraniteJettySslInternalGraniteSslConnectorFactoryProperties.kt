package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(
    val comAdobeGraniteJettySslPort: ConfigNodePropertyInteger? = null,
    val comAdobeGraniteJettySslKeystoreUser: ConfigNodePropertyString? = null,
    val comAdobeGraniteJettySslKeystorePassword: ConfigNodePropertyString? = null,
    val comAdobeGraniteJettySslCiphersuitesExcluded: ConfigNodePropertyArray? = null,
    val comAdobeGraniteJettySslCiphersuitesIncluded: ConfigNodePropertyArray? = null,
    val comAdobeGraniteJettySslClientCertificate: ConfigNodePropertyDropDown? = null
)
