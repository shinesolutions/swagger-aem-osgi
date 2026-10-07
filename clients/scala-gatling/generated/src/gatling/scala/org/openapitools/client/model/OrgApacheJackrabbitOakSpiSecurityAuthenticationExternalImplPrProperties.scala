
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties (
    _protectExternalId: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {
    def toStringBody(var_protectExternalId: Object) =
        s"""
        | {
        | "protectExternalId":$var_protectExternalId
        | }
        """.stripMargin
}
