
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties (
    _oauthCookieLoginTimeout: Option[ConfigNodePropertyString],
    _oauthCookieMaxAge: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {
    def toStringBody(var_oauthCookieLoginTimeout: Object, var_oauthCookieMaxAge: Object) =
        s"""
        | {
        | "oauthCookieLoginTimeout":$var_oauthCookieLoginTimeout,"oauthCookieMaxAge":$var_oauthCookieMaxAge
        | }
        """.stripMargin
}
