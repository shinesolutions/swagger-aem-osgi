package org.openapitools.server.model


/**
 * @param slingServletMethods  for example: ''null''
 * @param slingServletPaths  for example: ''null''
*/
final case class OrgApacheSlingAuthCoreImplLogoutServletProperties (
  slingServletMethods: Option[ConfigNodePropertyArray] = None,
  slingServletPaths: Option[ConfigNodePropertyString] = None
)

