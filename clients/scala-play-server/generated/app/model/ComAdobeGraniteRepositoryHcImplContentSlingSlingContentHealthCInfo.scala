package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties]
)

object ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo {
  implicit lazy val comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoJsonFormat: Format[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo] = Json.format[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo]
}

