package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationFormsImplFormChooserServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationFormsImplFormChooserServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqWcmFoundationFormsImplFormChooserServletProperties]
)

object ComDayCqWcmFoundationFormsImplFormChooserServletInfo {
  implicit lazy val comDayCqWcmFoundationFormsImplFormChooserServletInfoJsonFormat: Format[ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = Json.format[ComDayCqWcmFoundationFormsImplFormChooserServletInfo]
}

