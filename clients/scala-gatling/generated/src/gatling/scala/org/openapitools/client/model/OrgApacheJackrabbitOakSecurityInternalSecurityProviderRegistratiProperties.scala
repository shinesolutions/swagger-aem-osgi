
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties (
    _requiredServicePids: Option[ConfigNodePropertyArray],
    _authorizationCompositionType: Option[ConfigNodePropertyDropDown]
)
object OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {
    def toStringBody(var_requiredServicePids: Object, var_authorizationCompositionType: Object) =
        s"""
        | {
        | "requiredServicePids":$var_requiredServicePids,"authorizationCompositionType":$var_authorizationCompositionType
        | }
        """.stripMargin
}
