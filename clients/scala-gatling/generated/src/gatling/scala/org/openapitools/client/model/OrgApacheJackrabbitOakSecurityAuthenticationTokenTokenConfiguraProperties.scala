
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties (
    _tokenExpiration: Option[ConfigNodePropertyString],
    _tokenLength: Option[ConfigNodePropertyString],
    _tokenRefresh: Option[ConfigNodePropertyBoolean],
    _tokenCleanupThreshold: Option[ConfigNodePropertyInteger],
    _passwordHashAlgorithm: Option[ConfigNodePropertyString],
    _passwordHashIterations: Option[ConfigNodePropertyInteger],
    _passwordSaltSize: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {
    def toStringBody(var_tokenExpiration: Object, var_tokenLength: Object, var_tokenRefresh: Object, var_tokenCleanupThreshold: Object, var_passwordHashAlgorithm: Object, var_passwordHashIterations: Object, var_passwordSaltSize: Object) =
        s"""
        | {
        | "tokenExpiration":$var_tokenExpiration,"tokenLength":$var_tokenLength,"tokenRefresh":$var_tokenRefresh,"tokenCleanupThreshold":$var_tokenCleanupThreshold,"passwordHashAlgorithm":$var_passwordHashAlgorithm,"passwordHashIterations":$var_passwordHashIterations,"passwordSaltSize":$var_passwordSaltSize
        | }
        """.stripMargin
}
