package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(
  isEnabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {
  implicit lazy val comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesJsonFormat: Format[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties] = Json.format[ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties]
}

