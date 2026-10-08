
package org.openapitools.client.model


case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties (
    _whitelistBypass: Option[ConfigNodePropertyBoolean],
    _whitelistBundlesRegexp: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {
    def toStringBody(var_whitelistBypass: Object, var_whitelistBundlesRegexp: Object) =
        s"""
        | {
        | "whitelistBypass":$var_whitelistBypass,"whitelistBundlesRegexp":$var_whitelistBundlesRegexp
        | }
        """.stripMargin
}
