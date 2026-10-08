
package org.openapitools.client.model


case class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties (
    _upgradeTaskIgnoreList: Option[ConfigNodePropertyArray]
)
object ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {
    def toStringBody(var_upgradeTaskIgnoreList: Object) =
        s"""
        | {
        | "upgradeTaskIgnoreList":$var_upgradeTaskIgnoreList
        | }
        """.stripMargin
}
