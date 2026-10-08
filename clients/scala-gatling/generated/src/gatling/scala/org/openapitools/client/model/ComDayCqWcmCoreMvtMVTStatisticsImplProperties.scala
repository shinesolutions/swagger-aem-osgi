
package org.openapitools.client.model


case class ComDayCqWcmCoreMvtMVTStatisticsImplProperties (
    _mvtstatisticsTrackingurl: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreMvtMVTStatisticsImplProperties {
    def toStringBody(var_mvtstatisticsTrackingurl: Object) =
        s"""
        | {
        | "mvtstatisticsTrackingurl":$var_mvtstatisticsTrackingurl
        | }
        """.stripMargin
}
