package org.openapitools.server.model


/**
 * @param firewallDeserializationWhitelist  for example: ''null''
 * @param firewallDeserializationBlacklist  for example: ''null''
 * @param firewallDeserializationDiagnostics  for example: ''null''
*/
final case class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties (
  firewallDeserializationWhitelist: Option[ConfigNodePropertyArray] = None,
  firewallDeserializationBlacklist: Option[ConfigNodePropertyArray] = None,
  firewallDeserializationDiagnostics: Option[ConfigNodePropertyString] = None
)

