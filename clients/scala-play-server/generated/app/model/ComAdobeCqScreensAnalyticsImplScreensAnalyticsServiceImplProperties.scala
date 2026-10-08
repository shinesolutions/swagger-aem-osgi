package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(
  comAdobeCqScreensAnalyticsImplUrl: Option[ConfigNodePropertyString],
  comAdobeCqScreensAnalyticsImplApikey: Option[ConfigNodePropertyString],
  comAdobeCqScreensAnalyticsImplProject: Option[ConfigNodePropertyString],
  comAdobeCqScreensAnalyticsImplEnvironment: Option[ConfigNodePropertyDropDown],
  comAdobeCqScreensAnalyticsImplSendFrequency: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {
  implicit lazy val comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesJsonFormat: Format[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties] = Json.format[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties]
}

