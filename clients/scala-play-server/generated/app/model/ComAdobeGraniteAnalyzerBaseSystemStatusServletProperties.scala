package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAnalyzerBaseSystemStatusServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(
  disabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties {
  implicit lazy val comAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesJsonFormat: Format[ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties] = Json.format[ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties]
}

