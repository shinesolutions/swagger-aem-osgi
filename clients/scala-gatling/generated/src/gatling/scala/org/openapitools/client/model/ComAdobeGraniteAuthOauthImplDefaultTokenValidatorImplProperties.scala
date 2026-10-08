
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties (
    _authTokenValidatorType: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {
    def toStringBody(var_authTokenValidatorType: Object) =
        s"""
        | {
        | "authTokenValidatorType":$var_authTokenValidatorType
        | }
        """.stripMargin
}
