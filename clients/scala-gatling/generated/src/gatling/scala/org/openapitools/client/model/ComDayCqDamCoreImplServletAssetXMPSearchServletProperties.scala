
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties (
    _cqDamBatchIndesignMaxassets: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {
    def toStringBody(var_cqDamBatchIndesignMaxassets: Object) =
        s"""
        | {
        | "cqDamBatchIndesignMaxassets":$var_cqDamBatchIndesignMaxassets
        | }
        """.stripMargin
}
