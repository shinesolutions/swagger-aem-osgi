package org.openapitools.server.model


/**
 * @param hcName  for example: ''null''
 * @param hcTags  for example: ''null''
 * @param hcMbeanName  for example: ''null''
 * @param mbeanName  for example: ''null''
 * @param attributeName  for example: ''null''
 * @param attributeValueConstraint  for example: ''null''
*/
final case class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties (
  hcName: Option[ConfigNodePropertyString] = None,
  hcTags: Option[ConfigNodePropertyArray] = None,
  hcMbeanName: Option[ConfigNodePropertyString] = None,
  mbeanName: Option[ConfigNodePropertyString] = None,
  attributeName: Option[ConfigNodePropertyString] = None,
  attributeValueConstraint: Option[ConfigNodePropertyString] = None
)

