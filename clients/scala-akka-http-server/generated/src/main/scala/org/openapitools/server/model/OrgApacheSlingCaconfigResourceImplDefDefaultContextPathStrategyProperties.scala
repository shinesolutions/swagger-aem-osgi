package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param configRefResourceNames  for example: ''null''
 * @param configRefPropertyNames  for example: ''null''
 * @param serviceRanking  for example: ''null''
*/
final case class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  configRefResourceNames: Option[ConfigNodePropertyArray] = None,
  configRefPropertyNames: Option[ConfigNodePropertyArray] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None
)

