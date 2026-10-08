
package org.openapitools.client.model


case class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties (
    _indexingCriticalThreshold: Option[ConfigNodePropertyInteger],
    _indexingWarnThreshold: Option[ConfigNodePropertyInteger],
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {
    def toStringBody(var_indexingCriticalThreshold: Object, var_indexingWarnThreshold: Object, var_hcTags: Object) =
        s"""
        | {
        | "indexingCriticalThreshold":$var_indexingCriticalThreshold,"indexingWarnThreshold":$var_indexingWarnThreshold,"hcTags":$var_hcTags
        | }
        """.stripMargin
}
