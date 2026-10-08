package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(
  cqSocialReportingAnalyticsPollingImporterInterval: Option[ConfigNodePropertyInteger],
  cqSocialReportingAnalyticsPollingImporterPageSize: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {
  implicit lazy val comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesJsonFormat: Format[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties] = Json.format[ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties]
}

