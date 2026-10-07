package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param configPath  for example: ''null''
 * @param fallbackPaths  for example: ''null''
 * @param configCollectionInheritancePropertyNames  for example: ''null''
*/
final case class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  configPath: Option[ConfigNodePropertyString] = None,
  fallbackPaths: Option[ConfigNodePropertyArray] = None,
  configCollectionInheritancePropertyNames: Option[ConfigNodePropertyArray] = None
)

