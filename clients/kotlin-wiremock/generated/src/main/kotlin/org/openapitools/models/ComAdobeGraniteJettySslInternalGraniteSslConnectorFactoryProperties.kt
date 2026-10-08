@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(
    @field:JsonProperty("com.adobe.granite.jetty.ssl.port")
    val comAdobeGraniteJettySslPort: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
    val comAdobeGraniteJettySslKeystoreUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
    val comAdobeGraniteJettySslKeystorePassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
    val comAdobeGraniteJettySslCiphersuitesExcluded: ConfigNodePropertyArray? = null,

    @field:JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
    val comAdobeGraniteJettySslCiphersuitesIncluded: ConfigNodePropertyArray? = null,

    @field:JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
    val comAdobeGraniteJettySslClientCertificate: ConfigNodePropertyDropDown? = null,

)
