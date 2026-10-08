package org.openapitools.server.model


/**
 * @param tokenExpiration  for example: ''null''
 * @param tokenLength  for example: ''null''
 * @param tokenRefresh  for example: ''null''
 * @param tokenCleanupThreshold  for example: ''null''
 * @param passwordHashAlgorithm  for example: ''null''
 * @param passwordHashIterations  for example: ''null''
 * @param passwordSaltSize  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties (
  tokenExpiration: Option[ConfigNodePropertyString] = None,
  tokenLength: Option[ConfigNodePropertyString] = None,
  tokenRefresh: Option[ConfigNodePropertyBoolean] = None,
  tokenCleanupThreshold: Option[ConfigNodePropertyInteger] = None,
  passwordHashAlgorithm: Option[ConfigNodePropertyString] = None,
  passwordHashIterations: Option[ConfigNodePropertyInteger] = None,
  passwordSaltSize: Option[ConfigNodePropertyInteger] = None
)

