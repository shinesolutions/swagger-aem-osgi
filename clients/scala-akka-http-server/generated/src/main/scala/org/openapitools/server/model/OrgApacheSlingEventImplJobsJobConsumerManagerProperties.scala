package org.openapitools.server.model


/**
 * @param orgApacheSlingInstallerConfigurationPersist  for example: ''null''
 * @param jobConsumermanagerWhitelist  for example: ''null''
 * @param jobConsumermanagerBlacklist  for example: ''null''
*/
final case class OrgApacheSlingEventImplJobsJobConsumerManagerProperties (
  orgApacheSlingInstallerConfigurationPersist: Option[ConfigNodePropertyBoolean] = None,
  jobConsumermanagerWhitelist: Option[ConfigNodePropertyArray] = None,
  jobConsumermanagerBlacklist: Option[ConfigNodePropertyArray] = None
)

