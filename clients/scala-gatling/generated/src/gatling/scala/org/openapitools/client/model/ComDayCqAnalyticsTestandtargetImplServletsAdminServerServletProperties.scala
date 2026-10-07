
package org.openapitools.client.model


case class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties (
    _testandtargetEndpointUrl: Option[ConfigNodePropertyString]
)
object ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
    def toStringBody(var_testandtargetEndpointUrl: Object) =
        s"""
        | {
        | "testandtargetEndpointUrl":$var_testandtargetEndpointUrl
        | }
        """.stripMargin
}
