
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties (
    _oauthProviderId: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties {
    def toStringBody(var_oauthProviderId: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId
        | }
        """.stripMargin
}
