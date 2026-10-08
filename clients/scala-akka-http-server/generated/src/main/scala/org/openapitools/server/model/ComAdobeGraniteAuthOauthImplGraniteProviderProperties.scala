package org.openapitools.server.model


/**
 * @param oauthProviderId  for example: ''null''
 * @param oauthProviderGraniteAuthorizationUrl  for example: ''null''
 * @param oauthProviderGraniteTokenUrl  for example: ''null''
 * @param oauthProviderGraniteProfileUrl  for example: ''null''
 * @param oauthProviderGraniteExtendedDetailsUrls  for example: ''null''
*/
final case class ComAdobeGraniteAuthOauthImplGraniteProviderProperties (
  oauthProviderId: Option[ConfigNodePropertyString] = None,
  oauthProviderGraniteAuthorizationUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderGraniteTokenUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderGraniteProfileUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderGraniteExtendedDetailsUrls: Option[ConfigNodePropertyString] = None
)

