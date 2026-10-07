
package org.openapitools.client.model


case class ComDayCqDamCoreImplReportsReportPurgeServiceProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _maxSavedReports: Option[ConfigNodePropertyInteger],
    _timeDuration: Option[ConfigNodePropertyInteger],
    _enableReportPurge: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
    def toStringBody(var_schedulerExpression: Object, var_maxSavedReports: Object, var_timeDuration: Object, var_enableReportPurge: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"maxSavedReports":$var_maxSavedReports,"timeDuration":$var_timeDuration,"enableReportPurge":$var_enableReportPurge
        | }
        """.stripMargin
}
