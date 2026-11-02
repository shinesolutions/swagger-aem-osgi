package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessagingUserComponentFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MessagingUserComponentFactoryProperties(
  priority: Option[ConfigNodePropertyInteger]
)

object MessagingUserComponentFactoryProperties {
  implicit lazy val messagingUserComponentFactoryPropertiesJsonFormat: Format[MessagingUserComponentFactoryProperties] = Json.format[MessagingUserComponentFactoryProperties]
}

