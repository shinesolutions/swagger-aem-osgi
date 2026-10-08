package org.openapitools.server.model


/**
 * @param providerName  for example: ''null''
 * @param hostName  for example: ''null''
 * @param hostPort  for example: ''null''
 * @param hostSsl  for example: ''null''
 * @param hostTls  for example: ''null''
 * @param hostNoCertCheck  for example: ''null''
 * @param bindDn  for example: ''null''
 * @param bindPassword  for example: ''null''
 * @param searchTimeout  for example: ''null''
 * @param adminPoolMaxActive  for example: ''null''
 * @param adminPoolLookupOnValidate  for example: ''null''
 * @param userPoolMaxActive  for example: ''null''
 * @param userPoolLookupOnValidate  for example: ''null''
 * @param userBaseDN  for example: ''null''
 * @param userObjectclass  for example: ''null''
 * @param userIdAttribute  for example: ''null''
 * @param userExtraFilter  for example: ''null''
 * @param userMakeDnPath  for example: ''null''
 * @param groupBaseDN  for example: ''null''
 * @param groupObjectclass  for example: ''null''
 * @param groupNameAttribute  for example: ''null''
 * @param groupExtraFilter  for example: ''null''
 * @param groupMakeDnPath  for example: ''null''
 * @param groupMemberAttribute  for example: ''null''
 * @param useUidForExtId  for example: ''null''
 * @param customattributes  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties (
  providerName: Option[ConfigNodePropertyString] = None,
  hostName: Option[ConfigNodePropertyString] = None,
  hostPort: Option[ConfigNodePropertyInteger] = None,
  hostSsl: Option[ConfigNodePropertyBoolean] = None,
  hostTls: Option[ConfigNodePropertyBoolean] = None,
  hostNoCertCheck: Option[ConfigNodePropertyBoolean] = None,
  bindDn: Option[ConfigNodePropertyString] = None,
  bindPassword: Option[ConfigNodePropertyString] = None,
  searchTimeout: Option[ConfigNodePropertyString] = None,
  adminPoolMaxActive: Option[ConfigNodePropertyInteger] = None,
  adminPoolLookupOnValidate: Option[ConfigNodePropertyBoolean] = None,
  userPoolMaxActive: Option[ConfigNodePropertyInteger] = None,
  userPoolLookupOnValidate: Option[ConfigNodePropertyBoolean] = None,
  userBaseDN: Option[ConfigNodePropertyString] = None,
  userObjectclass: Option[ConfigNodePropertyArray] = None,
  userIdAttribute: Option[ConfigNodePropertyString] = None,
  userExtraFilter: Option[ConfigNodePropertyString] = None,
  userMakeDnPath: Option[ConfigNodePropertyBoolean] = None,
  groupBaseDN: Option[ConfigNodePropertyString] = None,
  groupObjectclass: Option[ConfigNodePropertyArray] = None,
  groupNameAttribute: Option[ConfigNodePropertyString] = None,
  groupExtraFilter: Option[ConfigNodePropertyString] = None,
  groupMakeDnPath: Option[ConfigNodePropertyBoolean] = None,
  groupMemberAttribute: Option[ConfigNodePropertyString] = None,
  useUidForExtId: Option[ConfigNodePropertyBoolean] = None,
  customattributes: Option[ConfigNodePropertyArray] = None
)

