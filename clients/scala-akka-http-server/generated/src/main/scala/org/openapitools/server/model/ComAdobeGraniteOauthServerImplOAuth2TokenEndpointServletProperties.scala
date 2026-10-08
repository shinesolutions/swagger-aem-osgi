package org.openapitools.server.model


/**
 * @param oauthIssuer  for example: ''null''
 * @param oauthAccessTokenExpiresIn  for example: ''null''
 * @param osgiHttpWhiteboardServletPattern  for example: ''null''
 * @param osgiHttpWhiteboardContextSelect  for example: ''null''
*/
final case class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties (
  oauthIssuer: Option[ConfigNodePropertyString] = None,
  oauthAccessTokenExpiresIn: Option[ConfigNodePropertyString] = None,
  osgiHttpWhiteboardServletPattern: Option[ConfigNodePropertyString] = None,
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString] = None
)

