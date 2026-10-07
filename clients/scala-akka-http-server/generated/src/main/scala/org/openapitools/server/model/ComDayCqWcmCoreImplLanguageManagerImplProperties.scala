package org.openapitools.server.model


/**
 * @param langmgrListPath  for example: ''null''
 * @param langmgrCountryDefault  for example: ''null''
*/
final case class ComDayCqWcmCoreImplLanguageManagerImplProperties (
  langmgrListPath: Option[ConfigNodePropertyString] = None,
  langmgrCountryDefault: Option[ConfigNodePropertyArray] = None
)

