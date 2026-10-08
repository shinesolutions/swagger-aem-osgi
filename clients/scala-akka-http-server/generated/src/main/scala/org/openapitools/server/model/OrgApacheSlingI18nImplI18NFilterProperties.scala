package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param slingFilterScope  for example: ''null''
*/
final case class OrgApacheSlingI18nImplI18NFilterProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  slingFilterScope: Option[ConfigNodePropertyArray] = None
)

