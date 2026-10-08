
package org.openapitools.client.model


case class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties (
    _cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {
    def toStringBody(var_cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled: Object) =
        s"""
        | {
        | "cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled":$var_cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
        | }
        """.stripMargin
}
