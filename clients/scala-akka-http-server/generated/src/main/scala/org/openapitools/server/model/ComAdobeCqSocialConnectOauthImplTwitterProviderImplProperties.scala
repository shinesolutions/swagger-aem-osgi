package org.openapitools.server.model


/**
 * @param oauthProviderId  for example: ''null''
 * @param oauthCloudConfigRoot  for example: ''null''
 * @param providerConfigRoot  for example: ''null''
 * @param providerConfigUserFolder  for example: ''null''
 * @param providerConfigTwitterEnableParams  for example: ''null''
 * @param providerConfigTwitterParams  for example: ''null''
 * @param providerConfigRefreshUserdataEnabled  for example: ''null''
*/
final case class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties (
  oauthProviderId: Option[ConfigNodePropertyString] = None,
  oauthCloudConfigRoot: Option[ConfigNodePropertyString] = None,
  providerConfigRoot: Option[ConfigNodePropertyString] = None,
  providerConfigUserFolder: Option[ConfigNodePropertyDropDown] = None,
  providerConfigTwitterEnableParams: Option[ConfigNodePropertyBoolean] = None,
  providerConfigTwitterParams: Option[ConfigNodePropertyArray] = None,
  providerConfigRefreshUserdataEnabled: Option[ConfigNodePropertyBoolean] = None
)

