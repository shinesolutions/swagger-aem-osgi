
package org.openapitools.client.model


case class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
