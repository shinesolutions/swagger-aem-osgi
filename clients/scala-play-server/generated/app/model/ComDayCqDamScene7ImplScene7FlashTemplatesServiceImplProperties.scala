package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(
  scene7FlashTemplatesRti: Option[ConfigNodePropertyString],
  scene7FlashTemplatesRsi: Option[ConfigNodePropertyString],
  scene7FlashTemplatesRb: Option[ConfigNodePropertyString],
  scene7FlashTemplatesRurl: Option[ConfigNodePropertyString],
  scene7FlashTemplateUrlFormatParameter: Option[ConfigNodePropertyString]
)

object ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
  implicit lazy val comDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesJsonFormat: Format[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties] = Json.format[ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties]
}

