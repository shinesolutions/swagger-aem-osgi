
package org.openapitools.client.model


case class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties (
    _processLabel: Option[ConfigNodePropertyString],
    _notifyOnComplete: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {
    def toStringBody(var_processLabel: Object, var_notifyOnComplete: Object) =
        s"""
        | {
        | "processLabel":$var_processLabel,"notifyOnComplete":$var_notifyOnComplete
        | }
        """.stripMargin
}
