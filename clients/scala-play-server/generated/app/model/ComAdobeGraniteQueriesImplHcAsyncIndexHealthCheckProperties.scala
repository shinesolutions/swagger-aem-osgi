package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(
  indexingCriticalThreshold: Option[ConfigNodePropertyInteger],
  indexingWarnThreshold: Option[ConfigNodePropertyInteger],
  hcTags: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {
  implicit lazy val comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties] = Json.format[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties]
}

