package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param path  for example: ''null''
 * @param ignoredPathsPatterns  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param deep  for example: ''null''
*/
final case class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties (
  name: Option[ConfigNodePropertyString] = None,
  path: Option[ConfigNodePropertyString] = None,
  ignoredPathsPatterns: Option[ConfigNodePropertyArray] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  deep: Option[ConfigNodePropertyBoolean] = None
)

