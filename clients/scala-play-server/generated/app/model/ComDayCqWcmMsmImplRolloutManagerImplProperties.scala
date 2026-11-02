package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplRolloutManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplRolloutManagerImplProperties(
  eventFilter: Option[ConfigNodePropertyString],
  rolloutmgrExcludedpropsDefault: Option[ConfigNodePropertyArray],
  rolloutmgrExcludedparagraphpropsDefault: Option[ConfigNodePropertyArray],
  rolloutmgrExcludednodetypesDefault: Option[ConfigNodePropertyArray],
  rolloutmgrThreadpoolMaxsize: Option[ConfigNodePropertyInteger],
  rolloutmgrThreadpoolMaxshutdowntime: Option[ConfigNodePropertyInteger],
  rolloutmgrThreadpoolPriority: Option[ConfigNodePropertyDropDown],
  rolloutmgrCommitSize: Option[ConfigNodePropertyInteger],
  rolloutmgrConflicthandlingEnabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWcmMsmImplRolloutManagerImplProperties {
  implicit lazy val comDayCqWcmMsmImplRolloutManagerImplPropertiesJsonFormat: Format[ComDayCqWcmMsmImplRolloutManagerImplProperties] = Json.format[ComDayCqWcmMsmImplRolloutManagerImplProperties]
}

