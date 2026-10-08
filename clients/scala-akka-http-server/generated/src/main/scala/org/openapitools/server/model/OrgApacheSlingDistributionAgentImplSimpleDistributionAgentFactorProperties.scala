package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param title  for example: ''null''
 * @param details  for example: ''null''
 * @param enabled  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param logLevel  for example: ''null''
 * @param queueProcessingEnabled  for example: ''null''
 * @param packageExporterTarget  for example: ''null''
 * @param packageImporterTarget  for example: ''null''
 * @param requestAuthorizationStrategyTarget  for example: ''null''
 * @param triggersTarget  for example: ''null''
*/
final case class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties (
  name: Option[ConfigNodePropertyString] = None,
  title: Option[ConfigNodePropertyString] = None,
  details: Option[ConfigNodePropertyString] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  logLevel: Option[ConfigNodePropertyDropDown] = None,
  queueProcessingEnabled: Option[ConfigNodePropertyBoolean] = None,
  packageExporterTarget: Option[ConfigNodePropertyString] = None,
  packageImporterTarget: Option[ConfigNodePropertyString] = None,
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString] = None,
  triggersTarget: Option[ConfigNodePropertyString] = None
)

