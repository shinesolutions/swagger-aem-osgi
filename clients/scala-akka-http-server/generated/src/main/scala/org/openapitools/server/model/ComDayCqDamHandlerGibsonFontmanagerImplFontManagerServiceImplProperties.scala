package org.openapitools.server.model


/**
 * @param eventFilter  for example: ''null''
 * @param fontmgrSystemFontDir  for example: ''null''
 * @param fontmgrAdobeFontDir  for example: ''null''
 * @param fontmgrCustomerFontDir  for example: ''null''
*/
final case class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties (
  eventFilter: Option[ConfigNodePropertyString] = None,
  fontmgrSystemFontDir: Option[ConfigNodePropertyArray] = None,
  fontmgrAdobeFontDir: Option[ConfigNodePropertyString] = None,
  fontmgrCustomerFontDir: Option[ConfigNodePropertyString] = None
)

