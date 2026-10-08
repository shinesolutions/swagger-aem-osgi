package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(
  cqDamS7damDamchangeeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {
  implicit lazy val comDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesJsonFormat: Format[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties] = Json.format[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties]
}

