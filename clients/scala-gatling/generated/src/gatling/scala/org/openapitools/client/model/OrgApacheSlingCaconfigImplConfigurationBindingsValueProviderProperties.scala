
package org.openapitools.client.model


case class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
