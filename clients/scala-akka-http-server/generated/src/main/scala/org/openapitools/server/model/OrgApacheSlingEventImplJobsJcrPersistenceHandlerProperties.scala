package org.openapitools.server.model


/**
 * @param jobConsumermanagerDisableDistribution  for example: ''null''
 * @param startupDelay  for example: ''null''
 * @param cleanupPeriod  for example: ''null''
*/
final case class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties (
  jobConsumermanagerDisableDistribution: Option[ConfigNodePropertyBoolean] = None,
  startupDelay: Option[ConfigNodePropertyInteger] = None,
  cleanupPeriod: Option[ConfigNodePropertyInteger] = None
)

