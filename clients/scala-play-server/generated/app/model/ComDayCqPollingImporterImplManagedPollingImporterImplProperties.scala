package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqPollingImporterImplManagedPollingImporterImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqPollingImporterImplManagedPollingImporterImplProperties(
  importerUser: Option[ConfigNodePropertyString]
)

object ComDayCqPollingImporterImplManagedPollingImporterImplProperties {
  implicit lazy val comDayCqPollingImporterImplManagedPollingImporterImplPropertiesJsonFormat: Format[ComDayCqPollingImporterImplManagedPollingImporterImplProperties] = Json.format[ComDayCqPollingImporterImplManagedPollingImporterImplProperties]
}

