
package org.openapitools.client.model


case class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
