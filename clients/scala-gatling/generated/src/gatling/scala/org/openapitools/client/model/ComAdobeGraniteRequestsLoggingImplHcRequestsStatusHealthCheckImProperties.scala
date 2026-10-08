
package org.openapitools.client.model


case class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
