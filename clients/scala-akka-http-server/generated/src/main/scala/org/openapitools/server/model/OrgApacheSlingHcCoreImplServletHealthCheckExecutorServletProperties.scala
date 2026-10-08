package org.openapitools.server.model


/**
 * @param servletPath  for example: ''null''
 * @param disabled  for example: ''null''
 * @param corsAccessControlAllowOrigin  for example: ''null''
*/
final case class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties (
  servletPath: Option[ConfigNodePropertyString] = None,
  disabled: Option[ConfigNodePropertyBoolean] = None,
  corsAccessControlAllowOrigin: Option[ConfigNodePropertyString] = None
)

