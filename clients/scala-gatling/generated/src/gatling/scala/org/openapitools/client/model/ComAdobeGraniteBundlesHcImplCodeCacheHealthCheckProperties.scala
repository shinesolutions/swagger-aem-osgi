
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _minimumCodeCacheSize: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_minimumCodeCacheSize: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"minimumCodeCacheSize":$var_minimumCodeCacheSize
        | }
        """.stripMargin
}
