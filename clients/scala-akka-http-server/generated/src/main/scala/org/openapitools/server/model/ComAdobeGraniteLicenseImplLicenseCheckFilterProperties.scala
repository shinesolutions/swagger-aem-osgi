package org.openapitools.server.model


/**
 * @param checkInternval  for example: ''null''
 * @param excludeIds  for example: ''null''
 * @param encryptPing  for example: ''null''
*/
final case class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties (
  checkInternval: Option[ConfigNodePropertyInteger] = None,
  excludeIds: Option[ConfigNodePropertyArray] = None,
  encryptPing: Option[ConfigNodePropertyBoolean] = None
)

