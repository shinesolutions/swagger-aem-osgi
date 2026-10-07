
package org.openapitools.client.model


case class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties (
    _javaNamingFactoryInitial: Option[ConfigNodePropertyString],
    _javaNamingProviderUrl: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {
    def toStringBody(var_javaNamingFactoryInitial: Object, var_javaNamingProviderUrl: Object) =
        s"""
        | {
        | "javaNamingFactoryInitial":$var_javaNamingFactoryInitial,"javaNamingProviderUrl":$var_javaNamingProviderUrl
        | }
        """.stripMargin
}
