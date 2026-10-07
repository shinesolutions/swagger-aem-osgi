package org.openapitools.server.model


/**
 * @param queuePriority  for example: ''null''
 * @param queueRetries  for example: ''null''
 * @param queueRetrydelay  for example: ''null''
 * @param queueMaxparallel  for example: ''null''
*/
final case class OrgApacheSlingEventImplJobsDefaultJobManagerProperties (
  queuePriority: Option[ConfigNodePropertyDropDown] = None,
  queueRetries: Option[ConfigNodePropertyInteger] = None,
  queueRetrydelay: Option[ConfigNodePropertyInteger] = None,
  queueMaxparallel: Option[ConfigNodePropertyInteger] = None
)

