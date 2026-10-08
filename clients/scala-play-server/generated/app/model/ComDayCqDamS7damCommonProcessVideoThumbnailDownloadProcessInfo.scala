package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties]
)

object ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo {
  implicit lazy val comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoJsonFormat: Format[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo] = Json.format[ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo]
}

