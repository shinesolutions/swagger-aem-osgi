
package org.openapitools.client.model


case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties (
    _maxConnections: Option[ConfigNodePropertyString],
    _maxRequests: Option[ConfigNodePropertyString],
    _requestTimeout: Option[ConfigNodePropertyString],
    _logDir: Option[ConfigNodePropertyString]
)
object ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {
    def toStringBody(var_maxConnections: Object, var_maxRequests: Object, var_requestTimeout: Object, var_logDir: Object) =
        s"""
        | {
        | "maxConnections":$var_maxConnections,"maxRequests":$var_maxRequests,"requestTimeout":$var_requestTimeout,"logDir":$var_logDir
        | }
        """.stripMargin
}
