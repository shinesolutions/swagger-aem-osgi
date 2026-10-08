
package org.openapitools.client.model


case class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties (
    _cqAnalyticsTestandtargetApiUrl: Option[ConfigNodePropertyString],
    _cqAnalyticsTestandtargetTimeout: Option[ConfigNodePropertyInteger],
    _cqAnalyticsTestandtargetSockettimeout: Option[ConfigNodePropertyInteger],
    _cqAnalyticsTestandtargetRecommendationsUrlReplace: Option[ConfigNodePropertyString],
    _cqAnalyticsTestandtargetRecommendationsUrlReplacewith: Option[ConfigNodePropertyString]
)
object ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {
    def toStringBody(var_cqAnalyticsTestandtargetApiUrl: Object, var_cqAnalyticsTestandtargetTimeout: Object, var_cqAnalyticsTestandtargetSockettimeout: Object, var_cqAnalyticsTestandtargetRecommendationsUrlReplace: Object, var_cqAnalyticsTestandtargetRecommendationsUrlReplacewith: Object) =
        s"""
        | {
        | "cqAnalyticsTestandtargetApiUrl":$var_cqAnalyticsTestandtargetApiUrl,"cqAnalyticsTestandtargetTimeout":$var_cqAnalyticsTestandtargetTimeout,"cqAnalyticsTestandtargetSockettimeout":$var_cqAnalyticsTestandtargetSockettimeout,"cqAnalyticsTestandtargetRecommendationsUrlReplace":$var_cqAnalyticsTestandtargetRecommendationsUrlReplace,"cqAnalyticsTestandtargetRecommendationsUrlReplacewith":$var_cqAnalyticsTestandtargetRecommendationsUrlReplacewith
        | }
        """.stripMargin
}
