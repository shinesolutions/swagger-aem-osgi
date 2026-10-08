package org.openapitools.server.model


/**
 * @param cqDamSyncWorkflowId  for example: ''null''
 * @param cqDamSyncFolderTypes  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletHealthCheckServletProperties (
  cqDamSyncWorkflowId: Option[ConfigNodePropertyString] = None,
  cqDamSyncFolderTypes: Option[ConfigNodePropertyArray] = None
)

