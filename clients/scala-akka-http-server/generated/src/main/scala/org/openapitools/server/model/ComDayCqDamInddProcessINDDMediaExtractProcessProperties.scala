package org.openapitools.server.model


/**
 * @param processLabel  for example: ''null''
 * @param cqDamInddPagesRegex  for example: ''null''
 * @param idsJobDecoupled  for example: ''null''
 * @param idsJobWorkflowModel  for example: ''null''
*/
final case class ComDayCqDamInddProcessINDDMediaExtractProcessProperties (
  processLabel: Option[ConfigNodePropertyString] = None,
  cqDamInddPagesRegex: Option[ConfigNodePropertyString] = None,
  idsJobDecoupled: Option[ConfigNodePropertyBoolean] = None,
  idsJobWorkflowModel: Option[ConfigNodePropertyString] = None
)

