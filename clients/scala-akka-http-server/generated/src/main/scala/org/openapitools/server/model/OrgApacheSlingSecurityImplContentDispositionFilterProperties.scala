package org.openapitools.server.model


/**
 * @param slingContentDispositionPaths  for example: ''null''
 * @param slingContentDispositionExcludedPaths  for example: ''null''
 * @param slingContentDispositionAllPaths  for example: ''null''
*/
final case class OrgApacheSlingSecurityImplContentDispositionFilterProperties (
  slingContentDispositionPaths: Option[ConfigNodePropertyArray] = None,
  slingContentDispositionExcludedPaths: Option[ConfigNodePropertyArray] = None,
  slingContentDispositionAllPaths: Option[ConfigNodePropertyBoolean] = None
)

