
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletHealthCheckServletProperties (
    _cqDamSyncWorkflowId: Option[ConfigNodePropertyString],
    _cqDamSyncFolderTypes: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplServletHealthCheckServletProperties {
    def toStringBody(var_cqDamSyncWorkflowId: Object, var_cqDamSyncFolderTypes: Object) =
        s"""
        | {
        | "cqDamSyncWorkflowId":$var_cqDamSyncWorkflowId,"cqDamSyncFolderTypes":$var_cqDamSyncFolderTypes
        | }
        """.stripMargin
}
