package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteFragsImplRandomFeatureInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteFragsImplRandomFeatureInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteFragsImplRandomFeatureProperties]
)

object ComAdobeGraniteFragsImplRandomFeatureInfo {
  implicit lazy val comAdobeGraniteFragsImplRandomFeatureInfoJsonFormat: Format[ComAdobeGraniteFragsImplRandomFeatureInfo] = Json.format[ComAdobeGraniteFragsImplRandomFeatureInfo]
}

