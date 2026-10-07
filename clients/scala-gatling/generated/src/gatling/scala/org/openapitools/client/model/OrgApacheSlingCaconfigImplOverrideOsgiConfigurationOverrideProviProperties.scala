
package org.openapitools.client.model


case class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties (
    _description: Option[ConfigNodePropertyString],
    _overrides: Option[ConfigNodePropertyArray],
    _enabled: Option[ConfigNodePropertyBoolean],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {
    def toStringBody(var_description: Object, var_overrides: Object, var_enabled: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "description":$var_description,"overrides":$var_overrides,"enabled":$var_enabled,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
