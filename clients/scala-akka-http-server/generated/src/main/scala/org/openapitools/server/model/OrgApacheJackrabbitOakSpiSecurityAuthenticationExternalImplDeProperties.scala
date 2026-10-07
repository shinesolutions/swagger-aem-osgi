package org.openapitools.server.model


/**
 * @param handlerName  for example: ''null''
 * @param userExpirationTime  for example: ''null''
 * @param userAutoMembership  for example: ''null''
 * @param userPropertyMapping  for example: ''null''
 * @param userPathPrefix  for example: ''null''
 * @param userMembershipExpTime  for example: ''null''
 * @param userMembershipNestingDepth  for example: ''null''
 * @param userDynamicMembership  for example: ''null''
 * @param userDisableMissing  for example: ''null''
 * @param groupExpirationTime  for example: ''null''
 * @param groupAutoMembership  for example: ''null''
 * @param groupPropertyMapping  for example: ''null''
 * @param groupPathPrefix  for example: ''null''
 * @param enableRFC7613UsercaseMappedProfile  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties (
  handlerName: Option[ConfigNodePropertyString] = None,
  userExpirationTime: Option[ConfigNodePropertyString] = None,
  userAutoMembership: Option[ConfigNodePropertyArray] = None,
  userPropertyMapping: Option[ConfigNodePropertyArray] = None,
  userPathPrefix: Option[ConfigNodePropertyString] = None,
  userMembershipExpTime: Option[ConfigNodePropertyString] = None,
  userMembershipNestingDepth: Option[ConfigNodePropertyInteger] = None,
  userDynamicMembership: Option[ConfigNodePropertyBoolean] = None,
  userDisableMissing: Option[ConfigNodePropertyBoolean] = None,
  groupExpirationTime: Option[ConfigNodePropertyString] = None,
  groupAutoMembership: Option[ConfigNodePropertyArray] = None,
  groupPropertyMapping: Option[ConfigNodePropertyArray] = None,
  groupPathPrefix: Option[ConfigNodePropertyString] = None,
  enableRFC7613UsercaseMappedProfile: Option[ConfigNodePropertyBoolean] = None
)

