
package org.openapitools.client.model


case class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties (
    _getPeriod: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties {
    def toStringBody(var_getPeriod: Object) =
        s"""
        | {
        | "getPeriod":$var_getPeriod
        | }
        """.stripMargin
}
