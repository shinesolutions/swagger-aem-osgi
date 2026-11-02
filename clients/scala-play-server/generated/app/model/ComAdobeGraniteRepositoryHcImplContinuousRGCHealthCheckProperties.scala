package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties {
  implicit lazy val comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties] = Json.format[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties]
}

