
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthAccesstokenProviderProperties (
    _name: Option[ConfigNodePropertyString],
    _authTokenProviderTitle: Option[ConfigNodePropertyString],
    _authTokenProviderDefaultClaims: Option[ConfigNodePropertyArray],
    _authTokenProviderEndpoint: Option[ConfigNodePropertyString],
    _authAccessTokenRequest: Option[ConfigNodePropertyString],
    _authTokenProviderKeypairAlias: Option[ConfigNodePropertyString],
    _authTokenProviderConnTimeout: Option[ConfigNodePropertyInteger],
    _authTokenProviderSoTimeout: Option[ConfigNodePropertyInteger],
    _authTokenProviderClientId: Option[ConfigNodePropertyString],
    _authTokenProviderScope: Option[ConfigNodePropertyString],
    _authTokenProviderReuseAccessToken: Option[ConfigNodePropertyBoolean],
    _authTokenProviderRelaxedSsl: Option[ConfigNodePropertyBoolean],
    _tokenRequestCustomizerType: Option[ConfigNodePropertyString],
    _authTokenValidatorType: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
    def toStringBody(var_name: Object, var_authTokenProviderTitle: Object, var_authTokenProviderDefaultClaims: Object, var_authTokenProviderEndpoint: Object, var_authAccessTokenRequest: Object, var_authTokenProviderKeypairAlias: Object, var_authTokenProviderConnTimeout: Object, var_authTokenProviderSoTimeout: Object, var_authTokenProviderClientId: Object, var_authTokenProviderScope: Object, var_authTokenProviderReuseAccessToken: Object, var_authTokenProviderRelaxedSsl: Object, var_tokenRequestCustomizerType: Object, var_authTokenValidatorType: Object) =
        s"""
        | {
        | "name":$var_name,"authTokenProviderTitle":$var_authTokenProviderTitle,"authTokenProviderDefaultClaims":$var_authTokenProviderDefaultClaims,"authTokenProviderEndpoint":$var_authTokenProviderEndpoint,"authAccessTokenRequest":$var_authAccessTokenRequest,"authTokenProviderKeypairAlias":$var_authTokenProviderKeypairAlias,"authTokenProviderConnTimeout":$var_authTokenProviderConnTimeout,"authTokenProviderSoTimeout":$var_authTokenProviderSoTimeout,"authTokenProviderClientId":$var_authTokenProviderClientId,"authTokenProviderScope":$var_authTokenProviderScope,"authTokenProviderReuseAccessToken":$var_authTokenProviderReuseAccessToken,"authTokenProviderRelaxedSsl":$var_authTokenProviderRelaxedSsl,"tokenRequestCustomizerType":$var_tokenRequestCustomizerType,"authTokenValidatorType":$var_authTokenValidatorType
        | }
        """.stripMargin
}
