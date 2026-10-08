package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqPollingImporterImplManagedPollConfigImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqPollingImporterImplManagedPollConfigImplProperties(
  id: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  reference: Option[ConfigNodePropertyBoolean],
  interval: Option[ConfigNodePropertyInteger],
  expression: Option[ConfigNodePropertyString],
  source: Option[ConfigNodePropertyString],
  target: Option[ConfigNodePropertyString],
  login: Option[ConfigNodePropertyString],
  password: Option[ConfigNodePropertyString]
)

object ComDayCqPollingImporterImplManagedPollConfigImplProperties {
  implicit lazy val comDayCqPollingImporterImplManagedPollConfigImplPropertiesJsonFormat: Format[ComDayCqPollingImporterImplManagedPollConfigImplProperties] = Json.format[ComDayCqPollingImporterImplManagedPollConfigImplProperties]
}

