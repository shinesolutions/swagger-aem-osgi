
package org.openapitools.client.model


case class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties (
    _reportFetchAttempts: Option[ConfigNodePropertyInteger],
    _reportFetchDelay: Option[ConfigNodePropertyInteger]
)
object ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties {
    def toStringBody(var_reportFetchAttempts: Object, var_reportFetchDelay: Object) =
        s"""
        | {
        | "reportFetchAttempts":$var_reportFetchAttempts,"reportFetchDelay":$var_reportFetchDelay
        | }
        """.stripMargin
}
