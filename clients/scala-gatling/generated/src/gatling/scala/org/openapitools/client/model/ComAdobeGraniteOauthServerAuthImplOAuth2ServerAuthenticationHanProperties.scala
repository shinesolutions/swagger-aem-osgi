
package org.openapitools.client.model


case class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties (
    _path: Option[ConfigNodePropertyString],
    _jaasControlFlag: Option[ConfigNodePropertyString],
    _jaasRealmName: Option[ConfigNodePropertyString],
    _jaasRanking: Option[ConfigNodePropertyInteger],
    _oauthOfflineValidation: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {
    def toStringBody(var_path: Object, var_jaasControlFlag: Object, var_jaasRealmName: Object, var_jaasRanking: Object, var_oauthOfflineValidation: Object) =
        s"""
        | {
        | "path":$var_path,"jaasControlFlag":$var_jaasControlFlag,"jaasRealmName":$var_jaasRealmName,"jaasRanking":$var_jaasRanking,"oauthOfflineValidation":$var_oauthOfflineValidation
        | }
        """.stripMargin
}
