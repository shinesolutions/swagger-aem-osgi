
package org.openapitools.client.model


case class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties (
    _authImsClientSecret: Option[ConfigNodePropertyString],
    _customizerType: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties {
    def toStringBody(var_authImsClientSecret: Object, var_customizerType: Object) =
        s"""
        | {
        | "authImsClientSecret":$var_authImsClientSecret,"customizerType":$var_customizerType
        | }
        """.stripMargin
}
