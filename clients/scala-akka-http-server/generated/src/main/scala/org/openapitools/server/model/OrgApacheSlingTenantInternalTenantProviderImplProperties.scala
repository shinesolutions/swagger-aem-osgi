package org.openapitools.server.model


/**
 * @param tenantRoot  for example: ''null''
 * @param tenantPathMatcher  for example: ''null''
*/
final case class OrgApacheSlingTenantInternalTenantProviderImplProperties (
  tenantRoot: Option[ConfigNodePropertyString] = None,
  tenantPathMatcher: Option[ConfigNodePropertyArray] = None
)

