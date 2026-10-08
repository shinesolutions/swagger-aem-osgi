
package org.openapitools.client.model


case class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties (
    _schedulerExpression: Option[ConfigNodePropertyString]
)
object ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties {
    def toStringBody(var_schedulerExpression: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression
        | }
        """.stripMargin
}
