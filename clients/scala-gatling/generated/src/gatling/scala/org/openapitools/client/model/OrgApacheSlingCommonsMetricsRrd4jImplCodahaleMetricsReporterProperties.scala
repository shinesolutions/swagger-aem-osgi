
package org.openapitools.client.model


case class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties (
    _datasources: Option[ConfigNodePropertyArray],
    _step: Option[ConfigNodePropertyInteger],
    _archives: Option[ConfigNodePropertyArray],
    _path: Option[ConfigNodePropertyString]
)
object OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
    def toStringBody(var_datasources: Object, var_step: Object, var_archives: Object, var_path: Object) =
        s"""
        | {
        | "datasources":$var_datasources,"step":$var_step,"archives":$var_archives,"path":$var_path
        | }
        """.stripMargin
}
