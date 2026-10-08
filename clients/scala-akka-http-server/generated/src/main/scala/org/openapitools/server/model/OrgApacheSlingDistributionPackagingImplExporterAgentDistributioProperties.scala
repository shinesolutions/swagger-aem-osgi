package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param queue  for example: ''null''
 * @param dropInvalidItems  for example: ''null''
 * @param agentTarget  for example: ''null''
*/
final case class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties (
  name: Option[ConfigNodePropertyString] = None,
  queue: Option[ConfigNodePropertyString] = None,
  dropInvalidItems: Option[ConfigNodePropertyBoolean] = None,
  agentTarget: Option[ConfigNodePropertyString] = None
)

