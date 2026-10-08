package org.openapitools.server.model


/**
 * @param oauthCookieLoginTimeout  for example: ''null''
 * @param oauthCookieMaxAge  for example: ''null''
*/
final case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties (
  oauthCookieLoginTimeout: Option[ConfigNodePropertyString] = None,
  oauthCookieMaxAge: Option[ConfigNodePropertyString] = None
)

