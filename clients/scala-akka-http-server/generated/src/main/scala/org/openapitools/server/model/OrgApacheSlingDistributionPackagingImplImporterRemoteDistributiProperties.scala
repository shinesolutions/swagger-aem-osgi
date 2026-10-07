package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param endpoints  for example: ''null''
 * @param transportSecretProviderTarget  for example: ''null''
*/
final case class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties (
  name: Option[ConfigNodePropertyString] = None,
  endpoints: Option[ConfigNodePropertyArray] = None,
  transportSecretProviderTarget: Option[ConfigNodePropertyString] = None
)

