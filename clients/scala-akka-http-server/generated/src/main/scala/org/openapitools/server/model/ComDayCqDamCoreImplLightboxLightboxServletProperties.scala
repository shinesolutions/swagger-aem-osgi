package org.openapitools.server.model


/**
 * @param slingServletPaths  for example: ''null''
 * @param slingServletMethods  for example: ''null''
 * @param cqDamEnableAnonymous  for example: ''null''
*/
final case class ComDayCqDamCoreImplLightboxLightboxServletProperties (
  slingServletPaths: Option[ConfigNodePropertyString] = None,
  slingServletMethods: Option[ConfigNodePropertyArray] = None,
  cqDamEnableAnonymous: Option[ConfigNodePropertyBoolean] = None
)

