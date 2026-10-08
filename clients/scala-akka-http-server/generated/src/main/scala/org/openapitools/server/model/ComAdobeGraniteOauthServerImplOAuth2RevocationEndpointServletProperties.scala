package org.openapitools.server.model


/**
 * @param slingServletPaths  for example: ''null''
 * @param oauthRevocationActive  for example: ''null''
*/
final case class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties (
  slingServletPaths: Option[ConfigNodePropertyString] = None,
  oauthRevocationActive: Option[ConfigNodePropertyBoolean] = None
)

