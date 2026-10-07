
package org.openapitools.client.model


case class ComDayCqDamCoreImplUnzipUnzipConfigProperties (
    _cqDamConfigUnzipMaxuncompressedsize: Option[ConfigNodePropertyInteger],
    _cqDamConfigUnzipEncoding: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplUnzipUnzipConfigProperties {
    def toStringBody(var_cqDamConfigUnzipMaxuncompressedsize: Object, var_cqDamConfigUnzipEncoding: Object) =
        s"""
        | {
        | "cqDamConfigUnzipMaxuncompressedsize":$var_cqDamConfigUnzipMaxuncompressedsize,"cqDamConfigUnzipEncoding":$var_cqDamConfigUnzipEncoding
        | }
        """.stripMargin
}
