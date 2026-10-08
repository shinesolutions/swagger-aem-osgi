package org.openapitools.server.model


/**
 * @param servletresolverServletRoot  for example: ''null''
 * @param servletresolverCacheSize  for example: ''null''
 * @param servletresolverPaths  for example: ''null''
 * @param servletresolverDefaultExtensions  for example: ''null''
*/
final case class OrgApacheSlingServletsResolverSlingServletResolverProperties (
  servletresolverServletRoot: Option[ConfigNodePropertyString] = None,
  servletresolverCacheSize: Option[ConfigNodePropertyInteger] = None,
  servletresolverPaths: Option[ConfigNodePropertyArray] = None,
  servletresolverDefaultExtensions: Option[ConfigNodePropertyArray] = None
)

