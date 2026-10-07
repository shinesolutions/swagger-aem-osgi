package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteInfocollectorInfoCollectorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteInfocollectorInfoCollectorProperties(
  graniteInfocollectorIncludeThreadDumps: Option[ConfigNodePropertyBoolean],
  graniteInfocollectorIncludeHeapDump: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteInfocollectorInfoCollectorProperties {
  implicit lazy val comAdobeGraniteInfocollectorInfoCollectorPropertiesJsonFormat: Format[ComAdobeGraniteInfocollectorInfoCollectorProperties] = Json.format[ComAdobeGraniteInfocollectorInfoCollectorProperties]
}

