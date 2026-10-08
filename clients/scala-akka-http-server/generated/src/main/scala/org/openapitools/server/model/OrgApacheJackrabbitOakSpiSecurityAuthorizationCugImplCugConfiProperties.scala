package org.openapitools.server.model


/**
 * @param cugSupportedPaths  for example: ''null''
 * @param cugEnabled  for example: ''null''
 * @param configurationRanking  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties (
  cugSupportedPaths: Option[ConfigNodePropertyArray] = None,
  cugEnabled: Option[ConfigNodePropertyBoolean] = None,
  configurationRanking: Option[ConfigNodePropertyInteger] = None
)

