
package org.openapitools.client.model


case class ComDayCqDamCoreProcessExtractMetadataProcessProperties (
    _processLabel: Option[ConfigNodePropertyString],
    _cqDamEnableSha1: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreProcessExtractMetadataProcessProperties {
    def toStringBody(var_processLabel: Object, var_cqDamEnableSha1: Object) =
        s"""
        | {
        | "processLabel":$var_processLabel,"cqDamEnableSha1":$var_cqDamEnableSha1
        | }
        """.stripMargin
}
