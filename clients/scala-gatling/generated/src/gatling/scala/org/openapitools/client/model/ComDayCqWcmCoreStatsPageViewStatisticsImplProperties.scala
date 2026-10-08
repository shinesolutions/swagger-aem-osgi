
package org.openapitools.client.model


case class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties (
    _pageviewstatisticsTrackingurl: Option[ConfigNodePropertyString],
    _pageviewstatisticsTrackingscriptEnabled: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {
    def toStringBody(var_pageviewstatisticsTrackingurl: Object, var_pageviewstatisticsTrackingscriptEnabled: Object) =
        s"""
        | {
        | "pageviewstatisticsTrackingurl":$var_pageviewstatisticsTrackingurl,"pageviewstatisticsTrackingscriptEnabled":$var_pageviewstatisticsTrackingscriptEnabled
        | }
        """.stripMargin
}
