package org.openapitools.server.model


/**
 * @param processLabel  for example: ''null''
 * @param notifyOnComplete  for example: ''null''
*/
final case class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties (
  processLabel: Option[ConfigNodePropertyString] = None,
  notifyOnComplete: Option[ConfigNodePropertyBoolean] = None
)

