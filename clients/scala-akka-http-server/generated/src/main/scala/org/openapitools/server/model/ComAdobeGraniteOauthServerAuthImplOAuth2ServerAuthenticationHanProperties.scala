package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param jaasControlFlag  for example: ''null''
 * @param jaasRealmName  for example: ''null''
 * @param jaasRanking  for example: ''null''
 * @param oauthOfflineValidation  for example: ''null''
*/
final case class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties (
  path: Option[ConfigNodePropertyString] = None,
  jaasControlFlag: Option[ConfigNodePropertyString] = None,
  jaasRealmName: Option[ConfigNodePropertyString] = None,
  jaasRanking: Option[ConfigNodePropertyInteger] = None,
  oauthOfflineValidation: Option[ConfigNodePropertyBoolean] = None
)

