package org.openapitools.server.model


/**
 * @param messagesQueueSize  for example: ''null''
 * @param loggerConfig  for example: ''null''
 * @param messagesSize  for example: ''null''
*/
final case class ComAdobeGraniteLoggingImplLogAnalyserImplProperties (
  messagesQueueSize: Option[ConfigNodePropertyInteger] = None,
  loggerConfig: Option[ConfigNodePropertyArray] = None,
  messagesSize: Option[ConfigNodePropertyInteger] = None
)

