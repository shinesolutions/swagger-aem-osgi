package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCrxSecurityTokenImplTokenCleanupTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(
  enableTokenCleanupTask: Option[ConfigNodePropertyBoolean],
  schedulerExpression: Option[ConfigNodePropertyString],
  batchSize: Option[ConfigNodePropertyInteger]
)

object ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
  implicit lazy val comDayCrxSecurityTokenImplTokenCleanupTaskPropertiesJsonFormat: Format[ComDayCrxSecurityTokenImplTokenCleanupTaskProperties] = Json.format[ComDayCrxSecurityTokenImplTokenCleanupTaskProperties]
}

