package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param serviceRanking  for example: ''null''
 * @param idpUrl  for example: ''null''
 * @param idpCertAlias  for example: ''null''
 * @param idpHttpRedirect  for example: ''null''
 * @param serviceProviderEntityId  for example: ''null''
 * @param assertionConsumerServiceURL  for example: ''null''
 * @param spPrivateKeyAlias  for example: ''null''
 * @param keyStorePassword  for example: ''null''
 * @param defaultRedirectUrl  for example: ''null''
 * @param userIDAttribute  for example: ''null''
 * @param useEncryption  for example: ''null''
 * @param createUser  for example: ''null''
 * @param userIntermediatePath  for example: ''null''
 * @param addGroupMemberships  for example: ''null''
 * @param groupMembershipAttribute  for example: ''null''
 * @param defaultGroups  for example: ''null''
 * @param nameIdFormat  for example: ''null''
 * @param synchronizeAttributes  for example: ''null''
 * @param handleLogout  for example: ''null''
 * @param logoutUrl  for example: ''null''
 * @param clockTolerance  for example: ''null''
 * @param digestMethod  for example: ''null''
 * @param signatureMethod  for example: ''null''
 * @param identitySyncType  for example: ''null''
 * @param idpIdentifier  for example: ''null''
*/
final case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties (
  path: Option[ConfigNodePropertyArray] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  idpUrl: Option[ConfigNodePropertyString] = None,
  idpCertAlias: Option[ConfigNodePropertyString] = None,
  idpHttpRedirect: Option[ConfigNodePropertyBoolean] = None,
  serviceProviderEntityId: Option[ConfigNodePropertyString] = None,
  assertionConsumerServiceURL: Option[ConfigNodePropertyString] = None,
  spPrivateKeyAlias: Option[ConfigNodePropertyString] = None,
  keyStorePassword: Option[ConfigNodePropertyString] = None,
  defaultRedirectUrl: Option[ConfigNodePropertyString] = None,
  userIDAttribute: Option[ConfigNodePropertyString] = None,
  useEncryption: Option[ConfigNodePropertyBoolean] = None,
  createUser: Option[ConfigNodePropertyBoolean] = None,
  userIntermediatePath: Option[ConfigNodePropertyString] = None,
  addGroupMemberships: Option[ConfigNodePropertyBoolean] = None,
  groupMembershipAttribute: Option[ConfigNodePropertyString] = None,
  defaultGroups: Option[ConfigNodePropertyArray] = None,
  nameIdFormat: Option[ConfigNodePropertyString] = None,
  synchronizeAttributes: Option[ConfigNodePropertyArray] = None,
  handleLogout: Option[ConfigNodePropertyBoolean] = None,
  logoutUrl: Option[ConfigNodePropertyString] = None,
  clockTolerance: Option[ConfigNodePropertyInteger] = None,
  digestMethod: Option[ConfigNodePropertyString] = None,
  signatureMethod: Option[ConfigNodePropertyString] = None,
  identitySyncType: Option[ConfigNodePropertyDropDown] = None,
  idpIdentifier: Option[ConfigNodePropertyString] = None
)

