
package org.openapitools.client.model


case class ComDayCqDamCoreImplReportsReportExportServiceProperties (
    _queryBatchSize: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplReportsReportExportServiceProperties {
    def toStringBody(var_queryBatchSize: Object) =
        s"""
        | {
        | "queryBatchSize":$var_queryBatchSize
        | }
        """.stripMargin
}
