package org.openapitools.server.model


/**
 * @param eventFilter  for example: ''null''
 * @param minThreadPoolSize  for example: ''null''
 * @param maxThreadPoolSize  for example: ''null''
 * @param cqWcmWorkflowTerminateOnActivate  for example: ''null''
 * @param cqWcmWorklfowTerminateExclusionList  for example: ''null''
*/
final case class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties (
  eventFilter: Option[ConfigNodePropertyString] = None,
  minThreadPoolSize: Option[ConfigNodePropertyInteger] = None,
  maxThreadPoolSize: Option[ConfigNodePropertyInteger] = None,
  cqWcmWorkflowTerminateOnActivate: Option[ConfigNodePropertyBoolean] = None,
  cqWcmWorklfowTerminateExclusionList: Option[ConfigNodePropertyArray] = None
)

