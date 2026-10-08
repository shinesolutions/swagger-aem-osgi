package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param serviceRanking  for example: ''null''
 * @param jaasControlFlag  for example: ''null''
 * @param jaasRealmName  for example: ''null''
 * @param jaasRanking  for example: ''null''
 * @param headers  for example: ''null''
 * @param cookies  for example: ''null''
 * @param parameters  for example: ''null''
 * @param usermap  for example: ''null''
 * @param format  for example: ''null''
 * @param trustedCredentialsAttribute  for example: ''null''
*/
final case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties (
  path: Option[ConfigNodePropertyString] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  jaasControlFlag: Option[ConfigNodePropertyString] = None,
  jaasRealmName: Option[ConfigNodePropertyString] = None,
  jaasRanking: Option[ConfigNodePropertyInteger] = None,
  headers: Option[ConfigNodePropertyArray] = None,
  cookies: Option[ConfigNodePropertyArray] = None,
  parameters: Option[ConfigNodePropertyArray] = None,
  usermap: Option[ConfigNodePropertyArray] = None,
  format: Option[ConfigNodePropertyString] = None,
  trustedCredentialsAttribute: Option[ConfigNodePropertyString] = None
)

