package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
  contentcopyactionOrderStyle: Option[ConfigNodePropertyDropDown]
)

object ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {
  implicit lazy val comDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesJsonFormat: Format[ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties] = Json.format[ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties]
}

