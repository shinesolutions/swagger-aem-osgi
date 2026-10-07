package org.openapitools.server.model


/**
 * @param hcName  for example: ''null''
 * @param hcTags  for example: ''null''
 * @param hcMbeanName  for example: ''null''
*/
final case class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties (
  hcName: Option[ConfigNodePropertyString] = None,
  hcTags: Option[ConfigNodePropertyArray] = None,
  hcMbeanName: Option[ConfigNodePropertyString] = None
)

