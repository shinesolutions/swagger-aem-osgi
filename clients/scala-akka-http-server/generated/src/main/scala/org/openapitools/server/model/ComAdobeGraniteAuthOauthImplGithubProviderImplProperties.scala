package org.openapitools.server.model


/**
 * @param oauthProviderId  for example: ''null''
 * @param oauthProviderGithubAuthorizationUrl  for example: ''null''
 * @param oauthProviderGithubTokenUrl  for example: ''null''
 * @param oauthProviderGithubProfileUrl  for example: ''null''
*/
final case class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties (
  oauthProviderId: Option[ConfigNodePropertyString] = None,
  oauthProviderGithubAuthorizationUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderGithubTokenUrl: Option[ConfigNodePropertyString] = None,
  oauthProviderGithubProfileUrl: Option[ConfigNodePropertyString] = None
)

