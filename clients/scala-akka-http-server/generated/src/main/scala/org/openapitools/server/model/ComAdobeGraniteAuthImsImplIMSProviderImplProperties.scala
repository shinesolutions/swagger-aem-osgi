package org.openapitools.server.model


/**
 * @param oauthProviderId  for example: ''null''
 * @param oauthProviderImsAuthorizationUrl  for example: ''null''
 * @param oauthProviderImsTokenUrl  for example: ''null''
 * @param oauthProviderImsProfileUrl  for example: ''null''
 * @param oauthProviderImsExtendedDetailsUrls  for example: ''null''
 * @param oauthProviderImsValidateTokenUrl  for example: ''null''
 * @param oauthProviderImsSessionProperty  for example: ''null''
 * @param oauthProviderImsServiceTokenClientId  for example: ''null''
 * @param oauthProviderImsServiceTokenClientSecret  for example: ''null''
 * @param oauthProviderImsServiceToken  for example: ''null''
 * @param imsOrgRef  for example: ''null''
 * @param imsGroupMapping  for example: ''null''
 * @param oauthProviderImsOnlyLicenseGroup  for example: ''null''
*/
final case class ComAdobeGraniteAuthImsImplIMSProviderImplProperties (
  oauthProviderId: Option[ConfigNodePropertyString] = None,
  oauthProviderImsAuthorizationUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderImsTokenUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderImsProfileUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderImsExtendedDetailsUrls: Option[ConfigNodePropertyArray] = None,
  oauthProviderImsValidateTokenUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderImsSessionProperty: Option[ConfigNodePropertyString] = None,
  oauthProviderImsServiceTokenClientId: Option[ConfigNodePropertyString] = None,
  oauthProviderImsServiceTokenClientSecret: Option[ConfigNodePropertyString] = None,
  oauthProviderImsServiceToken: Option[ConfigNodePropertyString] = None,
  imsOrgRef: Option[ConfigNodePropertyString] = None,
  imsGroupMapping: Option[ConfigNodePropertyArray] = None,
  oauthProviderImsOnlyLicenseGroup: Option[ConfigNodePropertyBoolean] = None
)

