
package org.openapitools.client.model


case class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties (
    _cqAnalyticsTestandtargetSegmentimporterEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {
    def toStringBody(var_cqAnalyticsTestandtargetSegmentimporterEnabled: Object) =
        s"""
        | {
        | "cqAnalyticsTestandtargetSegmentimporterEnabled":$var_cqAnalyticsTestandtargetSegmentimporterEnabled
        | }
        """.stripMargin
}
