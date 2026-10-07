package org.openapitools.server.model


/**
 * @param importerMinInterval  for example: ''null''
 * @param importerUser  for example: ''null''
 * @param excludePaths  for example: ''null''
 * @param includePaths  for example: ''null''
*/
final case class ComDayCqPollingImporterImplPollingImporterImplProperties (
  importerMinInterval: Option[ConfigNodePropertyInteger] = None,
  importerUser: Option[ConfigNodePropertyString] = None,
  excludePaths: Option[ConfigNodePropertyArray] = None,
  includePaths: Option[ConfigNodePropertyArray] = None
)

