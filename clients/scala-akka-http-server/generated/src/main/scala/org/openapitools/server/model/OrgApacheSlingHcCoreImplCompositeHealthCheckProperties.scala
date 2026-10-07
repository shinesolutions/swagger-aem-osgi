package org.openapitools.server.model


/**
 * @param hcName  for example: ''null''
 * @param hcTags  for example: ''null''
 * @param hcMbeanName  for example: ''null''
 * @param filterTags  for example: ''null''
 * @param filterCombineTagsWithOr  for example: ''null''
*/
final case class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties (
  hcName: Option[ConfigNodePropertyString] = None,
  hcTags: Option[ConfigNodePropertyArray] = None,
  hcMbeanName: Option[ConfigNodePropertyString] = None,
  filterTags: Option[ConfigNodePropertyArray] = None,
  filterCombineTagsWithOr: Option[ConfigNodePropertyBoolean] = None
)

