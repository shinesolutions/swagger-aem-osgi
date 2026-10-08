package org.openapitools.server.model


/**
 * @param jobTopics  for example: ''null''
 * @param serviceUserTarget  for example: ''null''
 * @param agentProviderTarget  for example: ''null''
*/
final case class ComDayCqReplicationImplAgentManagerImplProperties (
  jobTopics: Option[ConfigNodePropertyString] = None,
  serviceUserTarget: Option[ConfigNodePropertyString] = None,
  agentProviderTarget: Option[ConfigNodePropertyString] = None
)

