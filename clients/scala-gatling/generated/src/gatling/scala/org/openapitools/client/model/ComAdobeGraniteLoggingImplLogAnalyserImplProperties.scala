
package org.openapitools.client.model


case class ComAdobeGraniteLoggingImplLogAnalyserImplProperties (
    _messagesQueueSize: Option[ConfigNodePropertyInteger],
    _loggerConfig: Option[ConfigNodePropertyArray],
    _messagesSize: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteLoggingImplLogAnalyserImplProperties {
    def toStringBody(var_messagesQueueSize: Object, var_loggerConfig: Object, var_messagesSize: Object) =
        s"""
        | {
        | "messagesQueueSize":$var_messagesQueueSize,"loggerConfig":$var_loggerConfig,"messagesSize":$var_messagesSize
        | }
        """.stripMargin
}
