package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for guideLocalizationServiceInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class GuideLocalizationServiceInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[GuideLocalizationServiceProperties]
)

object GuideLocalizationServiceInfo {
  implicit lazy val guideLocalizationServiceInfoJsonFormat: Format[GuideLocalizationServiceInfo] = Json.format[GuideLocalizationServiceInfo]
}

