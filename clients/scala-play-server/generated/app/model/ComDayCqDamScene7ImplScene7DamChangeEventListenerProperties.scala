package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(
  cqDamScene7DamchangeeventlistenerEnabled: Option[ConfigNodePropertyBoolean],
  cqDamScene7DamchangeeventlistenerObservedPaths: Option[ConfigNodePropertyArray]
)

object ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
  implicit lazy val comDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesJsonFormat: Format[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties] = Json.format[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties]
}

