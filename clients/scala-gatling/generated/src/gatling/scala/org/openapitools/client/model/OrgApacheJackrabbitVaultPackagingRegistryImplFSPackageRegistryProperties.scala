
package org.openapitools.client.model


case class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties (
    _homePath: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties {
    def toStringBody(var_homePath: Object) =
        s"""
        | {
        | "homePath":$var_homePath
        | }
        """.stripMargin
}
