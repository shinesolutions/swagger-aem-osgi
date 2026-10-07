
package org.openapitools.client.model


case class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties (
    _cqDamS7damDynamicmediaconfigeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {
    def toStringBody(var_cqDamS7damDynamicmediaconfigeventlistenerEnabled: Object) =
        s"""
        | {
        | "cqDamS7damDynamicmediaconfigeventlistenerEnabled":$var_cqDamS7damDynamicmediaconfigeventlistenerEnabled
        | }
        """.stripMargin
}
