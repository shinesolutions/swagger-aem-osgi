
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletAssetStatusServletProperties (
    _cqDamBatchStatusMaxassets: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplServletAssetStatusServletProperties {
    def toStringBody(var_cqDamBatchStatusMaxassets: Object) =
        s"""
        | {
        | "cqDamBatchStatusMaxassets":$var_cqDamBatchStatusMaxassets
        | }
        """.stripMargin
}
