package org.openapitools.server.model


/**
 * @param oauthProviderId  for example: ''null''
 * @param oauthCloudConfigRoot  for example: ''null''
 * @param providerConfigRoot  for example: ''null''
 * @param providerConfigCreateTagsEnabled  for example: ''null''
 * @param providerConfigUserFolder  for example: ''null''
 * @param providerConfigFacebookFetchFields  for example: ''null''
 * @param providerConfigFacebookFields  for example: ''null''
 * @param providerConfigRefreshUserdataEnabled  for example: ''null''
*/
final case class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties (
  oauthProviderId: Option[ConfigNodePropertyString] = None,
  oauthCloudConfigRoot: Option[ConfigNodePropertyString] = None,
  providerConfigRoot: Option[ConfigNodePropertyString] = None,
  providerConfigCreateTagsEnabled: Option[ConfigNodePropertyBoolean] = None,
  providerConfigUserFolder: Option[ConfigNodePropertyDropDown] = None,
  providerConfigFacebookFetchFields: Option[ConfigNodePropertyBoolean] = None,
  providerConfigFacebookFields: Option[ConfigNodePropertyArray] = None,
  providerConfigRefreshUserdataEnabled: Option[ConfigNodePropertyBoolean] = None
)

