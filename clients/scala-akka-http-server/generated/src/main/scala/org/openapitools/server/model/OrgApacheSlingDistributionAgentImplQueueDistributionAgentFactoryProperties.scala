package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param title  for example: ''null''
 * @param details  for example: ''null''
 * @param enabled  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param logLevel  for example: ''null''
 * @param allowedRoots  for example: ''null''
 * @param requestAuthorizationStrategyTarget  for example: ''null''
 * @param queueProviderFactoryTarget  for example: ''null''
 * @param packageBuilderTarget  for example: ''null''
 * @param triggersTarget  for example: ''null''
 * @param priorityQueues  for example: ''null''
*/
final case class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties (
  name: Option[ConfigNodePropertyString] = None,
  title: Option[ConfigNodePropertyString] = None,
  details: Option[ConfigNodePropertyString] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  logLevel: Option[ConfigNodePropertyDropDown] = None,
  allowedRoots: Option[ConfigNodePropertyArray] = None,
  requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString] = None,
  queueProviderFactoryTarget: Option[ConfigNodePropertyString] = None,
  packageBuilderTarget: Option[ConfigNodePropertyString] = None,
  triggersTarget: Option[ConfigNodePropertyString] = None,
  priorityQueues: Option[ConfigNodePropertyArray] = None
)

