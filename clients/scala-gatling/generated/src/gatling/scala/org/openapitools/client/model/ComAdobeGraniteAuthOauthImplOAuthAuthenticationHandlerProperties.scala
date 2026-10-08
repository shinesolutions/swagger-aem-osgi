
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties (
    _path: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties {
    def toStringBody(var_path: Object) =
        s"""
        | {
        | "path":$var_path
        | }
        """.stripMargin
}
