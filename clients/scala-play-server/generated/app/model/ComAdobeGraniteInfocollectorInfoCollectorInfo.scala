package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteInfocollectorInfoCollectorInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteInfocollectorInfoCollectorInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteInfocollectorInfoCollectorProperties]
)

object ComAdobeGraniteInfocollectorInfoCollectorInfo {
  implicit lazy val comAdobeGraniteInfocollectorInfoCollectorInfoJsonFormat: Format[ComAdobeGraniteInfocollectorInfoCollectorInfo] = Json.format[ComAdobeGraniteInfocollectorInfoCollectorInfo]
}

