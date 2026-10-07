package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(
  cqDamScene7ConfigurationeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {
  implicit lazy val comDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesJsonFormat: Format[ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties] = Json.format[ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties]
}

