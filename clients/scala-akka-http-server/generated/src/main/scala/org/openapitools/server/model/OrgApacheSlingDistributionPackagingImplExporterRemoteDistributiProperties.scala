package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param endpoints  for example: ''null''
 * @param pullItems  for example: ''null''
 * @param packageBuilderTarget  for example: ''null''
 * @param transportSecretProviderTarget  for example: ''null''
*/
final case class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties (
  name: Option[ConfigNodePropertyString] = None,
  endpoints: Option[ConfigNodePropertyArray] = None,
  pullItems: Option[ConfigNodePropertyInteger] = None,
  packageBuilderTarget: Option[ConfigNodePropertyString] = None,
  transportSecretProviderTarget: Option[ConfigNodePropertyString] = None
)

