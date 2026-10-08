
package org.openapitools.client.model


case class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties (
    _oauthIssuer: Option[ConfigNodePropertyString],
    _oauthAccessTokenExpiresIn: Option[ConfigNodePropertyString],
    _osgiHttpWhiteboardServletPattern: Option[ConfigNodePropertyString],
    _osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {
    def toStringBody(var_oauthIssuer: Object, var_oauthAccessTokenExpiresIn: Object, var_osgiHttpWhiteboardServletPattern: Object, var_osgiHttpWhiteboardContextSelect: Object) =
        s"""
        | {
        | "oauthIssuer":$var_oauthIssuer,"oauthAccessTokenExpiresIn":$var_oauthAccessTokenExpiresIn,"osgiHttpWhiteboardServletPattern":$var_osgiHttpWhiteboardServletPattern,"osgiHttpWhiteboardContextSelect":$var_osgiHttpWhiteboardContextSelect
        | }
        """.stripMargin
}
