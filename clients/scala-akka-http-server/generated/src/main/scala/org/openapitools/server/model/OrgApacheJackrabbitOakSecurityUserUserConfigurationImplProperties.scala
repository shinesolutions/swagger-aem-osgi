package org.openapitools.server.model


/**
 * @param usersPath  for example: ''null''
 * @param groupsPath  for example: ''null''
 * @param systemRelativePath  for example: ''null''
 * @param defaultDepth  for example: ''null''
 * @param importBehavior  for example: ''null''
 * @param passwordHashAlgorithm  for example: ''null''
 * @param passwordHashIterations  for example: ''null''
 * @param passwordSaltSize  for example: ''null''
 * @param omitAdminPw  for example: ''null''
 * @param supportAutoSave  for example: ''null''
 * @param passwordMaxAge  for example: ''null''
 * @param initialPasswordChange  for example: ''null''
 * @param passwordHistorySize  for example: ''null''
 * @param passwordExpiryForAdmin  for example: ''null''
 * @param cacheExpiration  for example: ''null''
 * @param enableRFC7613UsercaseMappedProfile  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties (
  usersPath: Option[ConfigNodePropertyString] = None,
  groupsPath: Option[ConfigNodePropertyString] = None,
  systemRelativePath: Option[ConfigNodePropertyString] = None,
  defaultDepth: Option[ConfigNodePropertyInteger] = None,
  importBehavior: Option[ConfigNodePropertyDropDown] = None,
  passwordHashAlgorithm: Option[ConfigNodePropertyString] = None,
  passwordHashIterations: Option[ConfigNodePropertyInteger] = None,
  passwordSaltSize: Option[ConfigNodePropertyInteger] = None,
  omitAdminPw: Option[ConfigNodePropertyBoolean] = None,
  supportAutoSave: Option[ConfigNodePropertyBoolean] = None,
  passwordMaxAge: Option[ConfigNodePropertyInteger] = None,
  initialPasswordChange: Option[ConfigNodePropertyBoolean] = None,
  passwordHistorySize: Option[ConfigNodePropertyInteger] = None,
  passwordExpiryForAdmin: Option[ConfigNodePropertyBoolean] = None,
  cacheExpiration: Option[ConfigNodePropertyInteger] = None,
  enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean] = None
)

