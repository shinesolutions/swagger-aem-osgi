
package org.openapitools.client.model


case class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
