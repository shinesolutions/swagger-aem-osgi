package org.openapitools.server.model


/**
 * @param hcName  for example: ''null''
 * @param hcTags  for example: ''null''
 * @param hcMbeanName  for example: ''null''
 * @param expression  for example: ''null''
 * @param languageExtension  for example: ''null''
*/
final case class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties (
  hcName: Option[ConfigNodePropertyString] = None,
  hcTags: Option[ConfigNodePropertyArray] = None,
  hcMbeanName: Option[ConfigNodePropertyString] = None,
  expression: Option[ConfigNodePropertyString] = None,
  languageExtension: Option[ConfigNodePropertyString] = None
)

