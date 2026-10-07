
package org.openapitools.client.model


case class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties (
    _hcName: Option[ConfigNodePropertyString],
    _hcTags: Option[ConfigNodePropertyArray],
    _hcMbeanName: Option[ConfigNodePropertyString]
)
object ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties {
    def toStringBody(var_hcName: Object, var_hcTags: Object, var_hcMbeanName: Object) =
        s"""
        | {
        | "hcName":$var_hcName,"hcTags":$var_hcTags,"hcMbeanName":$var_hcMbeanName
        | }
        """.stripMargin
}
