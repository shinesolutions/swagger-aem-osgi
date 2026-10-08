
package org.openapitools.client.model


case class ComDayCqDamCommonsUtilImplAssetCacheImplProperties (
    _largeFileMin: Option[ConfigNodePropertyInteger],
    _cacheApply: Option[ConfigNodePropertyBoolean],
    _mimeTypes: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
    def toStringBody(var_largeFileMin: Object, var_cacheApply: Object, var_mimeTypes: Object) =
        s"""
        | {
        | "largeFileMin":$var_largeFileMin,"cacheApply":$var_cacheApply,"mimeTypes":$var_mimeTypes
        | }
        """.stripMargin
}
