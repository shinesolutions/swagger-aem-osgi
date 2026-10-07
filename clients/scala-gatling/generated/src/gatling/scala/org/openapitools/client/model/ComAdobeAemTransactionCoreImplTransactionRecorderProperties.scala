
package org.openapitools.client.model


case class ComAdobeAemTransactionCoreImplTransactionRecorderProperties (
    _isTransactionRecordingEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeAemTransactionCoreImplTransactionRecorderProperties {
    def toStringBody(var_isTransactionRecordingEnabled: Object) =
        s"""
        | {
        | "isTransactionRecordingEnabled":$var_isTransactionRecordingEnabled
        | }
        """.stripMargin
}
