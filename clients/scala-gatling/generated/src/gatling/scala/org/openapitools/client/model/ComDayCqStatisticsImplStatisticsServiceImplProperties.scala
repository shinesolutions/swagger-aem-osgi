
package org.openapitools.client.model


case class ComDayCqStatisticsImplStatisticsServiceImplProperties (
    _schedulerPeriod: Option[ConfigNodePropertyInteger],
    _schedulerConcurrent: Option[ConfigNodePropertyBoolean],
    _path: Option[ConfigNodePropertyString],
    _workspace: Option[ConfigNodePropertyString],
    _keywordsPath: Option[ConfigNodePropertyString],
    _asyncEntries: Option[ConfigNodePropertyBoolean]
)
object ComDayCqStatisticsImplStatisticsServiceImplProperties {
    def toStringBody(var_schedulerPeriod: Object, var_schedulerConcurrent: Object, var_path: Object, var_workspace: Object, var_keywordsPath: Object, var_asyncEntries: Object) =
        s"""
        | {
        | "schedulerPeriod":$var_schedulerPeriod,"schedulerConcurrent":$var_schedulerConcurrent,"path":$var_path,"workspace":$var_workspace,"keywordsPath":$var_keywordsPath,"asyncEntries":$var_asyncEntries
        | }
        """.stripMargin
}
