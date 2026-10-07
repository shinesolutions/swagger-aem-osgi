package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties]
)

object ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo {
  implicit lazy val comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoJsonFormat: Format[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo] = Json.format[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo]
}

