
package org.openapitools.client.model


case class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties (
    _largeIndexCriticalThreshold: Option[ConfigNodePropertyInteger],
    _largeIndexWarnThreshold: Option[ConfigNodePropertyInteger],
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {
    def toStringBody(var_largeIndexCriticalThreshold: Object, var_largeIndexWarnThreshold: Object, var_hcTags: Object) =
        s"""
        | {
        | "largeIndexCriticalThreshold":$var_largeIndexCriticalThreshold,"largeIndexWarnThreshold":$var_largeIndexWarnThreshold,"hcTags":$var_hcTags
        | }
        """.stripMargin
}
