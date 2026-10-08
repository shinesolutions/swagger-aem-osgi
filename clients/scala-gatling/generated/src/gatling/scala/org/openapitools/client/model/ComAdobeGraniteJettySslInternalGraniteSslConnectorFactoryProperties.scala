
package org.openapitools.client.model


case class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties (
    _comAdobeGraniteJettySslPort: Option[ConfigNodePropertyInteger],
    _comAdobeGraniteJettySslKeystoreUser: Option[ConfigNodePropertyString],
    _comAdobeGraniteJettySslKeystorePassword: Option[ConfigNodePropertyString],
    _comAdobeGraniteJettySslCiphersuitesExcluded: Option[ConfigNodePropertyArray],
    _comAdobeGraniteJettySslCiphersuitesIncluded: Option[ConfigNodePropertyArray],
    _comAdobeGraniteJettySslClientCertificate: Option[ConfigNodePropertyDropDown]
)
object ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {
    def toStringBody(var_comAdobeGraniteJettySslPort: Object, var_comAdobeGraniteJettySslKeystoreUser: Object, var_comAdobeGraniteJettySslKeystorePassword: Object, var_comAdobeGraniteJettySslCiphersuitesExcluded: Object, var_comAdobeGraniteJettySslCiphersuitesIncluded: Object, var_comAdobeGraniteJettySslClientCertificate: Object) =
        s"""
        | {
        | "comAdobeGraniteJettySslPort":$var_comAdobeGraniteJettySslPort,"comAdobeGraniteJettySslKeystoreUser":$var_comAdobeGraniteJettySslKeystoreUser,"comAdobeGraniteJettySslKeystorePassword":$var_comAdobeGraniteJettySslKeystorePassword,"comAdobeGraniteJettySslCiphersuitesExcluded":$var_comAdobeGraniteJettySslCiphersuitesExcluded,"comAdobeGraniteJettySslCiphersuitesIncluded":$var_comAdobeGraniteJettySslCiphersuitesIncluded,"comAdobeGraniteJettySslClientCertificate":$var_comAdobeGraniteJettySslClientCertificate
        | }
        """.stripMargin
}
