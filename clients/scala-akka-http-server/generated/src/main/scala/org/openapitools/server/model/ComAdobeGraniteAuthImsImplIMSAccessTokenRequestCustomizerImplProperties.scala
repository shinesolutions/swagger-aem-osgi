package org.openapitools.server.model


/**
 * @param authImsClientSecret  for example: ''null''
 * @param customizerType  for example: ''null''
*/
final case class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties (
  authImsClientSecret: Option[ConfigNodePropertyString] = None,
  customizerType: Option[ConfigNodePropertyString] = None
)

