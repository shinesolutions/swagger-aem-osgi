
package org.openapitools.client.model


case class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties (
    _batchCommitSize: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {
    def toStringBody(var_batchCommitSize: Object) =
        s"""
        | {
        | "batchCommitSize":$var_batchCommitSize
        | }
        """.stripMargin
}
