
package org.openapitools.client.model


case class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties (
    _path: Option[ConfigNodePropertyString],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties {
    def toStringBody(var_path: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "path":$var_path,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
