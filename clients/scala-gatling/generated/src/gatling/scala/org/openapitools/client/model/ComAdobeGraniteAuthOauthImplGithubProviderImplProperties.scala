
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties (
    _oauthProviderId: Option[ConfigNodePropertyString],
    _oauthProviderGithubAuthorizationUrl: Option[ConfigNodePropertyString],
    _oauthProviderGithubTokenUrl: Option[ConfigNodePropertyString],
    _oauthProviderGithubProfileUrl: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {
    def toStringBody(var_oauthProviderId: Object, var_oauthProviderGithubAuthorizationUrl: Object, var_oauthProviderGithubTokenUrl: Object, var_oauthProviderGithubProfileUrl: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId,"oauthProviderGithubAuthorizationUrl":$var_oauthProviderGithubAuthorizationUrl,"oauthProviderGithubTokenUrl":$var_oauthProviderGithubTokenUrl,"oauthProviderGithubProfileUrl":$var_oauthProviderGithubProfileUrl
        | }
        """.stripMargin
}
