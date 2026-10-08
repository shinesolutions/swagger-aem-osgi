
package org.openapitools.client.model


case class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties (
    _operation: Option[ConfigNodePropertyString],
    _operationIcon: Option[ConfigNodePropertyString],
    _topicName: Option[ConfigNodePropertyString],
    _emailEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    def toStringBody(var_operation: Object, var_operationIcon: Object, var_topicName: Object, var_emailEnabled: Object) =
        s"""
        | {
        | "operation":$var_operation,"operationIcon":$var_operationIcon,"topicName":$var_topicName,"emailEnabled":$var_emailEnabled
        | }
        """.stripMargin
}
