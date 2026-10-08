package org.openapitools.server.model


/**
 * @param oauthConfigId  for example: ''null''
 * @param oauthClientId  for example: ''null''
 * @param oauthClientSecret  for example: ''null''
 * @param oauthScope  for example: ''null''
 * @param oauthConfigProviderId  for example: ''null''
 * @param oauthCreateUsers  for example: ''null''
 * @param oauthUseridProperty  for example: ''null''
 * @param forceStrictUsernameMatching  for example: ''null''
 * @param oauthEncodeUserids  for example: ''null''
 * @param oauthHashUserids  for example: ''null''
 * @param oauthCallBackUrl  for example: ''null''
 * @param oauthAccessTokenPersist  for example: ''null''
 * @param oauthAccessTokenPersistCookie  for example: ''null''
 * @param oauthCsrfStateProtection  for example: ''null''
 * @param oauthRedirectRequestParams  for example: ''null''
 * @param oauthConfigSiblingsAllow  for example: ''null''
*/
final case class ComAdobeGraniteAuthOauthProviderProperties (
  oauthConfigId: Option[ConfigNodePropertyString] = None,
  oauthClientId: Option[ConfigNodePropertyString] = None,
  oauthClientSecret: Option[ConfigNodePropertyString] = None,
  oauthScope: Option[ConfigNodePropertyArray] = None,
  oauthConfigProviderId: Option[ConfigNodePropertyString] = None,
  oauthCreateUsers: Option[ConfigNodePropertyBoolean] = None,
  oauthUseridProperty: Option[ConfigNodePropertyString] = None,
  forceStrictUsernameMatching: Option[ConfigNodePropertyBoolean] = None,
  oauthEncodeUserids: Option[ConfigNodePropertyBoolean] = None,
  oauthHashUserids: Option[ConfigNodePropertyBoolean] = None,
  oauthCallBackUrl: Option[ConfigNodePropertyString] = None,
  oauthAccessTokenPersist: Option[ConfigNodePropertyBoolean] = None,
  oauthAccessTokenPersistCookie: Option[ConfigNodePropertyBoolean] = None,
  oauthCsrfStateProtection: Option[ConfigNodePropertyBoolean] = None,
  oauthRedirectRequestParams: Option[ConfigNodePropertyBoolean] = None,
  oauthConfigSiblingsAllow: Option[ConfigNodePropertyBoolean] = None
)

