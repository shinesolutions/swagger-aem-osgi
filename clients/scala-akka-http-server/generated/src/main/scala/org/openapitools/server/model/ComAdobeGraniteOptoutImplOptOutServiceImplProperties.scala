package org.openapitools.server.model


/**
 * @param optoutCookies  for example: ''null''
 * @param optoutHeaders  for example: ''null''
 * @param optoutWhitelistCookies  for example: ''null''
*/
final case class ComAdobeGraniteOptoutImplOptOutServiceImplProperties (
  optoutCookies: Option[ConfigNodePropertyArray] = None,
  optoutHeaders: Option[ConfigNodePropertyArray] = None,
  optoutWhitelistCookies: Option[ConfigNodePropertyArray] = None
)

