package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7UploadServiceImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7UploadServiceImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamScene7ImplScene7UploadServiceImplProperties]
)

object ComDayCqDamScene7ImplScene7UploadServiceImplInfo {
  implicit lazy val comDayCqDamScene7ImplScene7UploadServiceImplInfoJsonFormat: Format[ComDayCqDamScene7ImplScene7UploadServiceImplInfo] = Json.format[ComDayCqDamScene7ImplScene7UploadServiceImplInfo]
}

