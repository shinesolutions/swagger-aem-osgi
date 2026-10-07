package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param enabled  for example: ''null''
 * @param reference  for example: ''null''
 * @param interval  for example: ''null''
 * @param expression  for example: ''null''
 * @param source  for example: ''null''
 * @param target  for example: ''null''
 * @param login  for example: ''null''
 * @param password  for example: ''null''
*/
final case class ComDayCqPollingImporterImplManagedPollConfigImplProperties (
  id: Option[ConfigNodePropertyString] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  reference: Option[ConfigNodePropertyBoolean] = None,
  interval: Option[ConfigNodePropertyInteger] = None,
  expression: Option[ConfigNodePropertyString] = None,
  source: Option[ConfigNodePropertyString] = None,
  target: Option[ConfigNodePropertyString] = None,
  login: Option[ConfigNodePropertyString] = None,
  password: Option[ConfigNodePropertyString] = None
)

