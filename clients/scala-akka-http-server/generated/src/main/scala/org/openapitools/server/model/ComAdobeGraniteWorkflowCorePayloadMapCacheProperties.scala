package org.openapitools.server.model


/**
 * @param getSystemWorkflowModels  for example: ''null''
 * @param getPackageRootPath  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties (
  getSystemWorkflowModels: Option[ConfigNodePropertyArray] = None,
  getPackageRootPath: Option[ConfigNodePropertyString] = None
)

