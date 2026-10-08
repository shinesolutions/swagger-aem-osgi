
package org.openapitools.client.model


case class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties (
    _path: Option[ConfigNodePropertyArray],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties {
    def toStringBody(var_path: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "path":$var_path,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
