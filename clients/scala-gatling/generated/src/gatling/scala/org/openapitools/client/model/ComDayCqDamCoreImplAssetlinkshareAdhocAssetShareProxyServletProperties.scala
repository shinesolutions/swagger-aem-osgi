
package org.openapitools.client.model


case class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties (
    _cqDamAdhocAssetSharePrezipMaxcontentsize: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {
    def toStringBody(var_cqDamAdhocAssetSharePrezipMaxcontentsize: Object) =
        s"""
        | {
        | "cqDamAdhocAssetSharePrezipMaxcontentsize":$var_cqDamAdhocAssetSharePrezipMaxcontentsize
        | }
        """.stripMargin
}
