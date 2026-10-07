package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamInddProcessINDDMediaExtractProcessProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamInddProcessINDDMediaExtractProcessProperties(
  processLabel: Option[ConfigNodePropertyString],
  cqDamInddPagesRegex: Option[ConfigNodePropertyString],
  idsJobDecoupled: Option[ConfigNodePropertyBoolean],
  idsJobWorkflowModel: Option[ConfigNodePropertyString]
)

object ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
  implicit lazy val comDayCqDamInddProcessINDDMediaExtractProcessPropertiesJsonFormat: Format[ComDayCqDamInddProcessINDDMediaExtractProcessProperties] = Json.format[ComDayCqDamInddProcessINDDMediaExtractProcessProperties]
}

