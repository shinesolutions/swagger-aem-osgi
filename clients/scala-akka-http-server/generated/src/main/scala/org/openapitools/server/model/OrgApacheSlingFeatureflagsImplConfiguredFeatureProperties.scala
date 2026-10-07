package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param enabled  for example: ''null''
*/
final case class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties (
  name: Option[ConfigNodePropertyString] = None,
  description: Option[ConfigNodePropertyString] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None
)

