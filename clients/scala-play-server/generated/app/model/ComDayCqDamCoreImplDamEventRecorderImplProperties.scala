package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplDamEventRecorderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplDamEventRecorderImplProperties(
  eventFilter: Option[ConfigNodePropertyString],
  eventQueueLength: Option[ConfigNodePropertyInteger],
  eventrecorderEnabled: Option[ConfigNodePropertyBoolean],
  eventrecorderBlacklist: Option[ConfigNodePropertyArray],
  eventrecorderEventtypes: Option[ConfigNodePropertyDropDown]
)

object ComDayCqDamCoreImplDamEventRecorderImplProperties {
  implicit lazy val comDayCqDamCoreImplDamEventRecorderImplPropertiesJsonFormat: Format[ComDayCqDamCoreImplDamEventRecorderImplProperties] = Json.format[ComDayCqDamCoreImplDamEventRecorderImplProperties]
}

