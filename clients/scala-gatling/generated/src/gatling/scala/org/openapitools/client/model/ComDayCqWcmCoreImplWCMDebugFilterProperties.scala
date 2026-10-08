
package org.openapitools.client.model


case class ComDayCqWcmCoreImplWCMDebugFilterProperties (
    _wcmdbgfilterEnabled: Option[ConfigNodePropertyBoolean],
    _wcmdbgfilterJspDebug: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmCoreImplWCMDebugFilterProperties {
    def toStringBody(var_wcmdbgfilterEnabled: Object, var_wcmdbgfilterJspDebug: Object) =
        s"""
        | {
        | "wcmdbgfilterEnabled":$var_wcmdbgfilterEnabled,"wcmdbgfilterJspDebug":$var_wcmdbgfilterJspDebug
        | }
        """.stripMargin
}
