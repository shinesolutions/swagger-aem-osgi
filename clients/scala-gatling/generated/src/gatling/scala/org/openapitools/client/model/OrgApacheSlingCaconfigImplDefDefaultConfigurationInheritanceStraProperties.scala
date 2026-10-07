
package org.openapitools.client.model


case class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _configPropertyInheritancePropertyNames: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties {
    def toStringBody(var_enabled: Object, var_configPropertyInheritancePropertyNames: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"configPropertyInheritancePropertyNames":$var_configPropertyInheritancePropertyNames
        | }
        """.stripMargin
}
