package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(
  createPreviewEnabled: Option[ConfigNodePropertyBoolean],
  updatePreviewEnabled: Option[ConfigNodePropertyBoolean],
  queueSize: Option[ConfigNodePropertyInteger],
  folderPreviewRenditionRegex: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
  implicit lazy val comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesJsonFormat: Format[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties] = Json.format[ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties]
}

