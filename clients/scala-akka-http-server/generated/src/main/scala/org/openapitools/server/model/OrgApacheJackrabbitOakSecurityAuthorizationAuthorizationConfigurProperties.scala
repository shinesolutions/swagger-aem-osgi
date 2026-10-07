package org.openapitools.server.model


/**
 * @param permissionsJr2  for example: ''null''
 * @param importBehavior  for example: ''null''
 * @param readPaths  for example: ''null''
 * @param administrativePrincipals  for example: ''null''
 * @param configurationRanking  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties (
  permissionsJr2: Option[ConfigNodePropertyDropDown] = None,
  importBehavior: Option[ConfigNodePropertyDropDown] = None,
  readPaths: Option[ConfigNodePropertyArray] = None,
  administrativePrincipals: Option[ConfigNodePropertyArray] = None,
  configurationRanking: Option[ConfigNodePropertyInteger] = None
)

