package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScheduledExporterImplScheduledExporterImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(
  includePaths: Option[ConfigNodePropertyArray],
  exporterUser: Option[ConfigNodePropertyString]
)

object ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {
  implicit lazy val comAdobeCqScheduledExporterImplScheduledExporterImplPropertiesJsonFormat: Format[ComAdobeCqScheduledExporterImplScheduledExporterImplProperties] = Json.format[ComAdobeCqScheduledExporterImplScheduledExporterImplProperties]
}

