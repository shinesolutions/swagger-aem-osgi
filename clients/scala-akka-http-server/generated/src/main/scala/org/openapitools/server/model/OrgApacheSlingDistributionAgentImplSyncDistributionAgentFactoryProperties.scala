package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param title  for example: ''null''
 * @param details  for example: ''null''
 * @param enabled  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param logLevel  for example: ''null''
 * @param queueProcessingEnabled  for example: ''null''
 * @param passiveQueues  for example: ''null''
 * @param packageExporterEndpoints  for example: ''null''
 * @param packageImporterEndpoints  for example: ''null''
 * @param retryStrategy  for example: ''null''
 * @param retryAttempts  for example: ''null''
 * @param pullItems  for example: ''null''
 * @param httpConnTimeout  for example: ''null''
 * @param requestAuthorizationStrategyTarget  for example: ''null''
 * @param transportSecretProviderTarget  for example: ''null''
 * @param packageBuilderTarget  for example: ''null''
 * @param triggersTarget  for example: ''null''
*/
final case class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties (
  name: Option[ConfigNodePropertyString] = None,
  title: Option[ConfigNodePropertyString] = None,
  details: Option[ConfigNodePropertyString] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  logLevel: Option[ConfigNodePropertyDropDown] = None,
  queueProcessingEnabled: Option[ConfigNodePropertyBoolean] = None,
  passiveQueues: Option[ConfigNodePropertyArray] = None,
  packageExporterEndpoints: Option[ConfigNodePropertyArray] = None,
  packageImporterEndpoints: Option[ConfigNodePropertyArray] = None,
  retryStrategy: Option[ConfigNodePropertyDropDown] = None,
  retryAttempts: Option[ConfigNodePropertyInteger] = None,
  pullItems: Option[ConfigNodePropertyInteger] = None,
  httpConnTimeout: Option[ConfigNodePropertyInteger] = None,
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString] = None,
  transportSecretProviderTarget: Option[ConfigNodePropertyString] = None,
  packageBuilderTarget: Option[ConfigNodePropertyString] = None,
  triggersTarget: Option[ConfigNodePropertyString] = None
)

