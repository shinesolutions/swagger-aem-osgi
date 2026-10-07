package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCommonsHandlerStandardImageHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCommonsHandlerStandardImageHandlerProperties(
  largeFileThreshold: Option[ConfigNodePropertyInteger],
  largeCommentThreshold: Option[ConfigNodePropertyInteger],
  cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
  implicit lazy val comDayCqDamCommonsHandlerStandardImageHandlerPropertiesJsonFormat: Format[ComDayCqDamCommonsHandlerStandardImageHandlerProperties] = Json.format[ComDayCqDamCommonsHandlerStandardImageHandlerProperties]
}

