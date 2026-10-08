
package org.openapitools.client.model


case class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties (
    _cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties {
    def toStringBody(var_cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled: Object) =
        s"""
        | {
        | "cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled":$var_cqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
        | }
        """.stripMargin
}
