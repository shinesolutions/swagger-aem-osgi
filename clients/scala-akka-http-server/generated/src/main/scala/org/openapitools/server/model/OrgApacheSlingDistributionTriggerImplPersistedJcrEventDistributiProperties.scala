package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param path  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param nuggetsPath  for example: ''null''
*/
final case class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties (
  name: Option[ConfigNodePropertyString] = None,
  path: Option[ConfigNodePropertyString] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  nuggetsPath: Option[ConfigNodePropertyString] = None
)

