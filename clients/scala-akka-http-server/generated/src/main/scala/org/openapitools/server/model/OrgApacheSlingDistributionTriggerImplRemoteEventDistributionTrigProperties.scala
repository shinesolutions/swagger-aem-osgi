package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param endpoint  for example: ''null''
 * @param transportSecretProviderTarget  for example: ''null''
*/
final case class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties (
  name: Option[ConfigNodePropertyString] = None,
  endpoint: Option[ConfigNodePropertyString] = None,
  transportSecretProviderTarget: Option[ConfigNodePropertyString] = None
)

