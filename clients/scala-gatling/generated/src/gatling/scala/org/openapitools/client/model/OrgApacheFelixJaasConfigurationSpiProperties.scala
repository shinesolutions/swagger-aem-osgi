
package org.openapitools.client.model


case class OrgApacheFelixJaasConfigurationSpiProperties (
    _jaasDefaultRealmName: Option[ConfigNodePropertyString],
    _jaasConfigProviderName: Option[ConfigNodePropertyString],
    _jaasGlobalConfigPolicy: Option[ConfigNodePropertyDropDown]
)
object OrgApacheFelixJaasConfigurationSpiProperties {
    def toStringBody(var_jaasDefaultRealmName: Object, var_jaasConfigProviderName: Object, var_jaasGlobalConfigPolicy: Object) =
        s"""
        | {
        | "jaasDefaultRealmName":$var_jaasDefaultRealmName,"jaasConfigProviderName":$var_jaasConfigProviderName,"jaasGlobalConfigPolicy":$var_jaasGlobalConfigPolicy
        | }
        """.stripMargin
}
