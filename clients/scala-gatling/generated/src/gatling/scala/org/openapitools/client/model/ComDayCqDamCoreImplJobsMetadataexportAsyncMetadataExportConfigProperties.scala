
package org.openapitools.client.model


case class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties (
    _operation: Option[ConfigNodePropertyString],
    _emailEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {
    def toStringBody(var_operation: Object, var_emailEnabled: Object) =
        s"""
        | {
        | "operation":$var_operation,"emailEnabled":$var_emailEnabled
        | }
        """.stripMargin
}
