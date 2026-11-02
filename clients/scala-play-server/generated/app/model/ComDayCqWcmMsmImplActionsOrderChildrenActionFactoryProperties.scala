package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties {
  implicit lazy val comDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesJsonFormat: Format[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties] = Json.format[ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties]
}

