package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(
  processLabel: Option[ConfigNodePropertyString]
)

object ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {
  implicit lazy val comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesJsonFormat: Format[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties] = Json.format[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties]
}

