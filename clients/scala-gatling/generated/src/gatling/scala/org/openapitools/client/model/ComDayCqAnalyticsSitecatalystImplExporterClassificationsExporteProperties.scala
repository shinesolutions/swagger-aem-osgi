
package org.openapitools.client.model


case class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties (
    _allowedPaths: Option[ConfigNodePropertyArray],
    _cqAnalyticsSaintExporterPagesize: Option[ConfigNodePropertyInteger]
)
object ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {
    def toStringBody(var_allowedPaths: Object, var_cqAnalyticsSaintExporterPagesize: Object) =
        s"""
        | {
        | "allowedPaths":$var_allowedPaths,"cqAnalyticsSaintExporterPagesize":$var_cqAnalyticsSaintExporterPagesize
        | }
        """.stripMargin
}
