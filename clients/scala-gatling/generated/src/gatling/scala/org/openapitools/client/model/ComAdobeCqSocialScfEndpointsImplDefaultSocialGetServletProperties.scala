
package org.openapitools.client.model


case class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties (
    _slingServletSelectors: Option[ConfigNodePropertyArray],
    _slingServletExtensions: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {
    def toStringBody(var_slingServletSelectors: Object, var_slingServletExtensions: Object) =
        s"""
        | {
        | "slingServletSelectors":$var_slingServletSelectors,"slingServletExtensions":$var_slingServletExtensions
        | }
        """.stripMargin
}
