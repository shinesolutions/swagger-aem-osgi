
package org.openapitools.client.model


case class ComDayCqDamCoreProcessMetadataProcessorProcessProperties (
    _processLabel: Option[ConfigNodePropertyString],
    _cqDamEnableSha1: Option[ConfigNodePropertyBoolean],
    _cqDamMetadataXssprotectedProperties: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreProcessMetadataProcessorProcessProperties {
    def toStringBody(var_processLabel: Object, var_cqDamEnableSha1: Object, var_cqDamMetadataXssprotectedProperties: Object) =
        s"""
        | {
        | "processLabel":$var_processLabel,"cqDamEnableSha1":$var_cqDamEnableSha1,"cqDamMetadataXssprotectedProperties":$var_cqDamMetadataXssprotectedProperties
        | }
        """.stripMargin
}
