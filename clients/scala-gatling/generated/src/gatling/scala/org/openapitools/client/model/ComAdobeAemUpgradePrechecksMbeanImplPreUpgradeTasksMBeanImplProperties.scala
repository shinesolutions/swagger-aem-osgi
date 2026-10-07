
package org.openapitools.client.model


case class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties (
    _preUpgradeMaintenanceTasks: Option[ConfigNodePropertyArray],
    _preUpgradeHcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
    def toStringBody(var_preUpgradeMaintenanceTasks: Object, var_preUpgradeHcTags: Object) =
        s"""
        | {
        | "preUpgradeMaintenanceTasks":$var_preUpgradeMaintenanceTasks,"preUpgradeHcTags":$var_preUpgradeHcTags
        | }
        """.stripMargin
}
