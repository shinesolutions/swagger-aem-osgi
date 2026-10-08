
package org.openapitools.client.model


case class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties (
    _oauthClientRevocationActive: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {
    def toStringBody(var_oauthClientRevocationActive: Object) =
        s"""
        | {
        | "oauthClientRevocationActive":$var_oauthClientRevocationActive
        | }
        """.stripMargin
}
