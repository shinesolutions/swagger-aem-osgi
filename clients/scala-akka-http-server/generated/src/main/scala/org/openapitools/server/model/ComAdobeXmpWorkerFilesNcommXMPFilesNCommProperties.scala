package org.openapitools.server.model


/**
 * @param maxConnections  for example: ''null''
 * @param maxRequests  for example: ''null''
 * @param requestTimeout  for example: ''null''
 * @param logDir  for example: ''null''
*/
final case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties (
  maxConnections: Option[ConfigNodePropertyString] = None,
  maxRequests: Option[ConfigNodePropertyString] = None,
  requestTimeout: Option[ConfigNodePropertyString] = None,
  logDir: Option[ConfigNodePropertyString] = None
)

