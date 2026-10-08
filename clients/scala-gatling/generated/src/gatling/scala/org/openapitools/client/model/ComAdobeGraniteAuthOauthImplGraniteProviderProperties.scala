
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplGraniteProviderProperties (
    _oauthProviderId: Option[ConfigNodePropertyString],
    _oauthProviderGraniteAuthorizationUrl: Option[ConfigNodePropertyString],
    _oauthProviderGraniteTokenUrl: Option[ConfigNodePropertyString],
    _oauthProviderGraniteProfileUrl: Option[ConfigNodePropertyString],
    _oauthProviderGraniteExtendedDetailsUrls: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
    def toStringBody(var_oauthProviderId: Object, var_oauthProviderGraniteAuthorizationUrl: Object, var_oauthProviderGraniteTokenUrl: Object, var_oauthProviderGraniteProfileUrl: Object, var_oauthProviderGraniteExtendedDetailsUrls: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId,"oauthProviderGraniteAuthorizationUrl":$var_oauthProviderGraniteAuthorizationUrl,"oauthProviderGraniteTokenUrl":$var_oauthProviderGraniteTokenUrl,"oauthProviderGraniteProfileUrl":$var_oauthProviderGraniteProfileUrl,"oauthProviderGraniteExtendedDetailsUrls":$var_oauthProviderGraniteExtendedDetailsUrls
        | }
        """.stripMargin
}
