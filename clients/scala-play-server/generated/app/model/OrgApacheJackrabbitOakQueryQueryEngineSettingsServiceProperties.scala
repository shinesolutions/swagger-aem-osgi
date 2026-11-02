package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(
  queryLimitInMemory: Option[ConfigNodePropertyInteger],
  queryLimitReads: Option[ConfigNodePropertyInteger],
  queryFailTraversal: Option[ConfigNodePropertyBoolean],
  fastQuerySize: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {
  implicit lazy val orgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesJsonFormat: Format[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties] = Json.format[OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties]
}

