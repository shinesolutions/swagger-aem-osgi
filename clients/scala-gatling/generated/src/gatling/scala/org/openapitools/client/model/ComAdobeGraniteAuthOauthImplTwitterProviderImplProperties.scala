
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties (
    _oauthProviderId: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties {
    def toStringBody(var_oauthProviderId: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId
        | }
        """.stripMargin
}
