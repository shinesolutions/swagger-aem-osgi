
package org.openapitools.client.model


case class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties (
    _cqAnalyticsTestandtargetAccountoptionsupdaterEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {
    def toStringBody(var_cqAnalyticsTestandtargetAccountoptionsupdaterEnabled: Object) =
        s"""
        | {
        | "cqAnalyticsTestandtargetAccountoptionsupdaterEnabled":$var_cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
        | }
        """.stripMargin
}
