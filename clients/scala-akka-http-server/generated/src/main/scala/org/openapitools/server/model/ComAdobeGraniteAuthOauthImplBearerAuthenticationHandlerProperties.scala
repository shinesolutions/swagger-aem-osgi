package org.openapitools.server.model


/**
 * @param path  for example: ''null''
 * @param oauthClientIdsAllowed  for example: ''null''
 * @param authBearerSyncIms  for example: ''null''
 * @param authTokenRequestParameter  for example: ''null''
 * @param oauthBearerConfigid  for example: ''null''
 * @param oauthJwtSupport  for example: ''null''
*/
final case class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties (
  path: Option[ConfigNodePropertyString] = None,
  oauthClientIdsAllowed: Option[ConfigNodePropertyArray] = None,
  authBearerSyncIms: Option[ConfigNodePropertyBoolean] = None,
  authTokenRequestParameter: Option[ConfigNodePropertyString] = None,
  oauthBearerConfigid: Option[ConfigNodePropertyString] = None,
  oauthJwtSupport: Option[ConfigNodePropertyBoolean] = None
)

