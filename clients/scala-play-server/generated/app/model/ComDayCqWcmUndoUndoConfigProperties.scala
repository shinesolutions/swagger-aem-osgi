package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmUndoUndoConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmUndoUndoConfigProperties(
  cqWcmUndoEnabled: Option[ConfigNodePropertyBoolean],
  cqWcmUndoPath: Option[ConfigNodePropertyString],
  cqWcmUndoValidity: Option[ConfigNodePropertyInteger],
  cqWcmUndoSteps: Option[ConfigNodePropertyInteger],
  cqWcmUndoPersistence: Option[ConfigNodePropertyString],
  cqWcmUndoPersistenceMode: Option[ConfigNodePropertyBoolean],
  cqWcmUndoMarkermode: Option[ConfigNodePropertyString],
  cqWcmUndoWhitelist: Option[ConfigNodePropertyArray],
  cqWcmUndoBlacklist: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmUndoUndoConfigProperties {
  implicit lazy val comDayCqWcmUndoUndoConfigPropertiesJsonFormat: Format[ComDayCqWcmUndoUndoConfigProperties] = Json.format[ComDayCqWcmUndoUndoConfigProperties]
}

