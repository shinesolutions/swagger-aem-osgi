
package org.openapitools.client.model


case class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties (
    _packageRoots: Option[ConfigNodePropertyArray]
)
object OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {
    def toStringBody(var_packageRoots: Object) =
        s"""
        | {
        | "packageRoots":$var_packageRoots
        | }
        """.stripMargin
}
