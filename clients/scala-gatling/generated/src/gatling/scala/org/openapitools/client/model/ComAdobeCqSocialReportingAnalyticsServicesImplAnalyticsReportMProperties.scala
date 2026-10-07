
package org.openapitools.client.model


case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties (
    _reportFetchDelay: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties {
    def toStringBody(var_reportFetchDelay: Object) =
        s"""
        | {
        | "reportFetchDelay":$var_reportFetchDelay
        | }
        """.stripMargin
}
