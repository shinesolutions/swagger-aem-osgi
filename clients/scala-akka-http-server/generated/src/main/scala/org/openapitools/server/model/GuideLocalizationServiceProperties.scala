package org.openapitools.server.model


/**
 * @param supportedLocales  for example: ''null''
 * @param localizableProperties  for example: ''null''
*/
final case class GuideLocalizationServiceProperties (
  supportedLocales: Option[ConfigNodePropertyArray] = None,
  localizableProperties: Option[ConfigNodePropertyArray] = None
)

