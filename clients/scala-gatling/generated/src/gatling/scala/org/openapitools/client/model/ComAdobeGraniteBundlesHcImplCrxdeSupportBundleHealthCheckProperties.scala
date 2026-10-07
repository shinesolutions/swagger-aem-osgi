
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
