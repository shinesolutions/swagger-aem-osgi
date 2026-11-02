package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(
  supportedPaths: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
  implicit lazy val comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesJsonFormat: Format[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] = Json.format[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties]
}

