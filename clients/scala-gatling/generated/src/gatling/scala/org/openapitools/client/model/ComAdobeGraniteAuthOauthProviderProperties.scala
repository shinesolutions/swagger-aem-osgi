
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthProviderProperties (
    _oauthConfigId: Option[ConfigNodePropertyString],
    _oauthClientId: Option[ConfigNodePropertyString],
    _oauthClientSecret: Option[ConfigNodePropertyString],
    _oauthScope: Option[ConfigNodePropertyArray],
    _oauthConfigProviderId: Option[ConfigNodePropertyString],
    _oauthCreateUsers: Option[ConfigNodePropertyBoolean],
    _oauthUseridProperty: Option[ConfigNodePropertyString],
    _forceStrictUsernameMatching: Option[ConfigNodePropertyBoolean],
    _oauthEncodeUserids: Option[ConfigNodePropertyBoolean],
    _oauthHashUserids: Option[ConfigNodePropertyBoolean],
    _oauthCallBackUrl: Option[ConfigNodePropertyString],
    _oauthAccessTokenPersist: Option[ConfigNodePropertyBoolean],
    _oauthAccessTokenPersistCookie: Option[ConfigNodePropertyBoolean],
    _oauthCsrfStateProtection: Option[ConfigNodePropertyBoolean],
    _oauthRedirectRequestParams: Option[ConfigNodePropertyBoolean],
    _oauthConfigSiblingsAllow: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteAuthOauthProviderProperties {
    def toStringBody(var_oauthConfigId: Object, var_oauthClientId: Object, var_oauthClientSecret: Object, var_oauthScope: Object, var_oauthConfigProviderId: Object, var_oauthCreateUsers: Object, var_oauthUseridProperty: Object, var_forceStrictUsernameMatching: Object, var_oauthEncodeUserids: Object, var_oauthHashUserids: Object, var_oauthCallBackUrl: Object, var_oauthAccessTokenPersist: Object, var_oauthAccessTokenPersistCookie: Object, var_oauthCsrfStateProtection: Object, var_oauthRedirectRequestParams: Object, var_oauthConfigSiblingsAllow: Object) =
        s"""
        | {
        | "oauthConfigId":$var_oauthConfigId,"oauthClientId":$var_oauthClientId,"oauthClientSecret":$var_oauthClientSecret,"oauthScope":$var_oauthScope,"oauthConfigProviderId":$var_oauthConfigProviderId,"oauthCreateUsers":$var_oauthCreateUsers,"oauthUseridProperty":$var_oauthUseridProperty,"forceStrictUsernameMatching":$var_forceStrictUsernameMatching,"oauthEncodeUserids":$var_oauthEncodeUserids,"oauthHashUserids":$var_oauthHashUserids,"oauthCallBackUrl":$var_oauthCallBackUrl,"oauthAccessTokenPersist":$var_oauthAccessTokenPersist,"oauthAccessTokenPersistCookie":$var_oauthAccessTokenPersistCookie,"oauthCsrfStateProtection":$var_oauthCsrfStateProtection,"oauthRedirectRequestParams":$var_oauthRedirectRequestParams,"oauthConfigSiblingsAllow":$var_oauthConfigSiblingsAllow
        | }
        """.stripMargin
}
