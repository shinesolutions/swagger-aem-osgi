package org.openapitools.server.model


/**
 * @param maxConnections  for example: ''null''
 * @param maxRequests  for example: ''null''
 * @param requestTimeout  for example: ''null''
 * @param requestRetries  for example: ''null''
 * @param launchTimeout  for example: ''null''
*/
final case class ComAdobeOctopusNcommBootstrapProperties (
  maxConnections: Option[ConfigNodePropertyInteger] = None,
  maxRequests: Option[ConfigNodePropertyInteger] = None,
  requestTimeout: Option[ConfigNodePropertyInteger] = None,
  requestRetries: Option[ConfigNodePropertyInteger] = None,
  launchTimeout: Option[ConfigNodePropertyInteger] = None
)

