
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletBatchMetadataServletProperties (
    _cqDamBatchMetadataAssetDefault: Option[ConfigNodePropertyArray],
    _cqDamBatchMetadataCollectionDefault: Option[ConfigNodePropertyArray],
    _cqDamBatchMetadataMaxresources: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplServletBatchMetadataServletProperties {
    def toStringBody(var_cqDamBatchMetadataAssetDefault: Object, var_cqDamBatchMetadataCollectionDefault: Object, var_cqDamBatchMetadataMaxresources: Object) =
        s"""
        | {
        | "cqDamBatchMetadataAssetDefault":$var_cqDamBatchMetadataAssetDefault,"cqDamBatchMetadataCollectionDefault":$var_cqDamBatchMetadataCollectionDefault,"cqDamBatchMetadataMaxresources":$var_cqDamBatchMetadataMaxresources
        | }
        """.stripMargin
}
