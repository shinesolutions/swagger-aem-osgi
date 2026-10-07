package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
  cqWcmMsmImplActionsPagemovePropReferenceUpdate: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {
  implicit lazy val comDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesJsonFormat: Format[ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties] = Json.format[ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties]
}

