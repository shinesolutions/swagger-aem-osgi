package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingModelsImplModelAdapterFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingModelsImplModelAdapterFactoryProperties(
  osgiHttpWhiteboardListener: Option[ConfigNodePropertyString],
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString],
  maxRecursionDepth: Option[ConfigNodePropertyInteger],
  cleanupJobPeriod: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingModelsImplModelAdapterFactoryProperties {
  implicit lazy val orgApacheSlingModelsImplModelAdapterFactoryPropertiesJsonFormat: Format[OrgApacheSlingModelsImplModelAdapterFactoryProperties] = Json.format[OrgApacheSlingModelsImplModelAdapterFactoryProperties]
}

