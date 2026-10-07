
package org.openapitools.client.model


case class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties (
    _oauthTokenRevocationActive: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
    def toStringBody(var_oauthTokenRevocationActive: Object) =
        s"""
        | {
        | "oauthTokenRevocationActive":$var_oauthTokenRevocationActive
        | }
        """.stripMargin
}
