package org.openapitools.server.model


/**
 * @param description  for example: ''null''
 * @param overrides  for example: ''null''
 * @param enabled  for example: ''null''
 * @param serviceRanking  for example: ''null''
*/
final case class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties (
  description: Option[ConfigNodePropertyString] = None,
  overrides: Option[ConfigNodePropertyArray] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None
)

