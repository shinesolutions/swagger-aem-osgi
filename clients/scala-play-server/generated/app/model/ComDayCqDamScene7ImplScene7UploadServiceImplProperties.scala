package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7UploadServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7UploadServiceImplProperties(
  cqDamScene7UploadserviceActivejobtimeoutLabel: Option[ConfigNodePropertyInteger],
  cqDamScene7UploadserviceConnectionmaxperrouteLabel: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamScene7ImplScene7UploadServiceImplProperties {
  implicit lazy val comDayCqDamScene7ImplScene7UploadServiceImplPropertiesJsonFormat: Format[ComDayCqDamScene7ImplScene7UploadServiceImplProperties] = Json.format[ComDayCqDamScene7ImplScene7UploadServiceImplProperties]
}

