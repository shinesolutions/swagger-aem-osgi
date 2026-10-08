
package org.openapitools.client.model


case class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
