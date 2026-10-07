
package org.openapitools.client.model


case class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties (
    _slingServletSelectors: Option[ConfigNodePropertyString],
    _slingServletExtensions: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties {
    def toStringBody(var_slingServletSelectors: Object, var_slingServletExtensions: Object) =
        s"""
        | {
        | "slingServletSelectors":$var_slingServletSelectors,"slingServletExtensions":$var_slingServletExtensions
        | }
        """.stripMargin
}
