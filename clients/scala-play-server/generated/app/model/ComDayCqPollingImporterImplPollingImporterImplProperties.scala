package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqPollingImporterImplPollingImporterImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqPollingImporterImplPollingImporterImplProperties(
  importerMinInterval: Option[ConfigNodePropertyInteger],
  importerUser: Option[ConfigNodePropertyString],
  excludePaths: Option[ConfigNodePropertyArray],
  includePaths: Option[ConfigNodePropertyArray]
)

object ComDayCqPollingImporterImplPollingImporterImplProperties {
  implicit lazy val comDayCqPollingImporterImplPollingImporterImplPropertiesJsonFormat: Format[ComDayCqPollingImporterImplPollingImporterImplProperties] = Json.format[ComDayCqPollingImporterImplPollingImporterImplProperties]
}

