package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(
  featureName: Option[ConfigNodePropertyString],
  featureDescription: Option[ConfigNodePropertyString],
  httpHeaderName: Option[ConfigNodePropertyString],
  httpHeaderValuepattern: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
  implicit lazy val comAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesJsonFormat: Format[ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties] = Json.format[ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties]
}

