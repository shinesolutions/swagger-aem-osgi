
package org.openapitools.client.model


case class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties (
    _cqDamImageCacheMaxMemory: Option[ConfigNodePropertyInteger],
    _cqDamImageCacheMaxAge: Option[ConfigNodePropertyInteger],
    _cqDamImageCacheMaxDimension: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
    def toStringBody(var_cqDamImageCacheMaxMemory: Object, var_cqDamImageCacheMaxAge: Object, var_cqDamImageCacheMaxDimension: Object) =
        s"""
        | {
        | "cqDamImageCacheMaxMemory":$var_cqDamImageCacheMaxMemory,"cqDamImageCacheMaxAge":$var_cqDamImageCacheMaxAge,"cqDamImageCacheMaxDimension":$var_cqDamImageCacheMaxDimension
        | }
        """.stripMargin
}
