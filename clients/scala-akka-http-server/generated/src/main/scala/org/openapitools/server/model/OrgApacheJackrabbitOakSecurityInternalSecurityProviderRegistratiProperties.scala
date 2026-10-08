package org.openapitools.server.model


/**
 * @param requiredServicePids  for example: ''null''
 * @param authorizationCompositionType  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties (
  requiredServicePids: Option[ConfigNodePropertyArray] = None,
  authorizationCompositionType: Option[ConfigNodePropertyDropDown] = None
)

