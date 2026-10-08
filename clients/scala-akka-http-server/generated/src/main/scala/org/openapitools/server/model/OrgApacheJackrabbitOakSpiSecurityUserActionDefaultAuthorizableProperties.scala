package org.openapitools.server.model


/**
 * @param enabledActions  for example: ''null''
 * @param userPrivilegeNames  for example: ''null''
 * @param groupPrivilegeNames  for example: ''null''
 * @param constraint  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties (
  enabledActions: Option[ConfigNodePropertyDropDown] = None,
  userPrivilegeNames: Option[ConfigNodePropertyArray] = None,
  groupPrivilegeNames: Option[ConfigNodePropertyArray] = None,
  constraint: Option[ConfigNodePropertyString] = None
)

