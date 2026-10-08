
package org.openapitools.client.model


case class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _configPath: Option[ConfigNodePropertyString],
    _fallbackPaths: Option[ConfigNodePropertyArray],
    _configCollectionInheritancePropertyNames: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {
    def toStringBody(var_enabled: Object, var_configPath: Object, var_fallbackPaths: Object, var_configCollectionInheritancePropertyNames: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"configPath":$var_configPath,"fallbackPaths":$var_fallbackPaths,"configCollectionInheritancePropertyNames":$var_configCollectionInheritancePropertyNames
        | }
        """.stripMargin
}
