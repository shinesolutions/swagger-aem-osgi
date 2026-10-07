
package org.openapitools.client.model


case class ComDayCqReportingImplCacheCacheImplProperties (
    _repcacheEnable: Option[ConfigNodePropertyBoolean],
    _repcacheTtl: Option[ConfigNodePropertyInteger],
    _repcacheMax: Option[ConfigNodePropertyInteger]
)
object ComDayCqReportingImplCacheCacheImplProperties {
    def toStringBody(var_repcacheEnable: Object, var_repcacheTtl: Object, var_repcacheMax: Object) =
        s"""
        | {
        | "repcacheEnable":$var_repcacheEnable,"repcacheTtl":$var_repcacheTtl,"repcacheMax":$var_repcacheMax
        | }
        """.stripMargin
}
