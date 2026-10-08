package org.openapitools.server.model


/**
 * @param oauthConfigmanagerImsConfigid  for example: ''null''
 * @param imsOwningEntity  for example: ''null''
 * @param aemInstanceId  for example: ''null''
 * @param imsServiceCode  for example: ''null''
*/
final case class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties (
  oauthConfigmanagerImsConfigid: Option[ConfigNodePropertyString] = None,
  imsOwningEntity: Option[ConfigNodePropertyString] = None,
  aemInstanceId: Option[ConfigNodePropertyString] = None,
  imsServiceCode: Option[ConfigNodePropertyString] = None
)

