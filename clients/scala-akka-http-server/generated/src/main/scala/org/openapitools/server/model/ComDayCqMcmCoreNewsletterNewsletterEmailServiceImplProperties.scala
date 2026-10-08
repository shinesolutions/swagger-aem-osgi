package org.openapitools.server.model


/**
 * @param fromAddress  for example: ''null''
 * @param senderHost  for example: ''null''
 * @param maxBounceCount  for example: ''null''
*/
final case class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties (
  fromAddress: Option[ConfigNodePropertyString] = None,
  senderHost: Option[ConfigNodePropertyString] = None,
  maxBounceCount: Option[ConfigNodePropertyString] = None
)

