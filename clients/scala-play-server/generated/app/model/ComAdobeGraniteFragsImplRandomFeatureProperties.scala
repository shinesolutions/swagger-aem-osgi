package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteFragsImplRandomFeatureProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteFragsImplRandomFeatureProperties(
  featureName: Option[ConfigNodePropertyString],
  featureDescription: Option[ConfigNodePropertyString],
  activePercentage: Option[ConfigNodePropertyString],
  cookieName: Option[ConfigNodePropertyString],
  cookieMaxAge: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteFragsImplRandomFeatureProperties {
  implicit lazy val comAdobeGraniteFragsImplRandomFeaturePropertiesJsonFormat: Format[ComAdobeGraniteFragsImplRandomFeatureProperties] = Json.format[ComAdobeGraniteFragsImplRandomFeatureProperties]
}

