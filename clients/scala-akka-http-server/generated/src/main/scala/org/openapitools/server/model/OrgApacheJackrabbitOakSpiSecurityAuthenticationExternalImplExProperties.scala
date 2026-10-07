package org.openapitools.server.model


/**
 * @param jaasRanking  for example: ''null''
 * @param jaasControlFlag  for example: ''null''
 * @param jaasRealmName  for example: ''null''
 * @param idpName  for example: ''null''
 * @param syncHandlerName  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties (
  jaasRanking: Option[ConfigNodePropertyInteger] = None,
  jaasControlFlag: Option[ConfigNodePropertyString] = None,
  jaasRealmName: Option[ConfigNodePropertyString] = None,
  idpName: Option[ConfigNodePropertyString] = None,
  syncHandlerName: Option[ConfigNodePropertyString] = None
)

