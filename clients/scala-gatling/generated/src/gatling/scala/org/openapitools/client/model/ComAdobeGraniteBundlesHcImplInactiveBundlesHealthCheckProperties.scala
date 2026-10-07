
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _ignoredBundles: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_ignoredBundles: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"ignoredBundles":$var_ignoredBundles
        | }
        """.stripMargin
}
