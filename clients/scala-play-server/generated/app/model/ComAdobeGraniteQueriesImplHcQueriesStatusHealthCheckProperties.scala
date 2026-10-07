package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties {
  implicit lazy val comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties] = Json.format[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties]
}

