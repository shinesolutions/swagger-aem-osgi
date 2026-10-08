package org.openapitools.server.model


/**
 * @param configid  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class ComAdobeGraniteAuthImsProperties (
  configid: Option[ConfigNodePropertyString] = None,
  scope: Option[ConfigNodePropertyString] = None
)

