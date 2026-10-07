package org.openapitools.server.model


/**
 * @param slingServletResourceTypes  for example: ''null''
 * @param slingServletMethods  for example: ''null''
 * @param slingServletExtensions  for example: ''null''
 * @param slingServletSelectors  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletMetadataGetServletProperties (
  slingServletResourceTypes: Option[ConfigNodePropertyString] = None,
  slingServletMethods: Option[ConfigNodePropertyString] = None,
  slingServletExtensions: Option[ConfigNodePropertyString] = None,
  slingServletSelectors: Option[ConfigNodePropertyString] = None
)

