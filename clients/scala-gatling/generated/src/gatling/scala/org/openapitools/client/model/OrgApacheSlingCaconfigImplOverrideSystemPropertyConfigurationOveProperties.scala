
package org.openapitools.client.model


case class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {
    def toStringBody(var_enabled: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
