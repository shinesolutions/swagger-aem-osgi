
package org.openapitools.client.model


case class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties (
    _reportingservicesProxyWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {
    def toStringBody(var_reportingservicesProxyWhitelist: Object) =
        s"""
        | {
        | "reportingservicesProxyWhitelist":$var_reportingservicesProxyWhitelist
        | }
        """.stripMargin
}
