
package org.openapitools.client.model


case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties (
    _whitelistName: Option[ConfigNodePropertyString],
    _whitelistBundles: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {
    def toStringBody(var_whitelistName: Object, var_whitelistBundles: Object) =
        s"""
        | {
        | "whitelistName":$var_whitelistName,"whitelistBundles":$var_whitelistBundles
        | }
        """.stripMargin
}
