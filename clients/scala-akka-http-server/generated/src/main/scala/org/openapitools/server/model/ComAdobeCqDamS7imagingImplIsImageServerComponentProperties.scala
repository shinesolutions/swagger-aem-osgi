package org.openapitools.server.model


/**
 * @param tcpPort  for example: ''null''
 * @param allowRemoteAccess  for example: ''null''
 * @param maxRenderRgnPixels  for example: ''null''
 * @param maxMessageSize  for example: ''null''
 * @param randomAccessUrlTimeout  for example: ''null''
 * @param workerThreads  for example: ''null''
*/
final case class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties (
  tcpPort: Option[ConfigNodePropertyString] = None,
  allowRemoteAccess: Option[ConfigNodePropertyBoolean] = None,
  maxRenderRgnPixels: Option[ConfigNodePropertyString] = None,
  maxMessageSize: Option[ConfigNodePropertyString] = None,
  randomAccessUrlTimeout: Option[ConfigNodePropertyInteger] = None,
  workerThreads: Option[ConfigNodePropertyInteger] = None
)

