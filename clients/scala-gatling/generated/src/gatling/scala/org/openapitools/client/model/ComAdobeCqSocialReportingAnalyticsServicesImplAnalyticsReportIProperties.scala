
package org.openapitools.client.model


case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties (
    _cqSocialReportingAnalyticsPollingImporterInterval: Option[ConfigNodePropertyInteger],
    _cqSocialReportingAnalyticsPollingImporterPageSize: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {
    def toStringBody(var_cqSocialReportingAnalyticsPollingImporterInterval: Object, var_cqSocialReportingAnalyticsPollingImporterPageSize: Object) =
        s"""
        | {
        | "cqSocialReportingAnalyticsPollingImporterInterval":$var_cqSocialReportingAnalyticsPollingImporterInterval,"cqSocialReportingAnalyticsPollingImporterPageSize":$var_cqSocialReportingAnalyticsPollingImporterPageSize
        | }
        """.stripMargin
}
