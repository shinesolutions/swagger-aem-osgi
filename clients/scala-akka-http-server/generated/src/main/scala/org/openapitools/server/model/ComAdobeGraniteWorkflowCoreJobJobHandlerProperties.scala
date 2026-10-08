package org.openapitools.server.model


/**
 * @param jobTopics  for example: ''null''
 * @param allowSelfProcessTermination  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties (
  jobTopics: Option[ConfigNodePropertyArray] = None,
  allowSelfProcessTermination: Option[ConfigNodePropertyBoolean] = None
)

