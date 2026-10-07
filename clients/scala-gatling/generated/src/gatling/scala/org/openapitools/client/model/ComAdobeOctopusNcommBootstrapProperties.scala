
package org.openapitools.client.model


case class ComAdobeOctopusNcommBootstrapProperties (
    _maxConnections: Option[ConfigNodePropertyInteger],
    _maxRequests: Option[ConfigNodePropertyInteger],
    _requestTimeout: Option[ConfigNodePropertyInteger],
    _requestRetries: Option[ConfigNodePropertyInteger],
    _launchTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeOctopusNcommBootstrapProperties {
    def toStringBody(var_maxConnections: Object, var_maxRequests: Object, var_requestTimeout: Object, var_requestRetries: Object, var_launchTimeout: Object) =
        s"""
        | {
        | "maxConnections":$var_maxConnections,"maxRequests":$var_maxRequests,"requestTimeout":$var_requestTimeout,"requestRetries":$var_requestRetries,"launchTimeout":$var_launchTimeout
        | }
        """.stripMargin
}
