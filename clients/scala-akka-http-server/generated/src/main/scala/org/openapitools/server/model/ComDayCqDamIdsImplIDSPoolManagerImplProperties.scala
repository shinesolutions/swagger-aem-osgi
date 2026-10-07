package org.openapitools.server.model


/**
 * @param maxErrorsToBlacklist  for example: ''null''
 * @param retryIntervalToWhitelist  for example: ''null''
 * @param connectTimeout  for example: ''null''
 * @param socketTimeout  for example: ''null''
 * @param processLabel  for example: ''null''
 * @param connectionUseMax  for example: ''null''
*/
final case class ComDayCqDamIdsImplIDSPoolManagerImplProperties (
  maxErrorsToBlacklist: Option[ConfigNodePropertyInteger] = None,
  retryIntervalToWhitelist: Option[ConfigNodePropertyInteger] = None,
  connectTimeout: Option[ConfigNodePropertyInteger] = None,
  socketTimeout: Option[ConfigNodePropertyInteger] = None,
  processLabel: Option[ConfigNodePropertyString] = None,
  connectionUseMax: Option[ConfigNodePropertyInteger] = None
)

