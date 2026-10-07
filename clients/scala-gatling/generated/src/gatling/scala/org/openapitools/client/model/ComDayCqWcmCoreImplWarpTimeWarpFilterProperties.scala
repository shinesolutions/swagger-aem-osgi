
package org.openapitools.client.model


case class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties (
    _filterOrder: Option[ConfigNodePropertyString],
    _filterScope: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
    def toStringBody(var_filterOrder: Object, var_filterScope: Object) =
        s"""
        | {
        | "filterOrder":$var_filterOrder,"filterScope":$var_filterScope
        | }
        """.stripMargin
}
