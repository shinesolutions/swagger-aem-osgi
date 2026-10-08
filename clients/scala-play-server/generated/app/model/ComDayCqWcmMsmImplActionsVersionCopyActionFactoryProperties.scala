package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties(
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties {
  implicit lazy val comDayCqWcmMsmImplActionsVersionCopyActionFactoryPropertiesJsonFormat: Format[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties] = Json.format[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties]
}

