
package org.openapitools.client.model


case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties (
    _path: Option[ConfigNodePropertyString],
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _jaasControlFlag: Option[ConfigNodePropertyString],
    _jaasRealmName: Option[ConfigNodePropertyString],
    _jaasRanking: Option[ConfigNodePropertyInteger],
    _headers: Option[ConfigNodePropertyArray],
    _cookies: Option[ConfigNodePropertyArray],
    _parameters: Option[ConfigNodePropertyArray],
    _usermap: Option[ConfigNodePropertyArray],
    _format: Option[ConfigNodePropertyString],
    _trustedCredentialsAttribute: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
    def toStringBody(var_path: Object, var_serviceRanking: Object, var_jaasControlFlag: Object, var_jaasRealmName: Object, var_jaasRanking: Object, var_headers: Object, var_cookies: Object, var_parameters: Object, var_usermap: Object, var_format: Object, var_trustedCredentialsAttribute: Object) =
        s"""
        | {
        | "path":$var_path,"serviceRanking":$var_serviceRanking,"jaasControlFlag":$var_jaasControlFlag,"jaasRealmName":$var_jaasRealmName,"jaasRanking":$var_jaasRanking,"headers":$var_headers,"cookies":$var_cookies,"parameters":$var_parameters,"usermap":$var_usermap,"format":$var_format,"trustedCredentialsAttribute":$var_trustedCredentialsAttribute
        | }
        """.stripMargin
}
