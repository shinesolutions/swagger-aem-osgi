
package org.openapitools.client.model


case class ComAdobeCqAuditPurgeReplicationProperties (
    _auditlogRuleName: Option[ConfigNodePropertyString],
    _auditlogRuleContentpath: Option[ConfigNodePropertyString],
    _auditlogRuleMinimumage: Option[ConfigNodePropertyInteger],
    _auditlogRuleTypes: Option[ConfigNodePropertyDropDown]
)
object ComAdobeCqAuditPurgeReplicationProperties {
    def toStringBody(var_auditlogRuleName: Object, var_auditlogRuleContentpath: Object, var_auditlogRuleMinimumage: Object, var_auditlogRuleTypes: Object) =
        s"""
        | {
        | "auditlogRuleName":$var_auditlogRuleName,"auditlogRuleContentpath":$var_auditlogRuleContentpath,"auditlogRuleMinimumage":$var_auditlogRuleMinimumage,"auditlogRuleTypes":$var_auditlogRuleTypes
        | }
        """.stripMargin
}
