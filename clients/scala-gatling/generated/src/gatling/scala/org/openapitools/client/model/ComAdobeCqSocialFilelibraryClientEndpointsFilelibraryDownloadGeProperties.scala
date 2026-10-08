
package org.openapitools.client.model


case class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties (
    _slingServletSelectors: Option[ConfigNodePropertyString],
    _slingServletExtensions: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties {
    def toStringBody(var_slingServletSelectors: Object, var_slingServletExtensions: Object) =
        s"""
        | {
        | "slingServletSelectors":$var_slingServletSelectors,"slingServletExtensions":$var_slingServletExtensions
        | }
        """.stripMargin
}
