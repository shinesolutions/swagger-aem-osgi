
package org.openapitools.client.model


case class ComDayCqDamCommonsHandlerStandardImageHandlerProperties (
    _largeFileThreshold: Option[ConfigNodePropertyInteger],
    _largeCommentThreshold: Option[ConfigNodePropertyInteger],
    _cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
    def toStringBody(var_largeFileThreshold: Object, var_largeCommentThreshold: Object, var_cqDamEnableExtMetaExtraction: Object) =
        s"""
        | {
        | "largeFileThreshold":$var_largeFileThreshold,"largeCommentThreshold":$var_largeCommentThreshold,"cqDamEnableExtMetaExtraction":$var_cqDamEnableExtMetaExtraction
        | }
        """.stripMargin
}
