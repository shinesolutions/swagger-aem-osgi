package org.openapitools.server.model


/**
 * @param enableMultisession  for example: ''null''
 * @param idsCcEnable  for example: ''null''
 * @param enableRetry  for example: ''null''
 * @param enableRetryScripterror  for example: ''null''
 * @param externalizerDomainCqhost  for example: ''null''
 * @param externalizerDomainHttp  for example: ''null''
*/
final case class ComDayCqDamIdsImplIDSJobProcessorProperties (
  enableMultisession: Option[ConfigNodePropertyBoolean] = None,
  idsCcEnable: Option[ConfigNodePropertyBoolean] = None,
  enableRetry: Option[ConfigNodePropertyBoolean] = None,
  enableRetryScripterror: Option[ConfigNodePropertyBoolean] = None,
  externalizerDomainCqhost: Option[ConfigNodePropertyString] = None,
  externalizerDomainHttp: Option[ConfigNodePropertyString] = None
)

