
package org.openapitools.client.model


case class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties (
    _path: Option[ConfigNodePropertyString],
    _oauthClientIdsAllowed: Option[ConfigNodePropertyArray],
    _authBearerSyncIms: Option[ConfigNodePropertyBoolean],
    _authTokenRequestParameter: Option[ConfigNodePropertyString],
    _oauthBearerConfigid: Option[ConfigNodePropertyString],
    _oauthJwtSupport: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
    def toStringBody(var_path: Object, var_oauthClientIdsAllowed: Object, var_authBearerSyncIms: Object, var_authTokenRequestParameter: Object, var_oauthBearerConfigid: Object, var_oauthJwtSupport: Object) =
        s"""
        | {
        | "path":$var_path,"oauthClientIdsAllowed":$var_oauthClientIdsAllowed,"authBearerSyncIms":$var_authBearerSyncIms,"authTokenRequestParameter":$var_authTokenRequestParameter,"oauthBearerConfigid":$var_oauthBearerConfigid,"oauthJwtSupport":$var_oauthJwtSupport
        | }
        """.stripMargin
}
