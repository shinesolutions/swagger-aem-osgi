package org.openapitools.server.model


/**
 * @param slingServletSelectors  for example: ''null''
 * @param ecmaSuport  for example: ''null''
*/
final case class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties (
  slingServletSelectors: Option[ConfigNodePropertyArray] = None,
  ecmaSuport: Option[ConfigNodePropertyBoolean] = None
)

