package org.openapitools.server.model


/**
 * @param cqSearchpromoteConfigurationServerUri  for example: ''null''
 * @param cqSearchpromoteConfigurationEnvironment  for example: ''null''
 * @param connectionTimeout  for example: ''null''
 * @param socketTimeout  for example: ''null''
*/
final case class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties (
  cqSearchpromoteConfigurationServerUri: Option[ConfigNodePropertyString] = None,
  cqSearchpromoteConfigurationEnvironment: Option[ConfigNodePropertyString] = None,
  connectionTimeout: Option[ConfigNodePropertyInteger] = None,
  socketTimeout: Option[ConfigNodePropertyInteger] = None
)

