package org.openapitools.server.model


/**
 * @param disabledCipherSuites  for example: ''null''
 * @param enabledCipherSuites  for example: ''null''
*/
final case class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties (
  disabledCipherSuites: Option[ConfigNodePropertyArray] = None,
  enabledCipherSuites: Option[ConfigNodePropertyArray] = None
)

