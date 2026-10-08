package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeOctopusNcommBootstrapProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeOctopusNcommBootstrapProperties(
  maxConnections: Option[ConfigNodePropertyInteger],
  maxRequests: Option[ConfigNodePropertyInteger],
  requestTimeout: Option[ConfigNodePropertyInteger],
  requestRetries: Option[ConfigNodePropertyInteger],
  launchTimeout: Option[ConfigNodePropertyInteger]
)

object ComAdobeOctopusNcommBootstrapProperties {
  implicit lazy val comAdobeOctopusNcommBootstrapPropertiesJsonFormat: Format[ComAdobeOctopusNcommBootstrapProperties] = Json.format[ComAdobeOctopusNcommBootstrapProperties]
}

