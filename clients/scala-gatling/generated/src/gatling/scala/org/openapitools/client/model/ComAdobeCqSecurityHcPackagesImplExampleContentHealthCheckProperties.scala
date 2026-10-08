
package org.openapitools.client.model


case class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
