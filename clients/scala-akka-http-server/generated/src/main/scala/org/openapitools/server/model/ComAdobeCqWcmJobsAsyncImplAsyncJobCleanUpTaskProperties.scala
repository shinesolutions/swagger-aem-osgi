package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param jobPurgeThreshold  for example: ''null''
 * @param jobPurgeMaxJobs  for example: ''null''
*/
final case class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  jobPurgeThreshold: Option[ConfigNodePropertyInteger] = None,
  jobPurgeMaxJobs: Option[ConfigNodePropertyInteger] = None
)

