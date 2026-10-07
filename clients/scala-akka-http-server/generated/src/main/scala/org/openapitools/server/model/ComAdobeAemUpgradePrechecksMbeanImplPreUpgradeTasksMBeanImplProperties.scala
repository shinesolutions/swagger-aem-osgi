package org.openapitools.server.model


/**
 * @param preUpgradeMaintenanceTasks  for example: ''null''
 * @param preUpgradeHcTags  for example: ''null''
*/
final case class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties (
  preUpgradeMaintenanceTasks: Option[ConfigNodePropertyArray] = None,
  preUpgradeHcTags: Option[ConfigNodePropertyArray] = None
)

