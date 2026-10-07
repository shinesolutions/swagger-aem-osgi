
package org.openapitools.client.model


case class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties (
    _cqDamAllowAllMime: Option[ConfigNodePropertyBoolean],
    _cqDamAllowedAssetMimes: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {
    def toStringBody(var_cqDamAllowAllMime: Object, var_cqDamAllowedAssetMimes: Object) =
        s"""
        | {
        | "cqDamAllowAllMime":$var_cqDamAllowAllMime,"cqDamAllowedAssetMimes":$var_cqDamAllowedAssetMimes
        | }
        """.stripMargin
}
