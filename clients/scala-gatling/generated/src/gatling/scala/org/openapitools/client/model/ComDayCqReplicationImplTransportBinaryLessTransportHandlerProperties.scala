
package org.openapitools.client.model


case class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties (
    _disabledCipherSuites: Option[ConfigNodePropertyArray],
    _enabledCipherSuites: Option[ConfigNodePropertyArray]
)
object ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties {
    def toStringBody(var_disabledCipherSuites: Object, var_enabledCipherSuites: Object) =
        s"""
        | {
        | "disabledCipherSuites":$var_disabledCipherSuites,"enabledCipherSuites":$var_enabledCipherSuites
        | }
        """.stripMargin
}
