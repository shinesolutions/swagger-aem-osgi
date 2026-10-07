
package org.openapitools.client.model


case class ComAdobeGraniteOptoutImplOptOutServiceImplProperties (
    _optoutCookies: Option[ConfigNodePropertyArray],
    _optoutHeaders: Option[ConfigNodePropertyArray],
    _optoutWhitelistCookies: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteOptoutImplOptOutServiceImplProperties {
    def toStringBody(var_optoutCookies: Object, var_optoutHeaders: Object, var_optoutWhitelistCookies: Object) =
        s"""
        | {
        | "optoutCookies":$var_optoutCookies,"optoutHeaders":$var_optoutHeaders,"optoutWhitelistCookies":$var_optoutWhitelistCookies
        | }
        """.stripMargin
}
