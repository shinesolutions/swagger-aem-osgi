
package org.openapitools.client.model


case class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _configRefResourceNames: Option[ConfigNodePropertyArray],
    _configRefPropertyNames: Option[ConfigNodePropertyArray],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    def toStringBody(var_enabled: Object, var_configRefResourceNames: Object, var_configRefPropertyNames: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"configRefResourceNames":$var_configRefResourceNames,"configRefPropertyNames":$var_configRefPropertyNames,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
