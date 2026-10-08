package org.openapitools.server.model


/**
 * @param auditlogRuleName  for example: ''null''
 * @param auditlogRuleContentpath  for example: ''null''
 * @param auditlogRuleMinimumage  for example: ''null''
 * @param auditlogRuleTypes  for example: ''null''
*/
final case class ComAdobeCqAuditPurgeDamProperties (
  auditlogRuleName: Option[ConfigNodePropertyString] = None,
  auditlogRuleContentpath: Option[ConfigNodePropertyString] = None,
  auditlogRuleMinimumage: Option[ConfigNodePropertyInteger] = None,
  auditlogRuleTypes: Option[ConfigNodePropertyDropDown] = None
)

