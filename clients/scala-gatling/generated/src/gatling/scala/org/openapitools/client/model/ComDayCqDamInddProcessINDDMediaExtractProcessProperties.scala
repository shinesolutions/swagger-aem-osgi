
package org.openapitools.client.model


case class ComDayCqDamInddProcessINDDMediaExtractProcessProperties (
    _processLabel: Option[ConfigNodePropertyString],
    _cqDamInddPagesRegex: Option[ConfigNodePropertyString],
    _idsJobDecoupled: Option[ConfigNodePropertyBoolean],
    _idsJobWorkflowModel: Option[ConfigNodePropertyString]
)
object ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
    def toStringBody(var_processLabel: Object, var_cqDamInddPagesRegex: Object, var_idsJobDecoupled: Object, var_idsJobWorkflowModel: Object) =
        s"""
        | {
        | "processLabel":$var_processLabel,"cqDamInddPagesRegex":$var_cqDamInddPagesRegex,"idsJobDecoupled":$var_idsJobDecoupled,"idsJobWorkflowModel":$var_idsJobWorkflowModel
        | }
        """.stripMargin
}
