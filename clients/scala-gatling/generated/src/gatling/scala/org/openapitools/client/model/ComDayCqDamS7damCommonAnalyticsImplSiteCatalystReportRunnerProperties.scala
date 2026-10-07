
package org.openapitools.client.model


case class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _schedulerConcurrent: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {
    def toStringBody(var_schedulerExpression: Object, var_schedulerConcurrent: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"schedulerConcurrent":$var_schedulerConcurrent
        | }
        """.stripMargin
}
