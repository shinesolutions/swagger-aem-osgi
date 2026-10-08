
package org.openapitools.client.model


case class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties (
    _slingServletPaths: Option[ConfigNodePropertyString],
    _oauthRevocationActive: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {
    def toStringBody(var_slingServletPaths: Object, var_oauthRevocationActive: Object) =
        s"""
        | {
        | "slingServletPaths":$var_slingServletPaths,"oauthRevocationActive":$var_oauthRevocationActive
        | }
        """.stripMargin
}
