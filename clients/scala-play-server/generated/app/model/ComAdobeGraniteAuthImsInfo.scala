package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthImsInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthImsInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteAuthImsProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComAdobeGraniteAuthImsInfo {
  implicit lazy val comAdobeGraniteAuthImsInfoJsonFormat: Format[ComAdobeGraniteAuthImsInfo] = Json.format[ComAdobeGraniteAuthImsInfo]
}

