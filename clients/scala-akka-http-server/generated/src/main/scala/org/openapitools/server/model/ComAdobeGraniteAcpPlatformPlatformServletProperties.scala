package org.openapitools.server.model


/**
 * @param queryLimit  for example: ''null''
 * @param fileTypeExtensionMap  for example: ''null''
*/
final case class ComAdobeGraniteAcpPlatformPlatformServletProperties (
  queryLimit: Option[ConfigNodePropertyInteger] = None,
  fileTypeExtensionMap: Option[ConfigNodePropertyArray] = None
)

