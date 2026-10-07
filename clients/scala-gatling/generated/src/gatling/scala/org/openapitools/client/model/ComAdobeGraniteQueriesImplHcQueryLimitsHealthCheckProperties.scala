
package org.openapitools.client.model


case class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
