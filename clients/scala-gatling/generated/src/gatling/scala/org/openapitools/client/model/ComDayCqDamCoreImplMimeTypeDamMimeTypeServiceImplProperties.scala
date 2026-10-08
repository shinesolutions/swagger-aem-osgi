
package org.openapitools.client.model


case class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties (
    _cqDamDetectAssetMimeFromContent: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {
    def toStringBody(var_cqDamDetectAssetMimeFromContent: Object) =
        s"""
        | {
        | "cqDamDetectAssetMimeFromContent":$var_cqDamDetectAssetMimeFromContent
        | }
        """.stripMargin
}
