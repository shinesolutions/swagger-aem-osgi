
package org.openapitools.client.model


case class ComAdobeGraniteInfocollectorInfoCollectorProperties (
    _graniteInfocollectorIncludeThreadDumps: Option[ConfigNodePropertyBoolean],
    _graniteInfocollectorIncludeHeapDump: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteInfocollectorInfoCollectorProperties {
    def toStringBody(var_graniteInfocollectorIncludeThreadDumps: Object, var_graniteInfocollectorIncludeHeapDump: Object) =
        s"""
        | {
        | "graniteInfocollectorIncludeThreadDumps":$var_graniteInfocollectorIncludeThreadDumps,"graniteInfocollectorIncludeHeapDump":$var_graniteInfocollectorIncludeHeapDump
        | }
        """.stripMargin
}
