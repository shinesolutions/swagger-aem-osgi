
package org.openapitools.client.model


case class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties (
    _cqSocialConsoleAnalyticsSitesMapping: Option[ConfigNodePropertyArray],
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties {
    def toStringBody(var_cqSocialConsoleAnalyticsSitesMapping: Object, var_priority: Object) =
        s"""
        | {
        | "cqSocialConsoleAnalyticsSitesMapping":$var_cqSocialConsoleAnalyticsSitesMapping,"priority":$var_priority
        | }
        """.stripMargin
}
