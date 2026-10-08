package org.openapitools.server.model


/**
 * @param enable  for example: ''null''
 * @param agentConfiguration  for example: ''null''
 * @param contextPath  for example: ''null''
 * @param disabledCipherSuites  for example: ''null''
 * @param enabledCipherSuites  for example: ''null''
*/
final case class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties (
  enable: Option[ConfigNodePropertyBoolean] = None,
  agentConfiguration: Option[ConfigNodePropertyArray] = None,
  contextPath: Option[ConfigNodePropertyString] = None,
  disabledCipherSuites: Option[ConfigNodePropertyArray] = None,
  enabledCipherSuites: Option[ConfigNodePropertyArray] = None
)

