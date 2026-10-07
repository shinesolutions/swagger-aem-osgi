package org.openapitools.server.model


/**
 * @param hcTags  for example: ''null''
 * @param maxQueuedJobs  for example: ''null''
*/
final case class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties (
  hcTags: Option[ConfigNodePropertyArray] = None,
  maxQueuedJobs: Option[ConfigNodePropertyInteger] = None
)

