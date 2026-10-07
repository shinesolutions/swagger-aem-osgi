
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties (
    _principalNames: Option[ConfigNodePropertyArray]
)
object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {
    def toStringBody(var_principalNames: Object) =
        s"""
        | {
        | "principalNames":$var_principalNames
        | }
        """.stripMargin
}
