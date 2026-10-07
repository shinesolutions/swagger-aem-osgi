
package org.openapitools.client.model


case class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties (
    _providerRoots: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJmxProviderImplJMXResourceProviderProperties {
    def toStringBody(var_providerRoots: Object) =
        s"""
        | {
        | "providerRoots":$var_providerRoots
        | }
        """.stripMargin
}
