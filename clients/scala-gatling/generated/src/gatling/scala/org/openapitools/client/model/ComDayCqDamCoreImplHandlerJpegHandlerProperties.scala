
package org.openapitools.client.model


case class ComDayCqDamCoreImplHandlerJpegHandlerProperties (
    _cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean],
    _largeFileThreshold: Option[ConfigNodePropertyInteger],
    _largeCommentThreshold: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplHandlerJpegHandlerProperties {
    def toStringBody(var_cqDamEnableExtMetaExtraction: Object, var_largeFileThreshold: Object, var_largeCommentThreshold: Object) =
        s"""
        | {
        | "cqDamEnableExtMetaExtraction":$var_cqDamEnableExtMetaExtraction,"largeFileThreshold":$var_largeFileThreshold,"largeCommentThreshold":$var_largeCommentThreshold
        | }
        """.stripMargin
}
