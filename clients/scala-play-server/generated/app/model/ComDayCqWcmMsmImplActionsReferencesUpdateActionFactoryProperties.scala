package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(
  cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
  cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
  cqWcmMsmImplActionReferencesupdatePropUpdateNested: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {
  implicit lazy val comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesJsonFormat: Format[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties] = Json.format[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties]
}

