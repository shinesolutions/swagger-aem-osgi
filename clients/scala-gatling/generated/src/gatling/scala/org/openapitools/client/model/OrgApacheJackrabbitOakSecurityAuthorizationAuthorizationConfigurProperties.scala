
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties (
    _permissionsJr2: Option[ConfigNodePropertyDropDown],
    _importBehavior: Option[ConfigNodePropertyDropDown],
    _readPaths: Option[ConfigNodePropertyArray],
    _administrativePrincipals: Option[ConfigNodePropertyArray],
    _configurationRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
    def toStringBody(var_permissionsJr2: Object, var_importBehavior: Object, var_readPaths: Object, var_administrativePrincipals: Object, var_configurationRanking: Object) =
        s"""
        | {
        | "permissionsJr2":$var_permissionsJr2,"importBehavior":$var_importBehavior,"readPaths":$var_readPaths,"administrativePrincipals":$var_administrativePrincipals,"configurationRanking":$var_configurationRanking
        | }
        """.stripMargin
}
