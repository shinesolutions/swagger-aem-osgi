
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties (
    _enabledActions: Option[ConfigNodePropertyDropDown],
    _userPrivilegeNames: Option[ConfigNodePropertyArray],
    _groupPrivilegeNames: Option[ConfigNodePropertyArray],
    _constraint: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {
    def toStringBody(var_enabledActions: Object, var_userPrivilegeNames: Object, var_groupPrivilegeNames: Object, var_constraint: Object) =
        s"""
        | {
        | "enabledActions":$var_enabledActions,"userPrivilegeNames":$var_userPrivilegeNames,"groupPrivilegeNames":$var_groupPrivilegeNames,"constraint":$var_constraint
        | }
        """.stripMargin
}
