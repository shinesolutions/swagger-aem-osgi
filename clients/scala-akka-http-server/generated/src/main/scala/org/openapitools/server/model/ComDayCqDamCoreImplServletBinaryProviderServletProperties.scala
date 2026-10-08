package org.openapitools.server.model


/**
 * @param slingServletResourceTypes  for example: ''null''
 * @param slingServletMethods  for example: ''null''
 * @param cqDamDrmEnable  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletBinaryProviderServletProperties (
  slingServletResourceTypes: Option[ConfigNodePropertyArray] = None,
  slingServletMethods: Option[ConfigNodePropertyArray] = None,
  cqDamDrmEnable: Option[ConfigNodePropertyBoolean] = None
)

