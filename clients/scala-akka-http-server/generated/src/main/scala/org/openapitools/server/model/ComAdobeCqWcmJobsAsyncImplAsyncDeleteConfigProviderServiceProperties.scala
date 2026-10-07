package org.openapitools.server.model


/**
 * @param threshold  for example: ''null''
 * @param jobTopicName  for example: ''null''
 * @param emailEnabled  for example: ''null''
*/
final case class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties (
  threshold: Option[ConfigNodePropertyInteger] = None,
  jobTopicName: Option[ConfigNodePropertyString] = None,
  emailEnabled: Option[ConfigNodePropertyBoolean] = None
)

