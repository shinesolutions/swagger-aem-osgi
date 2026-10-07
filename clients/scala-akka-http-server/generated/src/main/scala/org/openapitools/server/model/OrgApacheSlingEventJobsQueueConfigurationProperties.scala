package org.openapitools.server.model


/**
 * @param queueName  for example: ''null''
 * @param queueTopics  for example: ''null''
 * @param queueType  for example: ''null''
 * @param queuePriority  for example: ''null''
 * @param queueRetries  for example: ''null''
 * @param queueRetrydelay  for example: ''null''
 * @param queueMaxparallel  for example: ''null''
 * @param queueKeepJobs  for example: ''null''
 * @param queuePreferRunOnCreationInstance  for example: ''null''
 * @param queueThreadPoolSize  for example: ''null''
 * @param serviceRanking  for example: ''null''
*/
final case class OrgApacheSlingEventJobsQueueConfigurationProperties (
  queueName: Option[ConfigNodePropertyString] = None,
  queueTopics: Option[ConfigNodePropertyArray] = None,
  queueType: Option[ConfigNodePropertyDropDown] = None,
  queuePriority: Option[ConfigNodePropertyDropDown] = None,
  queueRetries: Option[ConfigNodePropertyInteger] = None,
  queueRetrydelay: Option[ConfigNodePropertyInteger] = None,
  queueMaxparallel: Option[ConfigNodePropertyFloat] = None,
  queueKeepJobs: Option[ConfigNodePropertyBoolean] = None,
  queuePreferRunOnCreationInstance: Option[ConfigNodePropertyBoolean] = None,
  queueThreadPoolSize: Option[ConfigNodePropertyInteger] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None
)

